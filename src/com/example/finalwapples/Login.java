package com.example.finalwapples;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends ActionBarActivity {

	public static final String DATABASE_NAME = "OrderApp";
	DatabaseHelper myDb;
	EditText username, password;
	Button signup, login;
	String un, ps;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);
		
		myDb = new DatabaseHelper(this, DATABASE_NAME, null,
				1);
		username = (EditText) findViewById (R.id.editText1);
		password = (EditText) findViewById (R.id.editText2);
		login = (Button) findViewById (R.id.button1);
		signup = (Button) findViewById (R.id.button2);

		login.setOnClickListener(new loginbutton());
		signup.setOnClickListener(new signupbutton());

	}
	class loginbutton implements Button.OnClickListener
	{
	    public void onClick(View v)
	    {
	        String name =username.getText().toString();
	        String pass = password.getText().toString();


	         if(myDb.getUser(name,pass))
	         {
	        	 Globals.usn=myDb.getusername(name);
	        	 Globals.name=myDb.getname(name);
	        	 Globals.email=myDb.getemail(name);
	        	 Globals.cn=myDb.getcn(name);
	            
	                    Intent intent = new Intent(Login.this, Home.class);
	                    intent.putExtra("username", name);
	                    startActivity(intent);
	                    finish();
	        }
	        else
	        {
	            Toast.makeText(Login.this, "Wrong Username or Password", Toast.LENGTH_LONG).show();
	            username.setText("");
	            password.setText("");
	        }
	    }
	}
	class signupbutton implements Button.OnClickListener
	{
		public void onClick (View v)
		{
			Intent i = new Intent (Login.this, SignUp.class);
			startActivity(i);
			username.setText("");
            password.setText("");
		}
	}
	
}
