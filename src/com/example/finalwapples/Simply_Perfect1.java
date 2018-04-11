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

public class Simply_Perfect1 extends ActionBarActivity {

	Button blue, cream, hazel, straw, back, next;
	TextView blue1, cream1, hazel1, straw1;
	ImageView bluen, creamn, hazeln, strawn;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_simply__perfect1);
		blue1 = (TextView) findViewById(R.id.TextView9);
		cream1 = (TextView) findViewById(R.id.TextView11);
		hazel1 = (TextView) findViewById(R.id.TextView13);
		straw1 = (TextView) findViewById(R.id.textView1);
		
		blue = (Button) findViewById(R.id.button5);
		cream = (Button) findViewById(R.id.button6);
		hazel = (Button) findViewById(R.id.button7);
		straw = (Button) findViewById(R.id.button8);
		back = (Button) findViewById(R.id.button9);
		
		blue.setOnClickListener(new blue());
		cream.setOnClickListener(new cream());
		hazel.setOnClickListener(new hazel());
		straw.setOnClickListener(new straw());
		back.setOnClickListener(new back());
	}
	
	class blue implements Button.OnClickListener
	{
		public void onClick (View v)
		{
			Intent i = new Intent (Simply_Perfect1.this, AddtoCart.class);
			String a = blue1.toString();
			i.putExtra("order", a);
			startActivity(i);
		}
	}
	class cream implements Button.OnClickListener
	{
		public void onClick (View v)
		{
			Intent i = new Intent (Simply_Perfect1.this, AddtoCart.class);
			String a = cream1.toString();
			i.putExtra("order", a);
			startActivity(i);
		}
	}
	class hazel implements Button.OnClickListener
	{
		public void onClick (View v)
		{
			Intent i = new Intent (Simply_Perfect1.this, AddtoCart.class);
			String a = hazel1.toString();
			i.putExtra("order", a);
			startActivity(i);
		}
	}
	class straw implements Button.OnClickListener
	{
		public void onClick (View v)
		{
			Intent i = new Intent (Simply_Perfect1.this, AddtoCart.class);
			String a = straw1.toString();
			i.putExtra("order", a);
			startActivity(i);
		}
	}
	class back implements Button.OnClickListener
	{
		public void onClick (View v)
		{
			Intent i = new Intent (Simply_Perfect1.this, Simply_Perfect.class);
			startActivity(i);
		}
	}
}
