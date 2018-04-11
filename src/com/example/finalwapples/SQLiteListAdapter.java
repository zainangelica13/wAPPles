package com.example.finalwapples;
import java.util.ArrayList;

import com.example.finalwapples.R;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;


public class SQLiteListAdapter extends BaseAdapter{
	 Context context;
	 ArrayList<String> userID;
	 ArrayList<String> UserName;
	 ArrayList<String> userquantity;
	 ArrayList<String> price ;
	 

	 public SQLiteListAdapter(
	 Context context2,
	 ArrayList<String> id,
	 ArrayList<String> name,
	 ArrayList<String> quantity,
	 ArrayList<String> price
	 ) 
	 {
	 
	 this.context = context2;
	 this.userID = id;
	 this.UserName = name;
	 this.userquantity = quantity;
	 this.price = price ;
	 }

	 public int getCount() {
	 // TODO Auto-generated method stub
	 return userID.size();
	 }

	 public Object getItem(int position) {
	 // TODO Auto-generated method stub
	 return null;
	 }

	 public long getItemId(int position) {
	 // TODO Auto-generated method stub
	 return 0;
	 }

	 public View getView(int position, View child, ViewGroup parent) {
	 
	 Holder holder;
	 
	 LayoutInflater layoutInflater;
	 
	 if (child == null)
	 {
		 layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
		 child = layoutInflater.inflate(R.layout.listviewdatalayout, null);
		 
		 holder = new Holder();
		 
		 holder.textviewid = (TextView) child.findViewById(R.id.textViewID);
		 holder.textviewname = (TextView) child.findViewById(R.id.textViewNAME);
		 holder.textviewquantity = (TextView) child.findViewById(R.id.textViewQUANTITY);
		 holder.textviewprice = (TextView) child.findViewById(R.id.textViewPRICE);
		 
		 child.setTag(holder);
	 } 
	 else 
	 {
	 holder = (Holder) child.getTag();
	 }
	 holder.textviewid.setText(userID.get(position));
	 holder.textviewname.setText(UserName.get(position));
	 holder.textviewquantity.setText(userquantity.get(position));
	 holder.textviewprice.setText(price.get(position));

	 return child;
	 }

	 public class Holder {
	 TextView textviewid;
	 TextView textviewname;
	 TextView textviewquantity;
	 TextView textviewprice;
	 }
	 
	 
}
