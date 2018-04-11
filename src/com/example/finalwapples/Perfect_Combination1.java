package com.example.finalwapples;



import com.example.finalwapples.Perfect_Combination.hamandcheddar;
import com.example.finalwapples.Perfect_Combination.undo;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Perfect_Combination1 extends ActionBarActivity {

	Button chickenhamandcheddar, maplesyrupandfrenchbutter, bananahazelnut, hamandcreamcheese, chocolatehazelnut, strawberrypeanutbutter, chocobananapeanutbutter, blueberrycreamcheese, back, next;
	TextView chickenhamandcheddar1, maplesyrupandfrenchbutter1, bananahazelnut1, hamandcreamcheese1, chocolatehazelnut1, strawberrypeanutbutter1, chocobananapeanutbutter1, blueberrycreamcheese1;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_perfect__combination1);
		chickenhamandcheddar1 = (TextView) findViewById(R.id.TextView1);
		maplesyrupandfrenchbutter1 = (TextView) findViewById(R.id.TextView3);
		bananahazelnut1 = (TextView) findViewById(R.id.TextView5);
		hamandcreamcheese1 = (TextView) findViewById(R.id.TextView7);
		chocolatehazelnut1 = (TextView) findViewById(R.id.TextView9);
		strawberrypeanutbutter1 = (TextView) findViewById(R.id.TextView11);
		chocobananapeanutbutter1 = (TextView) findViewById(R.id.TextView13);
		blueberrycreamcheese1 = (TextView) findViewById(R.id.sasasa);
		
		chickenhamandcheddar = (Button) findViewById(R.id.button1);
		maplesyrupandfrenchbutter = (Button) findViewById(R.id.button2);
		bananahazelnut = (Button) findViewById(R.id.button3);
		hamandcreamcheese = (Button) findViewById(R.id.button4);
		chocolatehazelnut = (Button) findViewById(R.id.button5);
		strawberrypeanutbutter = (Button) findViewById(R.id.button6);
		chocobananapeanutbutter = (Button) findViewById(R.id.button7);
		blueberrycreamcheese = (Button) findViewById(R.id.button8);
		back = (Button) findViewById(R.id.button9);
		next = (Button) findViewById(R.id.button10);
		
		chickenhamandcheddar.setOnClickListener(new chickenhamandcheddar());
		maplesyrupandfrenchbutter.setOnClickListener(new maplesyrupandfrenchbutter());
		bananahazelnut.setOnClickListener(new bananahazelnut());
		hamandcreamcheese.setOnClickListener(new hamandcreamcheese());
		chocolatehazelnut.setOnClickListener(new chocolatehazelnut());
		strawberrypeanutbutter.setOnClickListener(new strawberrypeanutbutter());
		chocobananapeanutbutter.setOnClickListener(new chocobananapeanutbutter());
		blueberrycreamcheese.setOnClickListener(new blueberrycreamcheese());
		back.setOnClickListener(new back());
		next.setOnClickListener(new next());
	}
	class chickenhamandcheddar implements Button.OnClickListener
	{
		public void onClick (View v)
		{
			Intent i = new Intent (Perfect_Combination1.this, AddtoCart.class);
			String a = chickenhamandcheddar1.getText().toString();
			String price = "45.00";
			i.putExtra("price", price);
			i.putExtra("order", a);
			startActivity(i);
			finish();
		}
	}
	class maplesyrupandfrenchbutter implements Button.OnClickListener
	{
		public void onClick (View v)
		{
			Intent i = new Intent (Perfect_Combination1.this, AddtoCart.class);
			String a = maplesyrupandfrenchbutter1.getText().toString();
			String price = "45.00";
			i.putExtra("price", price);
			i.putExtra("order", a);
			startActivity(i);
			finish();
		}
	}
	class bananahazelnut implements Button.OnClickListener
	{
		public void onClick (View v)
		{
			Intent i = new Intent (Perfect_Combination1.this, AddtoCart.class);
			String a = bananahazelnut1.getText().toString();
			String price = "55.00";
			i.putExtra("price", price);
			i.putExtra("order", a);
			startActivity(i);
			finish();
		}
	}
	class hamandcreamcheese implements Button.OnClickListener
	{
		public void onClick (View v)
		{
			Intent i = new Intent (Perfect_Combination1.this, AddtoCart.class);
			String a = hamandcreamcheese1.getText().toString();
			String price = "55.00";
			i.putExtra("price", price);
			i.putExtra("order", a);
			startActivity(i);
			finish();
		}
	}
	class chocolatehazelnut implements Button.OnClickListener
	{
		public void onClick (View v)
		{
			Intent i = new Intent (Perfect_Combination1.this, AddtoCart.class);
			String a = chocolatehazelnut1.getText().toString();
			String price = "55.00";
			i.putExtra("price", price);
			i.putExtra("order", a);
			startActivity(i);
			finish();
		}
	}
	class strawberrypeanutbutter implements Button.OnClickListener
	{
		public void onClick (View v)
		{
			Intent i = new Intent (Perfect_Combination1.this, AddtoCart.class);
			String a = strawberrypeanutbutter1.getText().toString();
			String price = "55.00";
			i.putExtra("price", price);
			i.putExtra("order", a);
			startActivity(i);
			finish();
		}
	}
	class chocobananapeanutbutter implements Button.OnClickListener
	{
		public void onClick (View v)
		{
			Intent i = new Intent (Perfect_Combination1.this, AddtoCart.class);
			String a = chocobananapeanutbutter1.getText().toString();
			String price = "55.00";
			i.putExtra("price", price);
			i.putExtra("order", a);
			startActivity(i);
			finish();
		}
	}
	class blueberrycreamcheese implements Button.OnClickListener
	{
		public void onClick (View v)
		{
			Intent i = new Intent (Perfect_Combination1.this, AddtoCart.class);
			String a = blueberrycreamcheese1.getText().toString();
			String price = "55.00";
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
			Intent i = new Intent (Perfect_Combination1.this, Perfect_Combination2.class);
			startActivity(i);
			finish();
		}
	}
	class back implements Button.OnClickListener
	{
		public void onClick (View v)
		{
			Intent i = new Intent (Perfect_Combination1.this, Perfect_Combination.class);
			startActivity(i);
			finish();
		}
	}
}
