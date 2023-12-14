package com.example.callories;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.List;

public class DBManager {
    private Context context;
    private DBHelper DBHelper;
    private SQLiteDatabase db;
    public DBManager(Context context)
    {
        this.context = context;
        DBHelper = new DBHelper(context);
    }
    public void openDB()
    {
        db = DBHelper.getWritableDatabase();
    }
    public void insertToDB(String name, String time, int counting)
    {
        ContentValues cv = new ContentValues();
        cv.put(DB.NAME, name);
        cv.put(DB.TIME, time);
        cv.put(DB.COUNTING, counting);
        db.insert(DB.TABLE_NAME, null, cv);
    }
    public List<String> getFromDB()
    {
        List<String> tempList = new ArrayList<>();
        Cursor cursor = db.query(DB.TABLE_NAME,
                null,
                null,
                null,
                null,
                null,
                null);
        while (cursor.moveToNext()) {
            int titleIndex = cursor.getColumnIndex(DB.NAME);
            String title = cursor.getString(titleIndex);
            tempList.add(title);
        }
        cursor.close();
        return tempList;
    }
    public void closeDB()
    {
        DBHelper.close();
    }
}
