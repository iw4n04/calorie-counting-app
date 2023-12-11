package com.example.myapplication.db;

import android.provider.BaseColumns;

public class dataBaseClass implements BaseColumns {
    public static final String TABLE_NAME = "day_calloriy";
    public static final String DAY = "day";
    public static final String COLUMN_NAME_PRODUCT = "product";
    public static final String COLUMN_NAME_TIME = "time";
    public static final String COLUMN_NAME_CALORIES = "calories";
    public static final String TABLE_STRUCTURE = "CREATE TABLE IF NOT EXISTS" +
            TABLE_NAME + "(" +
            _ID + "INTEGER PRIMARY KEY," +
            DAY + "TEXT," +
            COLUMN_NAME_PRODUCT + "TEXT," +
            COLUMN_NAME_TIME + "TEXT," +
            COLUMN_NAME_CALORIES + "INTEGER PRIMARY KEY)";
    public static final String SQL_DELETE_DATA_BASE = "DROP TABLE IF EXISTS" + TABLE_NAME;
}
