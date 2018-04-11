package com.example.finalwapples;


import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class AddtoCart extends ActionBarActivity {

	public static final String DATABASE_NAME = "OrderApp";
	DatabaseHelper myDb;
	Button cancel, save, total;
	TextView WafflesName, CurrentPrice, TotalPrice;
	EditText quantity;
	ImageView picture;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_addto_cart);
		
		myDb = new DatabaseHelper(this, DATABASE_NAME, null,
				1);
		
		cancel = (Button) findViewById (R.id.button1);
		total = (Button) findViewById (R.id.button2);
		save = (Button) findViewById (R.id.button3);
		WafflesName = (TextView) findViewById (R.id.textView1);
		CurrentPrice = (TextView) findViewById (R.id.textView3);
		TotalPrice = (TextView) findViewById (R.id.textView5);
		quantity = (EditText) findViewById (R.id.editText1);
		picture = (ImageView) findViewById (R.id.imageView1);
		
		cancel.setOnClickListener(new cancel());
		total.setOnClickListener(new total());
		save.setOnClickListener(new save());
		
		Intent i = new Intent ();
		String getName = getIntent().getExtras().getString("order");
		String getPrice = getIntent().getExtras().getString("price");
		//String getPicture = getIntent().getExtras().getString("order");
		WafflesName.setText(getName.toString());
		CurrentPrice.setText(getPrice.toString());
		
	}
	class cancel implements Button.OnClickListener
	{
		public void onClick (View v)
		{
			Intent i = new Intent (AddtoCart.this, Waffles_Menu.class);
			startActivity(i);
			finish();
		}
	}
	class total implements Button.OnClickListener
	{
		public void onClick (View v)
		{
			Double Total = Double.parseDouble(CurrentPrice.getText().toString()) * Integer.parseInt(quantity.getText().toString());
			TotalPrice.setText(Total.toString());
		}
	}
	class save implements Button.OnClickListener
	{
		public void onClick (View v)
		{
			Boolean isInserted = myDb.waffledata(WafflesName.getText().toString(),quantity.getText().toString(), TotalPrice.getText().toString());
            if (isInserted) {
                Toast.makeText(AddtoCart.this, "Added!", Toast.LENGTH_LONG).show();
                Intent i = new Intent (AddtoCart.this, Waffles_Menu.class);
    			startActivity(i);
    			finish();
            }
            else {
                Toast.makeText(AddtoCart.this, "Failed to add", Toast.LENGTH_LONG).show();
            }
		}
	}
}
