package com.example.myapplication;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import com.example.myapplication.db.myDBManager;
public class extraMeal extends AppCompatActivity {
    private myDBManager myDBManager;
    private EditText editTextTime, editTextTextName, editTextNumberCalory;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_extra_meal);
        myDBManager = new myDBManager(this);
        editTextTime = findViewById(R.id.editTextTime);
        editTextTextName = findViewById(R.id.editTextTextName);
        editTextNumberCalory = findViewById(R.id.editTextNumberCalory);
    }
    @Override
    protected void onResume() {
        super.onResume();
        myDBManager.openDB();
    }
    public void goToMainActivity(View v) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    public void onClickSaveTime(View view) {
        myDBManager.insertToDBTime(editTextTime.getText().toString());
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        myDBManager.closeDB();
    }
    public void onClickSaveName(View view) {
        myDBManager.insertToDBNameProduct(editTextTextName.getText().toString());
    }
    public void onClickSaveCaloriy(View view) {
        myDBManager.insertToDBCallories(Integer.parseInt
                (editTextNumberCalory.getText().toString()));
    }
}