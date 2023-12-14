package com.example.callories;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class extraMeal extends AppCompatActivity {
    private DBManager DBManager;
    private EditText editTextName, editTextTime, editTextCaloriesCounting;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_extra_meal);
        editTextName = findViewById(R.id.editTextName);
        editTextTime = findViewById(R.id.editTextTime);
        editTextCaloriesCounting = findViewById(R.id.editTextCaloriesCounting);
        DBManager.openDB();
    }
    public void onClickSave(View view)
    {
        DBManager.insertToDB(
                editTextName.getText().toString(),
                editTextTime.getText().toString(),
                Integer.parseInt(editTextCaloriesCounting.getText().toString()));
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        DBManager.closeDB();
    }

    public void goToMainActivity(View v)
    {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}