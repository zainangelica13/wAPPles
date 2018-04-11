package com.example.finalwapples;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Perfect_Combination extends ActionBarActivity {

	Button hamandcheddar, bananachocolate, chocolatepeanutbutter, bananapeanutbutter, bananacaramel, buttercaramel, magopeach, tunaandgarlicranch, next,back;
	TextView hamandcheddar1, bananachocolate1, chocolatepeanutbutter1, bananapeanutbutter1, bananacaramel1, buttercaramel1, magopeach1, tunaandgarlicranch1;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_perfect__combination);
		hamandcheddar1 = (TextView) findViewById(R.id.TextView1);
		bananachocolate1 = (TextView) findViewById(R.id.TextView3);
		chocolatepeanutbutter1 = (TextView) findViewById(R.id.TextView5);
		bananapeanutbutter1 = (TextView) findViewById(R.id.TextView7);
		bananacaramel1 = (TextView) findViewById(R.id.TextView9);
		buttercaramel1 = (TextView) findViewById(R.id.TextView11);
		magopeach1 = (TextView) findViewById(R.id.TextView13);
		tunaandgarlicranch1 = (TextView) findViewById(R.id.sasasa);
		
		
		hamandcheddar = (Button) findViewById(R.id.button1);
		bananachocolate = (Button) findViewById(R.id.button2);
		chocolatepeanutbutter = (Button) findViewById(R.id.button3);
		bananapeanutbutter = (Button) findViewById(R.id.button4);
		bananacaramel = (Button) findViewById(R.id.button5);
		buttercaramel = (Button) findViewById(R.id.button6);
		magopeach = (Button) findViewById(R.id.button7);
		tunaandgarlicranch = (Button) findViewById(R.id.button8);
		next = (Button) findViewById(R.id.button9);
		
		
		hamandcheddar.setOnClickListener(new hamandcheddar());
		bananachocolate.setOnClickListener(new bananachocolate());
		chocolatepeanutbutter.setOnClickListener(new chocolatepeanutbutter());
		bananapeanutbutter.setOnClickListener(new bananapeanutbutter());
		bananacaramel.setOnClickListener(new bananacaramel());
		buttercaramel.setOnClickListener(new buttercaramel());
		magopeach.setOnClickListener(new magopeach());
		tunaandgarlicranch.setOnClickListener(new tunaandgarlicranch());
		next.setOnClickListener(new next());
		back = (Button) findViewById(R.id.back);
		back.setOnClickListener(new undo());
	}
	class undo implements Button.OnClickListener
	{
		public void onClick (View v)
		{
			Intent i = new Intent (Perfect_Combination.this, Waffles_Menu.class);
			startActivity(i);
			finish();
		}
	}
	class hamandcheddar implements Button.OnClickListener
	{
		public void onClick (View v)
		{
			Intent i = new Intent (Perfect_Combination.this, AddtoCart.class);
			String a = hamandcheddar1.getText().toString();
			String price = "45.00";
			i.putExtra("price", price);
			i.putExtra("order", a);
			startActivity(i);
			finish();
		}
	}
	class bananachocolate implements Button.OnClickListener
	{
		public void onClick (View v)
		{
			Intent i = new Intent (Perfect_Combination.this, AddtoCart.class);
			String a = bananachocolate1.getText().toString();
			String price = "45.00";
			i.putExtra("price", price);
			i.putExtra("order", a);
			startActivity(i);
			finish();
		}
	}
	class chocolatepeanutbutter implements Button.OnClickListener
	{
		public void onClick (View v)
		{
			Intent i = new Intent (Perfect_Combination.this, AddtoCart.class);
			String a = chocolatepeanutbutter1.getText().toString();
			String price = "45.00";
			i.putExtra("price", price);
			i.putExtra("order", a);
			startActivity(i);
			finish();
		}
	}
	class bananapeanutbutter implements Button.OnClickListener
	{
		public void onClick (View v)
		{
			Intent i = new Intent (Perfect_Combination.this, AddtoCart.class);
			String a = bananapeanutbutter1.getText().toString();
			String price = "45.00";
			i.putExtra("price", price);
			i.putExtra("order", a);
			startActivity(i);
			finish();
		}
	}
	class bananacaramel implements Button.OnClickListener
	{
		public void onClick (View v)
		{
			Intent i = new Intent (Perfect_Combination.this, AddtoCart.class);
			String a = bananacaramel1.getText().toString();
			String price = "45.00";
			i.putExtra("price", price);
			i.putExtra("order", a);
			startActivity(i);
			finish();
		}
	}
	class buttercaramel implements Button.OnClickListener
	{
		public void onClick (View v)
		{
			Intent i = new Intent (Perfect_Combination.this, AddtoCart.class);
			String a = buttercaramel1.getText().toString();
			String price = "45.00";
			i.putExtra("price", price);
			i.putExtra("order", a);
			startActivity(i);
			finish();
		}
	}
	class magopeach implements Button.OnClickListener
	{
		public void onClick (View v)
		{
			Intent i = new Intent (Perfect_Combination.this, AddtoCart.class);
			String a = magopeach1.getText().toString();
			String price = "45.00";
			i.putExtra("price", price);
			i.putExtra("order", a);
			startActivity(i);
			finish();
		}
	}
	class tunaandgarlicranch implements Button.OnClickListener
	{
		public void onClick (View v)
		{
			Intent i = new Intent (Perfect_Combination.this, AddtoCart.class);
			String a = tunaandgarlicranch1.getText().toString();
			String price = "45.00";
			i.putExtra("price", price);
			i.putExtra("order", a);
			startActivity(i);
			finish();
		}
	}
	class next implements Button.OnClickListener
	{
		public void onClick (View v)
		{
			Intent i = new Intent (Perfect_Combination.this, Perfect_Combination1.class);
			startActivity(i);
			finish();
		}
	}
}
