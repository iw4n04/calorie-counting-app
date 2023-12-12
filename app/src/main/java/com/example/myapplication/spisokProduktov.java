package com.example.myapplication;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.example.myapplication.db.DBHandler;
import com.example.myapplication.db.dbMeal;

import java.util.List;

public class spisokProduktov extends AppCompatActivity {
    private TextView textView4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spisok_produktov);
        textView4 = findViewById(R.id.textView4);;
        DBHandler DBHandler = new DBHandler(this);
        DBHandler.addDBMeal(new dbMeal("jkml", "jjnkjn", 464, ""));
        List<dbMeal> mealList = DBHandler.getAllMeal();
        for (dbMeal dbMeal : mealList)
        {
            Log.d("Meal info: ", "name " + dbMeal.getName() + " , time - " +
                    dbMeal.getTime() + " , calories" + dbMeal.getCalories());
        }
    }
    public void goToMainActivity(View v)
    {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}