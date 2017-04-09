package com.example.crs40.medicationmanager;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;

public class delete extends AppCompatActivity {
    private RecyclerView mRV;
    private LinearLayoutManager mLL;
    private rAdapterD rA;
    ArrayList<Meds> myList;

    //ArrayList<Meds> myList = new ArrayList<Meds>();

    public void deleteChecks(View view) {
        Intent i = new Intent(getApplicationContext(), MainActivity.class);


        startActivity(i);

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delete);
        getWindow().getDecorView().setBackgroundColor(Color.rgb(52, 152, 219));


        myList = this.getIntent().getParcelableArrayListExtra("key");

        // Initialze the RecyclerView
        // Initialize the R.Adapter, (remember constructor!)



        mRV = (RecyclerView) findViewById(R.id.medsD);
        mRV.setHasFixedSize(true);
        rA = new rAdapterD(myList);
        mRV.setAdapter(rA);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        mRV.setLayoutManager(llm);

        mRV = (RecyclerView) findViewById(R.id.medsD);
        mLL = new LinearLayoutManager(this);
        mRV.setLayoutManager(mLL);

    }

    public ArrayList<Meds> createArrayList()
    {
        ArrayList<Meds> meds = new ArrayList<>();
        //fill the arraylist

        meds.add(new Meds("Ibprouphin", 12));
        meds.add(new Meds("xanax", 14));
        meds.add(new Meds("tremidal", 1));
        meds.add(new Meds("norvasc", 18));
        meds.add(new Meds("amoxicilien", 11));



        return meds;
    }


}
