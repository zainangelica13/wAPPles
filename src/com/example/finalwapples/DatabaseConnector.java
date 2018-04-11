package com.example.finalwapples;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;

public class DatabaseConnector {

	// Declare Variables
	public static final String DATABASE_NAME = "OrderApp";
	private static final String TABLE_NAME = "Waffles_table";
	private static final String TITLE = "Name";
	private static final String ID = "Order_No";
	private SQLiteDatabase database;
	private DatabaseHelper dbOpenHelper;

	public DatabaseConnector(Context context) {
		dbOpenHelper = new DatabaseHelper(context, DATABASE_NAME, null,
			1);
	}

	public void open() throws SQLException {
		database = dbOpenHelper.getWritableDatabase();
	}

	public void close() {
		if (database != null)
			database.close();
	}

	public Cursor ListAllNotes() {
		return database.query(TABLE_NAME, new String[] { ID, TITLE }, null,
				null, null, null, TITLE);
	}

	// Capture single data by ID
	public Cursor GetOneNote(long id) {
		return database.query(TABLE_NAME, null, ID + "=" + id, null, null,
				null, null);
	}

}