package com.example.myapplication.db;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
public class myDBHelper extends SQLiteOpenHelper
{
    public myDBHelper(Context context) {
        super(context, dataBaseClass.DB_NAME, null, dataBaseClass.DB_VERSION);
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
