package com.example.callories;

public class DB {
    public static final String TABLE_NAME = "my_table";
    public static final String _ID = "_id";
    public static final String NAME = "name";
    public static final String TIME = "time";
    public static final String DATE = "date";
    public static final String COUNTING = "counting";
    public static final String DATE = "date";
    public static final String DB_NAME = "my_db.db";
    public static final int DB_VERSION = 1;
<<<<<<< HEAD:app/src/main/java/com/example/myapplication/db/DataBase.java
    public static final String TABLE_STRUCTURE = "CREATE TABLE IF NOT EXISTS " + TABLE_NAME +
            " (" + _ID + " INTEGER PRIMARY KEY," +
            NAME + " TEXT," + TIME + " TEXT," +
            DATE + " DATE," + COUNTING + " INTEGER PRIMARY KEY)";
=======
    public static final String TABLE_STRUCTURE = "CREATE TABLE IF NOT EXISTS my_table " +
            "(_id INTEGER PRIMARY KEY,name TEXT,time TEXT,counting INTEGER PRIMARY KEY,date TEXT)";
>>>>>>> 981fd2220dc60498753bd0939ce33c25d76895c2:app/src/main/java/com/example/callories/DB.java
    public static final String DROP_TABLE = "DROP TABLE IF EXISTS " + TABLE_NAME;
}
