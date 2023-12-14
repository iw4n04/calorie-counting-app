package com.example.callories;

public class DB {
    public static final String TABLE_NAME = "my_table";
    public static final String _ID = "_id";
    public static final String NAME = "name";
    public static final String TIME = "time";
    public static final String COUNTING = "counting";
    public static final String DATE = "date";
    public static final String DB_NAME = "my_db.db";
    public static final int DB_VERSION = 1;
    public static final String TABLE_STRUCTURE = "CREATE TABLE IF NOT EXISTS my_table " +
            "(_id INTEGER PRIMARY KEY,name TEXT,time TEXT,counting INTEGER PRIMARY KEY,date TEXT)";
    public static final String DROP_TABLE = "DROP TABLE IF EXISTS " + TABLE_NAME;
}
