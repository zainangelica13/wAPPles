package com.example.finalwapples;


import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Simply_Perfect extends ActionBarActivity {

	Button plain, chocolate, cheddar, peanut, blue, cream, hazel, straw, back, next;
	TextView plain1, chocolate1, cheddar1, peanut1, blue1, cream1, hazel1, straw1;
	ImageView plainn, chocolaten, cheddarn, peanutn, bluen, creamn, hazeln, strawn;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_simply__perfect);
		plain1 = (TextView) findViewById(R.id.TextView1);
		chocolate1 = (TextView) findViewById(R.id.TextView3);
		cheddar1 = (TextView) findViewById(R.id.TextView5);
		peanut1 = (TextView) findViewById(R.id.TextView7);
		blue1 = (TextView) findViewById(R.id.TextView9);
		cream1 = (TextView) findViewById(R.id.TextView11);
		hazel1 = (TextView) findViewById(R.id.TextView13);
		straw1 = (TextView) findViewById(R.id.strawberry);
	
		
		plain = (Button) findViewById(R.id.button1);
		chocolate = (Button) findViewById(R.id.button2);
		cheddar = (Button) findViewById(R.id.button3);
		peanut = (Button) findViewById(R.id.button4);
		blue = (Button) findViewById(R.id.button5);
		cream = (Button) findViewById(R.id.button6);
		hazel = (Button) findViewById(R.id.button7);
		straw = (Button) findViewById(R.id.button8);
		back = (Button) findViewById(R.id.button9);
		
		plain.setOnClickListener(new plain());
		chocolate.setOnClickListener(new chocolate());
		cheddar.setOnClickListener(new cheddar());
		peanut.setOnClickListener(new peanut());
		blue.setOnClickListener(new blue());
		cream.setOnClickListener(new cream());
		hazel.setOnClickListener(new hazel());
		straw.setOnClickListener(new straw());
		back.setOnClickListener(new back());
		
	}
	
	
	class plain implements Button.OnClickListener
	{
		public void onClick (View v)
		{
			Intent i = new Intent (Simply_Perfect.this, AddtoCart.class);
			String a = plain1.getText().toString();
			String price = "30.00";
			i.putExtra("order", a);
			i.putExtra("price", price);
			startActivity(i);
			finish();
		}
	}
	class chocolate implements Button.OnClickListener
	{
		public void onClick (View v)
		{
			Intent i = new Intent (Simply_Perfect.this, AddtoCart.class);
			String a = chocolate1.getText().toString();
			String price = "35.00";
			i.putExtra("price", price);
			i.putExtra("order", a);
			startActivity(i);
			finish();
		}
	}
	class cheddar implements Button.OnClickListener
	{
		public void onClick (View v)
		{
			Intent i = new Intent (Simply_Perfect.this, AddtoCart.class);
			String a = cheddar1.getText().toString();
			String price = "35.00";
			i.putExtra("price", price);
			i.putExtra("order", a);
			startActivity(i);
			finish();
		}
	}
	class peanut implements Button.OnClickListener
	{
		public void onClick (View v)
		{
			Intent i = new Intent (Simply_Perfect.this, AddtoCart.class);
			String a = peanut1.getText().toString();
			String price = "35.00";
			i.putExtra("price", price);
			i.putExtra("order", a);
			startActivity(i);
			finish();
		}
	}
	class blue implements Button.OnClickListener
	{
		public void onClick (View v)
		{
			Intent i = new Intent (Simply_Perfect.this, AddtoCart.class);
			String a = blue1.getText().toString();
			String price = "45.00";
			i.putExtra("price", price);
			i.putExtra("order", a);
			startActivity(i);
			finish();
		}
	}
	class cream implements Button.OnClickListener
	{
		public void onClick (View v)
		{
			Intent i = new Intent (Simply_Perfect.this, AddtoCart.class);
			String a = cream1.getText().toString();
			String price = "45.00";
			i.putExtra("price", price);
			i.putExtra("order", a);
			startActivity(i);
			finish();
		}
	}
	class hazel implements Button.OnClickListener
	{
		public void onClick (View v)
		{
			Intent i = new Intent (Simply_Perfect.this, AddtoCart.class);
			String a = hazel1.getText().toString();
			String price = "45.00";
			i.putExtra("price", price);
			i.putExtra("order", a);
			startActivity(i);
			finish();
		}
	}
	class straw implements Button.OnClickListener
	{
		public void onClick (View v)
		{
			Intent i = new Intent (Simply_Perfect.this, AddtoCart.class);
			String a = straw1.getText().toString();
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
			Intent i = new Intent (Simply_Perfect.this, Waffles_Menu.class);
			startActivity(i);
			finish();
		}
	}
		
}
