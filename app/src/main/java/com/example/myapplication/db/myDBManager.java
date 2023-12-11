package com.example.myapplication.db;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.List;
public class myDBManager
{
    private Context context;
    private myDBHelper myDBHelper;
    private SQLiteDatabase db;
    public myDBManager(Context context)
    {
        this.context = context;
        myDBHelper = new myDBHelper(context);
    }
    public void openDB()
    {
        db = myDBHelper.getWritableDatabase();
    }
    public void insertToDBNameProduct(String product)
    {
        ContentValues cv = new ContentValues();
        cv.put(dataBaseClass.COLUMN_NAME_PRODUCT, product);
        db.insert(dataBaseClass.TABLE_NAME, null, cv);
    }
    public void insertToDBTime(String time)
    {
        ContentValues cv = new ContentValues();
        cv.put(dataBaseClass.COLUMN_NAME_TIME, time);
        db.insert(dataBaseClass.TABLE_NAME, null, cv);
    }
    public void insertToDBCallories(int calories)
    {
        ContentValues cv = new ContentValues();
        cv.put(dataBaseClass.COLUMN_NAME_CALORIES, calories);
        db.insert(dataBaseClass.TABLE_NAME, null, cv);
    }
    public List<String> getFromDB()
    {
        List<String> tempList = new ArrayList<>();
        Cursor cursor = db.query(dataBaseClass.TABLE_NAME,
                null,
                null,
                null,
                null,
                null,
                null);
        while (cursor.moveToNext())
        {
            int titleIndex = cursor.getColumnIndex(dataBaseClass.TABLE_NAME);
            String product = cursor.getString(titleIndex);
            tempList.add(product);
        }
        cursor.close();
        return tempList;
    }
    public void closeDB()
    {
        myDBHelper.close();
    }
}
