package com.example.crs40.medicationmanager;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import static android.R.id.message;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().getDecorView().setBackgroundColor(Color.rgb(52, 152, 219));
        //.text.setTextColor(Color.RED);

    }

    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";
    /** Called when the user taps the Send button */
    public void sendMessageSun(View view) {
        Intent i = new Intent(getApplicationContext(), DayActivity.class);

        i.putExtra("key","Sunday");
        startActivity(i);

    }
    public void sendMessageMon(View view) {
        Intent i = new Intent(getApplicationContext(), DayActivity.class);

        i.putExtra("key","Monday");
        startActivity(i);

    }
    public void sendMessageTues(View view) {
        Intent i = new Intent(getApplicationContext(), DayActivity.class);

        i.putExtra("key","Tuesday");
        startActivity(i);

    }
    public void sendMessageWed(View view) {
        Intent i = new Intent(getApplicationContext(), DayActivity.class);

        i.putExtra("key","Wednesday");
        startActivity(i);

    }public void sendMessageThus(View view) {
        Intent i = new Intent(getApplicationContext(), DayActivity.class);

        i.putExtra("key","Thursday");
        startActivity(i);

    }public void sendMessageFri(View view) {
        Intent i = new Intent(getApplicationContext(), DayActivity.class);

        i.putExtra("key","Friday");
        startActivity(i);

    }public void sendMessageSat(View view) {
        Intent i = new Intent(getApplicationContext(), DayActivity.class);

        i.putExtra("key","Saturday");
        startActivity(i);

    }


    public void sendMessageMyMeds(View view) {
        Intent i = new Intent(getApplicationContext(), myMeds.class);
        startActivity(i);

    }
}
