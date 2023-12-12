package com.example.myapplication.db;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;

public class DBHandler extends SQLiteOpenHelper {
    public DBHandler(Context context) {
        super(context, utils.DB_NAME, null, utils.DB_VERSION);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        String CREATE_TABLE = "CREATE TABLE " +
                utils.TABLE_NAME + " (" +
                utils._ID + " INTEGER PRIMARY KEY, " +
                utils.PRODUCT_NAME + " TEXT, " +
                utils.TIME + " TEXT, " +
                utils.CALORIES_COUNTING + " INTEGER PRIMARY KEY, " +
                utils.DATE + " DATE)";
        db.execSQL(CREATE_TABLE);
    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + utils.TABLE_NAME);
        onCreate(db);
    }
    public void addDBMeal (dbMeal dbMeal)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put(utils.PRODUCT_NAME, dbMeal.getName());
        cv.put(utils.TIME, dbMeal.getTime());
        cv.put(utils.CALORIES_COUNTING, dbMeal.getCalories());
        db.insert(utils.TABLE_NAME, null, cv);
        db.close();
    }
    public dbMeal getDBMeal(int id)
    {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.query(utils.TABLE_NAME,
                new String[] {utils.PRODUCT_NAME, utils.TIME, utils.CALORIES_COUNTING},
                utils._ID + "=?", new String[] {String.valueOf(id)},
                null, null, null, null);
        if (cursor != null)
        {
            cursor.moveToFirst();
        }
        dbMeal dbMeal = new dbMeal(
        );
        return dbMeal;
    }
    public List<dbMeal> getAllMeal()
    {
        SQLiteDatabase db = this.getReadableDatabase();
        List<dbMeal> mealList = new ArrayList<>();
        String selectAllMeal = "Select * from " + utils.TABLE_NAME;
        Cursor cursor = db.rawQuery(selectAllMeal, null);
        if (cursor.moveToFirst())
        {
            do {
                dbMeal dbMeal = new dbMeal();
                dbMeal.setName(cursor.getString(1));
                dbMeal.setTime(cursor.getString(2));
                dbMeal.setCalories(Integer.parseInt(cursor.getString(3)));
                mealList.add(dbMeal);
            } while (cursor.moveToNext());
        }
        return  mealList;
    }
}
