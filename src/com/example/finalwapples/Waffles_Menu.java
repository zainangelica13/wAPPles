package com.example.finalwapples;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class Waffles_Menu extends ActionBarActivity {

	
	Button simplyperfect, perfectcombination, hotdrinks, colddrinks, back;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_waffles__menu);
		
		simplyperfect = (Button) findViewById (R.id.button1);
		perfectcombination = (Button) findViewById (R.id.button2);
		hotdrinks = (Button) findViewById (R.id.button3);
		colddrinks = (Button) findViewById (R.id.button4);
		back = (Button) findViewById (R.id.button5);
		back.setOnClickListener(new back());
		simplyperfect.setOnClickListener(new simplyperfect());
		perfectcombination.setOnClickListener(new perfectcombination());
		hotdrinks.setOnClickListener(new hotdrinks());
		colddrinks.setOnClickListener(new colddrinks());
	}
	class back implements Button.OnClickListener
	{
		public void onClick (View v)
		{
			Intent i = new Intent (Waffles_Menu.this, Home.class);
			startActivity(i);
			finish();
		}
	}
	class simplyperfect implements Button.OnClickListener
	{
		public void onClick (View v)
		{
			Intent i = new Intent (Waffles_Menu.this, Simply_Perfect.class);
			startActivity(i);
			finish();
		}
	}
	class perfectcombination implements Button.OnClickListener
	{
		public void onClick (View v)
		{
			Intent i = new Intent (Waffles_Menu.this, Perfect_Combination.class);
			startActivity(i);
			finish();
		}
	}
	class hotdrinks implements Button.OnClickListener
	{
		public void onClick (View v)
		{
			Intent i = new Intent (Waffles_Menu.this, Hot_Drinks.class);
			startActivity(i);
			finish();
		}
	}
	class colddrinks implements Button.OnClickListener
	{
		public void onClick (View v)
		{
			Intent i = new Intent (Waffles_Menu.this, Cold_Drinks.class);
			startActivity(i);
			finish();
		}
	}
}
