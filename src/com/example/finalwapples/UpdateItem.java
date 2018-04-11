package com.example.finalwapples;


import android.support.v7.app.ActionBarActivity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.MenuItem.OnMenuItemClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class UpdateItem extends ActionBarActivity {

	private long rowID;
	DatabaseHelper myDb;
	Button update, delete;
	EditText Orderno, Quantity;
	TextView WafflesName, Price;
	public static final String ROW_ID = "Order_No";
	private static final String TITLE = "Name";
	private static final String NOTE = "Quantity";
	private static final String PRICE = "Price";
	SQLiteListAdapter ListAdapter ;

		@Override
		public void onCreate(Bundle savedInstanceState) {
			super.onCreate(savedInstanceState);
			setContentView(R.layout.activity_update_item);

			update = (Button)findViewById (R.id.button3);
			delete = (Button)findViewById (R.id.button4);
			Orderno = (EditText) findViewById (R.id.editText1);
			Quantity = (EditText) findViewById (R.id.editText2);
			WafflesName = (TextView) findViewById (R.id.textView1);
			Price = (TextView) findViewById (R.id.textView2);
			
			update.setOnClickListener(new update());
			
			Intent i = new Intent();
			String id = getIntent().getExtras().getString("ROW_ID");
			String name = getIntent().getExtras().getString("TITLE");
			String qty = getIntent().getExtras().getString("NOTE");
			String pr = getIntent().getExtras().getString("PRICE");
			Orderno.setText(id);
			Quantity.setText(qty);
			WafflesName.setText(name);
			Price.setText(qty);

			/*String a;
	        a=Orderno.getText().toString();
	        boolean del = myDb.searchwaffle(Orderno.getText().toString());
	            if (del)
	            {
	            	int total;
	    			String total1;
	    			if (WafflesName.getText().toString() == "Plain")
	    			{
	    				total = Integer.parseInt(Quantity.toString()) * 30;
	    				Price.setText(total);
	    			}
	    			else if (WafflesName.getText().toString() == "Chocolate" || WafflesName.getText().toString() == "Cheddar Cheese" || WafflesName.getText().toString() == "Peanut Butter" )
	    			{
	    				total = Integer.parseInt(Quantity.toString()) * 35;
	    				Price.setText(total);
	    			}
	    			else if (WafflesName.getText().toString() == "Blueberry" || WafflesName.getText().toString() == "Cream Cheese" || WafflesName.getText().toString() == "Hazelnut" ||
	    					WafflesName.getText().toString() == "Strawberry" || WafflesName.getText().toString() == "Ham and Cheddar" || WafflesName.getText().toString() == "Banana Chocolate" ||
	    					WafflesName.getText().toString() == "Choco Peanut Butter" || WafflesName.getText().toString() == "Banana Peanut Butter" || WafflesName.getText().toString() == "Banana Caramel" ||
	    					WafflesName.getText().toString() == "Butter Caramel" || WafflesName.getText().toString() == "Mango Peach" || WafflesName.getText().toString() == "Tuna and Garlic Ranch" ||
	    					WafflesName.getText().toString() == "Chicken Ham and Cheddar" || WafflesName.getText().toString() == "Maple Syrup and French Butter" || WafflesName.getText().toString() == "Malaysian Coffee" ||
	    					WafflesName.getText().toString() == "Malaysian Strong Coffee" || WafflesName.getText().toString() == "Malaysian No Sugar Coffee" || WafflesName.getText().toString() == "Malaysian Hot Choco" || 
	    					WafflesName.getText().toString() == "Malaysian Hot Milktea" || WafflesName.getText().toString() == "Boston Brewed Iced Tea" )
	    			{
	    				total = Integer.parseInt(Quantity.toString()) * 45;
	    				Price.setText(total);
	    			}
	    			else if (WafflesName.getText().toString() == "Banana Hazelnut" || WafflesName.getText().toString() == "Ham and Creamcheese" || WafflesName.getText().toString() == "Chocolate Hazelnut" ||
	    					WafflesName.getText().toString() == "Strawberry Peanut Butter" || WafflesName.getText().toString() == "Choco Banana Peanut Butter" || WafflesName.getText().toString() == "Blueberry Creamcheese" ||
	    					WafflesName.getText().toString() == "Strawberry Creamcheese" || WafflesName.getText().toString() == "Chicken Ham and Creamcheese" || WafflesName.getText().toString() == "Iced Coffee" ||
	    					WafflesName.getText().toString() == "Iced Strong Coffee" || WafflesName.getText().toString() == "Iced No Sugar Coffee" || WafflesName.getText().toString() == "Iced Choco" || WafflesName.getText().toString() == "Iced Milktea" )
	    			{
	    				total = Integer.parseInt(Quantity.toString()) * 55;
	    				Price.setText(total);
	    			}
	            }
	            else
	            {
	                Toast.makeText(UpdateItem.this, "Delete not Successfully", Toast.LENGTH_LONG).show();
	            }*/
		
		}
		
		class update implements Button.OnClickListener
		{
			public void onClick (View v)
			{
				String order = Orderno.getText().toString();
				boolean isUpdate = myDb.updateWaffle(Orderno.getText().toString(),Quantity.getText().toString(), Price.toString());
				if (isUpdate == true)
					Toast.makeText(UpdateItem.this, "Update Successful", Toast.LENGTH_LONG).show();
				else
					Toast.makeText(UpdateItem.this, "Update not Successful", Toast.LENGTH_LONG).show();
			}
		}
		
}
