package com.example.callories;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void goToInputExtraMeal(View v)
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