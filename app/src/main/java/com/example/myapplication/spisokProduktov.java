package com.example.myapplication;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.example.myapplication.db.myDBManager;
public class spisokProduktov extends AppCompatActivity {
    private TextView textView4;
    private myDBManager myDBManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spisok_produktov);
        textView4 = findViewById(R.id.textView4);
        myDBManager = new myDBManager(this);
    }
    public void goToMainActivity(View v)
    {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    public void onClickShowDB(View view) {
        myDBManager.openDB();
        for (String title : myDBManager.getFromDB())
        {
            textView4.append(title);
            textView4.append("\n");
        }
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        myDBManager.closeDB();
    }
}