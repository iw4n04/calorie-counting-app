<<<<<<< HEAD:app/src/main/java/com/example/myapplication/db/DBHelper.java
package com.example.myapplication.db;

=======
package com.example.callories;
>>>>>>> 981fd2220dc60498753bd0939ce33c25d76895c2:app/src/main/java/com/example/callories/DBHelper.java
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

<<<<<<< HEAD:app/src/main/java/com/example/myapplication/db/DBHelper.java
public class DBHelper extends SQLiteOpenHelper {

    public DBHelper(Context context) {
        super(context, DataBase.TABLE_NAME, null, DataBase.DB_VERSION);
=======
import androidx.annotation.Nullable;

public class DBHelper extends SQLiteOpenHelper {
    public DBHelper(@Nullable Context context) {
        super(context, DB.TABLE_NAME, null, DB.DB_VERSION);
>>>>>>> 981fd2220dc60498753bd0939ce33c25d76895c2:app/src/main/java/com/example/callories/DBHelper.java
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
<<<<<<< HEAD:app/src/main/java/com/example/myapplication/db/DBHelper.java
        db.execSQL(DataBase.TABLE_STRUCTURE);
=======
        db.execSQL(DB.TABLE_STRUCTURE);
>>>>>>> 981fd2220dc60498753bd0939ce33c25d76895c2:app/src/main/java/com/example/callories/DBHelper.java
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
<<<<<<< HEAD:app/src/main/java/com/example/myapplication/db/DBHelper.java
        db.execSQL(DataBase.DROP_TABLE);
=======
        db.execSQL(DB.DROP_TABLE);
>>>>>>> 981fd2220dc60498753bd0939ce33c25d76895c2:app/src/main/java/com/example/callories/DBHelper.java
        onCreate(db);
    }
}
