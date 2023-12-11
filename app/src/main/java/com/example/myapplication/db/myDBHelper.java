package com.example.myapplication.db;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
public class myDBHelper extends SQLiteOpenHelper
{
    public static final int DB_VERSION = 1;
    public static final String DB_NAME = "myDataBase";
    public myDBHelper(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(dataBaseClass.TABLE_STRUCTURE);
    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(dataBaseClass.SQL_DELETE_DATA_BASE);
        onCreate(db);
    }
}
