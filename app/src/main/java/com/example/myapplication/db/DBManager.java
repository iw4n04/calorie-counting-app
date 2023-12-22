package com.example.myapplication.db;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class DBManager{
    private DBHelper DBHelper;
    private SQLiteDatabase db;
    private Context context;

    public DBManager(Context context) {
        this.context = context;
        DBHelper = new DBHelper(context);
    }

    public void openDataBase()
    {
        db = DBHelper.getWritableDatabase();
    }
    public void insertToDataBase(String name, String time, int counting)
    {
        ContentValues cv = new ContentValues();
        cv.put(DataBase.NAME, name);
        cv.put(DataBase.TIME, time);
        cv.put(DataBase.COUNTING, counting);
        db.insert(DataBase.TABLE_NAME, null, cv);
    }
    public interface OnDataReceived
    {
        void onReceived(List<listItem> List);
    }
    public void getFromDataBase(OnDataReceived onDataReceived)
    {
        List<listItem> tempList = new ArrayList<>();
        Cursor cursor = db.query(DataBase.TABLE_NAME,
                null,
                null,
                null,
                null,
                null,
                null);
        while (cursor.moveToNext())
        {
            listItem item = new listItem();
            int nameIndex = cursor.getColumnIndex(DataBase.NAME);
            String name = cursor.getString(nameIndex);
            int timeIndex = cursor.getColumnIndex(DataBase.TIME);
            String time = cursor.getString(timeIndex);
            int idIndex = cursor.getColumnIndex(DataBase._ID);
            int id = cursor.getInt(idIndex);
            int countingIndex = cursor.getColumnIndex(DataBase.COUNTING);
            int counting = cursor.getInt(countingIndex);
            item.setId(id);
            item.setName(name);
            item.setTime(time);
            item.setCounting(counting);
            tempList.add(item);
        }
        cursor.close();
        onDataReceived.onReceived(tempList);
    }
    public void closeDataBase()
    {
        DBHelper.close();
    }
}
