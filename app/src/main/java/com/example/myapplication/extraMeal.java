package com.example.myapplication;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.myapplication.db.DBHandler;
import com.example.myapplication.db.dbMeal;

public class extraMeal extends AppCompatActivity {
    private EditText editTextTime, editTextTextName, editTextNumberCalory;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_extra_meal);
        editTextTime = findViewById(R.id.editTextTime);
        editTextTextName = findViewById(R.id.editTextTextName);
        editTextNumberCalory = findViewById(R.id.editTextNumberCalory);
    }
    public void goToMainActivity(View v) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}