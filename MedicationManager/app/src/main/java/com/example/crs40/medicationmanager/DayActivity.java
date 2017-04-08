package com.example.crs40.medicationmanager;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class DayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        String value = "";
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_day);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            value = extras.getString("key");
            //The key argument here must match that used in the other activity
        }
        setContentView(R.layout.activity_day);
        TextView DayDeclaration = (TextView) findViewById(R.id.DayDeclaration);
        DayDeclaration.setText(value);
}

}
