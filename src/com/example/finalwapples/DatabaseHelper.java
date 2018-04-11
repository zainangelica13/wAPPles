package com.example.finalwapples;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteDatabase.CursorFactory;


public class DatabaseHelper extends SQLiteOpenHelper {

	public static final String DATABASE_NAME = "OrderApp";
    public static final String TABLE_NAME = "Waffles_table";
    public static final String TABLE_NAME3 = "Account_table";
    public static final String COL_0 = "Order_No";
    public static final String COL_1 = "Name";
    public static final String COL_2 = "Quantity";
    public static final String COL_3 = "Price";
    public static final String COL_4 = "Address";
    public static final String COL_5 = "Contact_Number";
    public static final String COL_6 = "Email_Address";
    public static final String COL_7 = "Username";
    public static final String COL_8 = "Password";
    public static final String COL_9 = "Fullname";
    public DatabaseHelper(Context context, String name, CursorFactory factory,
			int version) {
        super(context, DATABASE_NAME, null, 1);
        SQLiteDatabase db = this.getWritableDatabase();
	}

	@Override
	public void onCreate(SQLiteDatabase arg0) {
		arg0.execSQL("create table " + TABLE_NAME + " (Order_No INTEGER PRIMARY KEY AUTOINCREMENT, Name TEXT, Quantity INTEGER, Price INTEGER)");
        arg0.execSQL("create table " + TABLE_NAME3 + " (FullName TEXT,Username TEXT,Email_Address TEXT, Password TEXT, Contact_Number TEXT,Address TEXT)");
        arg0.execSQL("insert into "+ TABLE_NAME3 +" ("+ COL_9 +","+ COL_7 +","+ COL_6 +","+ COL_8 +","+ COL_5 +","+ COL_4 +") values ('Angie','admin','angie@yahoo.com','admin','09107875824','prk.pagsisikap gulang gulang lucena city')");
	}

	@Override
	public void onUpgrade(SQLiteDatabase arg0, int arg1, int arg2) {
		arg0.execSQL("DROP TABLE IF EXISTS "+TABLE_NAME);
		arg0.execSQL("DROP TABLE IF EXISTS "+TABLE_NAME3);
        onCreate(arg0);
		
	}
	
	 public Cursor getAllData() 
	 {
	        SQLiteDatabase db = this.getWritableDatabase();
	        Cursor res = db.rawQuery("select * from "+TABLE_NAME,null);
	        return res;
	 }
	 
	 public Cursor getAllData1() 
	 {
	        SQLiteDatabase db = this.getWritableDatabase();
	        Cursor res = db.rawQuery("select * from "+TABLE_NAME3,null);
	        return res;
	 }
	 
	
	 public Integer deletedata (String id){
	        SQLiteDatabase db = this.getWritableDatabase();
	        return db.delete(TABLE_NAME, "Order_No = ?",new String[] {id});
	    }

	public boolean waffledata (String  Name, String Quantity,String Price)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_1,Name);
        contentValues.put(COL_2,Quantity);
        contentValues.put(COL_3,Price);
        long result = db.insert(TABLE_NAME,null,contentValues);
        if (result == 1)
            return false;
        else
            return true;
    }
	
	public boolean accountData (String  Name, String Username, String Email_Address, String Password, String Contact_Number)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_9,Name);
        contentValues.put(COL_7,Username);
        contentValues.put(COL_6,Email_Address);
        contentValues.put(COL_8,Password);
        contentValues.put(COL_5,Contact_Number);
        long result = db.insert(TABLE_NAME3,null,contentValues);
        if (result == 1)
            return false;
        else
            return true;
    }
	
    public String getusername(String name){
        String selectQuery = "select * from " + TABLE_NAME3 + " where " +
                COL_7 + " = " +"'"+name+"'"  ;
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(selectQuery,null);
        cursor.moveToNext();
        String s = "";
        if (cursor.moveToFirst()){

            s = cursor.getString(cursor.getColumnIndex(COL_7));
        }
        cursor.close();
        db.close();
        return s;
    }
    public String getname(String name){
        String selectQuery = "select * from " + TABLE_NAME3 + " where " +
                COL_7 + " = " +"'"+name+"'"  ;
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(selectQuery,null);
        cursor.moveToNext();
        String s = "";
        if (cursor.moveToFirst()){

            s = cursor.getString(cursor.getColumnIndex("FullName"));
        }
        cursor.close();
        db.close();
        return s;
    }
    public String getemail(String name){
        String selectQuery = "select * from " + TABLE_NAME3 + " where " +
                COL_7 + " = " +"'"+name+"'"  ;
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(selectQuery,null);
        cursor.moveToNext();
        String s = "";
        if (cursor.moveToFirst()){

            s = cursor.getString(cursor.getColumnIndex(COL_6));
        }
        cursor.close();
        db.close();
        return s;
    }
    public String getcn(String name){
        String selectQuery = "select * from " + TABLE_NAME3 + " where " +
                COL_7 + " = " +"'"+name+"'"  ;
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(selectQuery,null);
        cursor.moveToNext();
        String s = "";
        if (cursor.moveToFirst()){

            s = cursor.getString(cursor.getColumnIndex(COL_5));
        }
        cursor.close();
        db.close();
        return s;
    }
	
	public boolean addressacc (String Address)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_4,Address);
        long result = db.insert(TABLE_NAME3,null,contentValues);
        if (result == 1)
            return false;
        else
            return true;
    }
	
	public boolean searchdata(String name) 
	{
        String selectQuery = "select * from " + TABLE_NAME3 + " where " +
        		COL_7 + " = " + "'" + name + "'";
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);
        cursor.moveToNext();
        if (cursor.getCount() > 0) {
            return true;
        }
        cursor.close();
        db.close();
        return false;
    }
	
	public boolean searchwaffle (String Order_No) 
	{
        String selectQuery = "select * from " + TABLE_NAME + " where " +
        		COL_0 + " = " + "'" + Order_No + "'";
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);
        cursor.moveToNext();
        if (cursor.getCount() > 0) {
            return true;
        }
        cursor.close();
        db.close();
        return false;
    }
	
	public boolean updateWaffle (String Order_No, String Quantity,String Price)
	{
			SQLiteDatabase db = this.getWritableDatabase();
			ContentValues contentValues = new ContentValues();
	        contentValues.put("Quantity",Quantity);
	        contentValues.put("Price",Price);
			db.update(TABLE_NAME,contentValues ,"Order_No = ?", new String[] {Order_No});
			return true;
	}
	public boolean getUser(String username,String password){
        String selectQuery = "select * from " + TABLE_NAME3 + " where " +
                COL_7 + " = " + "'" +username+ "'" + " and " + COL_8 + " = " + "'" +password+"'";
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(selectQuery,null);
        cursor.moveToNext();

        if (cursor.getCount() > 0){

            return true;
        }
        cursor.close();
        db.close();
        return false;
    }

}
