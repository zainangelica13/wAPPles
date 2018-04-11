package com.example.finalwapples;


import java.util.ArrayList;

import android.support.v7.app.ActionBarActivity;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.MenuItem.OnMenuItemClickListener;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CursorAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.TextView;
import android.widget.Toast;

public class Cart extends Activity { 

	 public static final String DATABASE_NAME = "OrderApp";
	 private AlertDialog.Builder build;
	 public static final String ROW_ID = "Order_No";
	 private static final String TITLE = "Name";
		private static final String NOTE = "Quantity";
		private static final String PRICE = "Price";
		public static final String Item = "shop";
	 DatabaseHelper myDb;
	 SQLiteDatabase db;
	 Cursor cursor;
	 SQLiteListAdapter ListAdapter ;

	 ArrayList<String> ID_ArrayList = new ArrayList<String>();
	 ArrayList<String> NAME_ArrayList = new ArrayList<String>();
	 ArrayList<String> QUANTITY_ArrayList = new ArrayList<String>();
	 ArrayList<String> PRICE_ArrayList = new ArrayList<String>();
	 ListView LISTVIEW;
	 Button delete, update, order;
	 EditText quantity;
	 
	 
	 
	 @Override
	 public void onCreate(Bundle savedInstanceState) {
	 super.onCreate(savedInstanceState);
	 setContentView(R.layout.activity_cart);

	 LISTVIEW = (ListView) findViewById(R.id.listView1);
	 delete = (Button) findViewById (R.id.button1);
	 update = (Button) findViewById (R.id.button2);
	 order = (Button) findViewById (R.id.button3);
	 quantity = (EditText) findViewById (R.id.editText1);
	 
	 delete.setOnClickListener(new delete());
	 order.setOnClickListener(new order());

	 myDb = new DatabaseHelper(this, DATABASE_NAME, null,
				1);
	 
	 }
	 class delete implements Button.OnClickListener
	 {
		 public void onClick (View v)
		 {
			 Integer admin;
	         String Quantity;
	         Quantity=quantity.getText().toString();
	           
	                Integer del = myDb.deletedata(quantity.getText().toString());
	                if (del > 0)
	                {
	                    Toast.makeText(Cart.this, "Delete Successfully", Toast.LENGTH_LONG).show();
	                    ShowSQLiteDBdata() ;
	                    quantity.setText("");
	                }
	                else
	                {
	                    Toast.makeText(Cart.this, "Delete not Successfully", Toast.LENGTH_LONG).show();
	                    
	                    quantity.setText("");
	                }
		 }
	 }
	 class order implements Button.OnClickListener
	 {
		 public void onClick (View v)
		 {
			 Intent i = new Intent (Cart.this, Confirmation.class);
			 startActivity(i);
		 }
	 }
	 
	 private void displayData() 
	 {
	        db = myDb.getWritableDatabase();
	        //the SQL command to fetched all records from the table
	        Cursor mCursor = db.rawQuery("SELECT * FROM "
	                + myDb.TABLE_NAME, null);
	        
	        

	        //reset variables
	        ID_ArrayList.clear();
	        NAME_ArrayList.clear();
	        QUANTITY_ArrayList.clear();
	        PRICE_ArrayList.clear();
	        
	        //fetch each record
	        if (mCursor.moveToFirst()) 
	        {
	            do 
	            {
	                //get data from field 
	            	ID_ArrayList.add(mCursor.getString(mCursor.getColumnIndex(myDb.COL_0)));
	            	NAME_ArrayList.add(mCursor.getString(mCursor.getColumnIndex(myDb.COL_1)));
	            	QUANTITY_ArrayList.add(mCursor.getString(mCursor.getColumnIndex(myDb.COL_2)));
	            	PRICE_ArrayList.add(mCursor.getString(mCursor.getColumnIndex(myDb.COL_3)));
	                
	            } while (mCursor.moveToNext());
	        }
	 }
	 
	 

		 @Override
		 protected void onResume() 
		 {
	
		 ShowSQLiteDBdata() ;
		 
		 super.onResume();
		 }
	
		 private void ShowSQLiteDBdata() {
		 
		 db = myDb.getWritableDatabase();
		 
		 cursor = db.rawQuery("SELECT * FROM Waffles_table", null);
	
		 ID_ArrayList.clear();
		 NAME_ArrayList.clear();
		 QUANTITY_ArrayList.clear();
		 PRICE_ArrayList.clear();
		 
		 if (cursor.moveToFirst()) {
		 do {
		 ID_ArrayList.add(cursor.getString(cursor.getColumnIndex(myDb.COL_0)));
		 
		 NAME_ArrayList.add(cursor.getString(cursor.getColumnIndex(myDb.COL_1)));
		 
		 QUANTITY_ArrayList.add(cursor.getString(cursor.getColumnIndex(myDb.COL_2)));
		 
		 PRICE_ArrayList.add(cursor.getString(cursor.getColumnIndex(myDb.COL_3)));
	
		 } while (cursor.moveToNext());
		 }
		 
		 ListAdapter = new SQLiteListAdapter(Cart.this,
		 
		 ID_ArrayList,
		 NAME_ArrayList,
		 QUANTITY_ArrayList,
		 PRICE_ArrayList 
		 
		 );
		 
		 
		 
		 LISTVIEW.setAdapter(ListAdapter);
		 
		 cursor.close();
}
}
