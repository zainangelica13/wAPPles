package com.example.finalwapples;


import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Perfect_Combination2 extends ActionBarActivity {

	Button strawberrycreamcheese, chickenhamandcreamcheese,back;
	TextView strawberrycreamcheese1, chickenhamandcreamcheese1;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_perfect__combination2);
		strawberrycreamcheese1 = (TextView) findViewById(R.id.TextView1);
		chickenhamandcreamcheese1 = (TextView) findViewById(R.id.TextView3);
		
		strawberrycreamcheese = (Button) findViewById(R.id.button1);
		chickenhamandcreamcheese = (Button) findViewById(R.id.button2);
		back = (Button) findViewById(R.id.button9);
		
		strawberrycreamcheese.setOnClickListener(new strawberrycreamcheese());
		chickenhamandcreamcheese.setOnClickListener(new chickenhamandcreamcheese());
		back.setOnClickListener(new back());
	}
	class strawberrycreamcheese implements Button.OnClickListener
	{
		public void onClick (View v)
		{
			Intent i = new Intent (Perfect_Combination2.this, AddtoCart.class);
			String a = strawberrycreamcheese1.getText().toString();
			String price = "55.00";
			i.putExtra("price", price);
			i.putExtra("order", a);
			startActivity(i);
			finish();
		}
	}
	class chickenhamandcreamcheese implements Button.OnClickListener
	{
		public void onClick (View v)
		{
			Intent i = new Intent (Perfect_Combination2.this, AddtoCart.class);
			String a = chickenhamandcreamcheese1.getText().toString();
			String price = "55.00";
			i.putExtra("price", price);
			i.putExtra("order", a);
			startActivity(i);
			finish();
		}
	}
	class back implements Button.OnClickListener
	{
		public void onClick (View v)
		{
			Intent i = new Intent (Perfect_Combination2.this, Perfect_Combination1.class);
			startActivity(i);
			finish();
		}
	}
}
