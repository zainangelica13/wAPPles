package com.example.finalwapples;


import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Cold_Drinks extends ActionBarActivity {

	Button Coffee, Strong, Sugar, Choco, Milktea, Brewed, back;
	TextView Coffee1, Strong1, Sugar1, Choco1, Milktea1, Brewed1;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_cold__drinks);
		Coffee1 = (TextView) findViewById(R.id.TextView1);
		Strong1 = (TextView) findViewById(R.id.TextView3);
		Sugar1 = (TextView) findViewById(R.id.TextView5);
		Choco1 = (TextView) findViewById(R.id.TextView7);
		Milktea1 = (TextView) findViewById(R.id.TextView9);
		Brewed1 = (TextView) findViewById(R.id.TextView11);
		
		Coffee = (Button) findViewById(R.id.button1);
		Strong = (Button) findViewById(R.id.button2);
		Sugar = (Button) findViewById(R.id.button3);
		Choco = (Button) findViewById(R.id.button4);
		Milktea = (Button) findViewById(R.id.button5);
		Brewed = (Button) findViewById(R.id.button6);
		back = (Button) findViewById(R.id.button9);
		
		Coffee.setOnClickListener(new Coffee());
		Strong.setOnClickListener(new Strong());
		Sugar.setOnClickListener(new Sugar());
		Choco.setOnClickListener(new Choco());
		Milktea.setOnClickListener(new Milktea());
		Brewed.setOnClickListener(new Brewed());
		back.setOnClickListener(new back());
	}
	class Coffee implements Button.OnClickListener
	{
		public void onClick (View v)
		{
			Intent i = new Intent (Cold_Drinks.this, AddtoCart.class);
			String a = Coffee1.getText().toString();
			String price = "55.00";
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
			Intent i = new Intent (Cold_Drinks.this, AddtoCart.class);
			String a = Strong1.getText().toString();
			String price = "55.00";
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
			Intent i = new Intent (Cold_Drinks.this, AddtoCart.class);
			String a = Sugar1.getText().toString();
			String price = "55.00";
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
			Intent i = new Intent (Cold_Drinks.this, AddtoCart.class);
			String a = Choco1.getText().toString();
			String price = "55.00";
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
			Intent i = new Intent (Cold_Drinks.this, AddtoCart.class);
			String a = Milktea1.getText().toString();
			String price = "55.00";
			i.putExtra("price", price);
			i.putExtra("order", a);
			startActivity(i);
			finish();
		}
	}
	class Brewed implements Button.OnClickListener
	{
		public void onClick (View v)
		{
			Intent i = new Intent (Cold_Drinks.this, AddtoCart.class);
			String a = Brewed1.getText().toString();
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
			Intent i = new Intent (Cold_Drinks.this, Waffles_Menu.class);
			startActivity(i);
			finish();
		}
	}
}
