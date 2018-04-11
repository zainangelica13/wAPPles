package com.example.finalwapples;

import android.support.v7.app.ActionBarActivity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Home extends ActionBarActivity {

	private Button okay, order, exit;
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
       
        okay = (Button) findViewById (R.id.button1);
        order = (Button) findViewById (R.id.button2);
        exit = (Button) findViewById (R.id.button5);
        TextView username = (TextView) findViewById (R.id.textView1);
        
        okay.setOnClickListener(new okaybutton());        
        order.setOnClickListener(new orderbutton());
        exit.setOnClickListener(new exit());
        
        
        username.setText(Globals.usn);
    }
	class exit implements Button.OnClickListener
	{
		public void onClick (View v)
		{
			Builder alert = new Builder(Home.this);
		      alert.setMessage("Are you sure you want to logout? ").setCancelable(false).setNegativeButton("Yes", new DialogInterface.OnClickListener() {
		        public void onClick(DialogInterface dialog, int which) {
		            
		        	  	Intent i= new Intent (Home.this, Login.class);
		        	  	Toast.makeText(Home.this, "Logout", Toast.LENGTH_LONG).show();
			    		startActivity(i);
			    		finish();         
		        }
		      }).setPositiveButton("No", new DialogInterface.OnClickListener() {
		        public void onClick(DialogInterface dialog, int which) {
		          dialog.cancel();
		        }
		      });
		      AlertDialog alertt = alert.create();
		      alert.setTitle("Confirmation!");
		      alert.show();
				
				
					
		}
	}
	class okaybutton implements Button.OnClickListener
	{
		public void onClick (View v)
		{
			Intent i= new Intent (Home.this, Waffles_Menu.class);
    		startActivity(i);
    		finish();
		}
	}
	class orderbutton implements Button.OnClickListener
	{
		public void onClick (View v)
		{
			Intent i= new Intent (Home.this, Cart.class);
    		startActivity(i);
		}
	}
}
