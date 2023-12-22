package com.example.myapplication.db;

public class DataBase {
    public static final String TABLE_NAME = "my_table";
    public static final String _ID = "_id";
    public static final String NAME = "name";
    public static final String TIME = "time";
    public static final String DATE = "date";
    public static final String COUNTING = "counting";
    public static final String DB_NAME = "my_db.db";
    public static final int DB_VERSION = 1;
    public static final String TABLE_STRUCTURE = "CREATE TABLE IF NOT EXISTS " + TABLE_NAME +
            " (" + _ID + " INTEGER PRIMARY KEY," +
            NAME + " TEXT," + TIME + " TEXT," +
            DATE + " DATE," + COUNTING + " INTEGER PRIMARY KEY)";
    public static final String DROP_TABLE = "DROP TABLE IF EXISTS " + TABLE_NAME;
}
