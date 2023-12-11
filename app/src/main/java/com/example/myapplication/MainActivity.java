package com.example.myapplication;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;

import com.example.myapplication.db.myDBManager;

public class MainActivity extends AppCompatActivity {
    private myDBManager myDBManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CalendarView mainCalendarView = findViewById(R.id.mainCalendarView);
    }
    public void goToExtraMealInput(View v)
    {
        Intent intent = new Intent(this, extraMeal.class);
        startActivity(intent);
    }
    public void goToSpisokProduktov(View v)
    {
        Intent intent = new Intent(this, spisokProduktov.class);
        startActivity(intent);
    }
}