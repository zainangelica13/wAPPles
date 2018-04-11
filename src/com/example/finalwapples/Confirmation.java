package com.example.finalwapples;


import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Confirmation extends ActionBarActivity {

	 public static final String DATABASE_NAME = "OrderApp";

	Button PlaceOrder;
	TextView Name, Email, Contact;
	EditText Address;
	DatabaseHelper myDb;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_confirmation);
		
		
		myDb = new DatabaseHelper(this, DATABASE_NAME, null,
				1);
		
		PlaceOrder = (Button) findViewById (R.id.button1);
		Name = (EditText) findViewById (R.id.editText2);
		Email =(EditText) findViewById (R.id.editText3);
		Contact = (EditText) findViewById (R.id.editText4);
		Address = (EditText) findViewById (R.id.editText1);
		
		PlaceOrder.setOnClickListener(new Order());
		Name.setText(Globals.name);
		Email.setText(Globals.email);
		Contact.setText(Globals.cn);

		
	}
	class Order implements Button.OnClickListener
	{
		public void onClick (View v)
		{
			String a, b, c, d;
			a = Name.getText().toString();
			b = Address.getText().toString();
			c = Contact.getText().toString();
			d = Email.getText().toString();
				if (a.length() == 0 || b.length() == 0 || c.length() == 0 || d.length() == 0)
				{
					Toast.makeText(Confirmation.this, "Some field are empty!", Toast.LENGTH_LONG).show();
				}
				else
				{
					Boolean isInserted = myDb.addressacc(b.toString());
					if (isInserted) {
						Toast.makeText(Confirmation.this, "Saved!", Toast.LENGTH_LONG).show();
						myDb.getAllData();
						Cursor res = myDb.getAllData();
						
						StringBuffer buffer = new StringBuffer();
						while (res.moveToNext()){
							buffer.append(" Waffles name: " + res.getString(1)+ ", ");
							buffer.append("Quantity: " + res.getString(2)+ ", ");
							buffer.append("Price: " + res.getString(3)+ "");
						}
						String get = buffer.toString();
						
						
						String subject = "", body="", chooserTitle="";
						body = "" + a + " ordered " + get + ". Address is " + b + ", Contact Number is " + c + " and Email Address is " + d + ".";
						subject = "Ordered by wAPPles";
					    Intent mailIntent = new Intent();
					    mailIntent.setAction(Intent.ACTION_SEND);
					    mailIntent.setType("message/rfc822");
					    mailIntent.putExtra(Intent.EXTRA_EMAIL, new String[] {"angelicarioflorido388@yahoo.com"});
					    mailIntent.putExtra(Intent.EXTRA_SUBJECT, subject);
					    mailIntent.putExtra(Intent.EXTRA_TEXT, body);
					    startActivity(Intent.createChooser(mailIntent, chooserTitle));
					    finish();
					}
					else {
						Toast.makeText(Confirmation.this, "Failed to Save", Toast.LENGTH_LONG).show();
					}
				}
		}
	}
	
	
}
