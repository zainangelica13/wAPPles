package com.example.finalwapples;


import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Hot_Drinks extends ActionBarActivity {

	Button Coffee, Strong, Sugar, Choco, Milktea,back;
	TextView Coffee1, Strong1, Sugar1, Choco1, Milktea1;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_hot__drinks);
		Coffee1 = (TextView) findViewById(R.id.TextView1);
		Strong1 = (TextView) findViewById(R.id.TextView3);
		Sugar1 = (TextView) findViewById(R.id.TextView5);
		Choco1 = (TextView) findViewById(R.id.TextView7);
		Milktea1 = (TextView) findViewById(R.id.TextView9);
		
		Coffee = (Button) findViewById(R.id.button1);
		Strong = (Button) findViewById(R.id.button2);
		Sugar = (Button) findViewById(R.id.button3);
		Choco = (Button) findViewById(R.id.button4);
		Milktea = (Button) findViewById(R.id.button5);
		back = (Button) findViewById(R.id.button9);
		
		Coffee.setOnClickListener(new Coffee());
		Strong.setOnClickListener(new Strong());
		Sugar.setOnClickListener(new Sugar());
		Choco.setOnClickListener(new Choco());
		Milktea.setOnClickListener(new Milktea());
		back.setOnClickListener(new back());
	}
	class Coffee implements Button.OnClickListener
	{
		public void onClick (View v)
		{
			Intent i = new Intent (Hot_Drinks.this, AddtoCart.class);
			String a = Coffee1.getText().toString();
			String price = "45.00";
			i.putExtra("price", price);
			i.putExtra("order", a);
			startActivity(i);
			finish();
		}
	}
	class Strong implements Button.OnClickListener
	{
		public void onClick (View v)
		{
			Intent i = new Intent (Hot_Drinks.this, AddtoCart.class);
			String a = Strong1.getText().toString();
			String price = "45.00";
			i.putExtra("price", price);
			i.putExtra("order", a);
			startActivity(i);
			finish();
		}
	}
	class Sugar implements Button.OnClickListener
	{
		public void onClick (View v)
		{
			Intent i = new Intent (Hot_Drinks.this, AddtoCart.class);
			String a = Sugar1.getText().toString();
			String price = "45.00";
			i.putExtra("price", price);
			i.putExtra("order", a);
			startActivity(i);
			finish();
		}
	}
	class Choco implements Button.OnClickListener
	{
		public void onClick (View v)
		{
			Intent i = new Intent (Hot_Drinks.this, AddtoCart.class);
			String a = Choco1.getText().toString();
			String price = "45.00";
			i.putExtra("price", price);
			i.putExtra("order", a);
			startActivity(i);
			finish();
		}
	}
	class Milktea implements Button.OnClickListener
	{
		public void onClick (View v)
		{
			Intent i = new Intent (Hot_Drinks.this, AddtoCart.class);
			String a = Milktea1.getText().toString();
			String price = "45.00";
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
			Intent i = new Intent (Hot_Drinks.this, Waffles_Menu.class);
			startActivity(i);
			finish();
		}
	}
}
