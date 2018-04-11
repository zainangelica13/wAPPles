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

public class SignUp extends ActionBarActivity {

	public static final String DATABASE_NAME = "OrderApp";
	DatabaseHelper myDb;
	EditText fullname, username, email, password, passwordmatch, cn ;
	Button save;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_sign_up);
		
		myDb = new DatabaseHelper(this, DATABASE_NAME, null,
				1);
		fullname = (EditText) findViewById (R.id.editText1);
		username = (EditText) findViewById (R.id.editText2);
		email = (EditText) findViewById (R.id.editText3);
		password = (EditText) findViewById (R.id.editText4);
		passwordmatch = (EditText) findViewById (R.id.editText5);
		cn = (EditText) findViewById (R.id.editText6);
		save = (Button) findViewById (R.id.button1);

		save.setOnClickListener(new savebutton());

		}

		class savebutton implements Button.OnClickListener
		{
			public void onClick (View v)
			{
				String CN = cn.getText().toString();
			    String un =username.getText().toString();
		        String pass = password.getText().toString();
		        String fname =fullname.getText().toString();
		        String em = email.getText().toString();

		                if (fname.length() == 0 || un.length() == 0 || pass.length() == 0 || em.length() == 0 || CN.length() == 0 ) {
		                    Toast.makeText(SignUp.this, "Some Fields are Empty", Toast.LENGTH_LONG).show();
		                }
		                else if(myDb.searchdata(un)){
		                     Toast.makeText(SignUp.this, "User Already Exist", Toast.LENGTH_LONG).show();
		                    fullname.setText("");
		                    username.setText("");
		                    password.setText("");
		                    cn.setText("");
		                    email.setText("");
		                    passwordmatch.setText("");
		                 }
		                else
		                    {
		                        if (password.length() == passwordmatch.length())
		                            {
		                            boolean isInserted = myDb.accountData(fullname.getText().toString(),
		                                    username.getText().toString(), email.getText().toString(), password.getText().toString(), cn.getText().toString());
		                            if (isInserted) {
		                                Toast.makeText(SignUp.this, "Registed Successfully", Toast.LENGTH_LONG).show();
		                            }
		                            else {
		                                Toast.makeText(SignUp.this, "Failed to Signup", Toast.LENGTH_LONG).show();
		                            }
			                            fullname.setText("");
					                    username.setText("");
					                    password.setText("");
					                    cn.setText("");
					                    email.setText("");
					                    passwordmatch.setText("");
					                    Intent i = new Intent (SignUp.this, Login.class);
					                    startActivity(i);
					                    finish();
		                        }
		                        else
		                        {
		                            Toast.makeText(SignUp.this, "Password Did'nt match", Toast.LENGTH_LONG).show();
		                        }
		                    }
			}
		}
}
