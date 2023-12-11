package com.example.myapplication.db;
public class dataBaseClass {
    public static final String TABLE_NAME = "day_calloriy";
    public static final String _ID = "id";
    public static final String DAY = "day";
    public static final String COLUMN_NAME_PRODUCT = "product";
    public static final String COLUMN_NAME_TIME = "time";
    public static final String COLUMN_NAME_CALORIES = "calories";
    public static final String TABLE_STRUCTURE = "CREATE TABLE IF NOT EXISTS day_calloriy " +
            "(id INTEGER PRIMARY KEY,day DATE,product TEXT,time TEXT,calories INTEGER PRIMARY KEY)";
    public static final String SQL_DELETE_DATA_BASE = "DROP TABLE IF EXISTS" + TABLE_NAME;
}
