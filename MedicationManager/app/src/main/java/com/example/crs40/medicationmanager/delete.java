package com.example.crs40.medicationmanager;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class delete extends AppCompatActivity {
    private RecyclerView mRV;
    private LinearLayoutManager mLL;
    private rAdapterD rA;
    //Bundle extras = getIntent().getExtras();
    //ArrayList<Meds> myList = (ArrayList<Meds>) extras.getSerializableExtra("mylist");
    ArrayList<Meds> myList = new ArrayList<Meds>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delete);
        getWindow().getDecorView().setBackgroundColor(Color.rgb(52, 152, 219));
        RecyclerView recList = (RecyclerView) findViewById(R.id.meds);
        recList.setHasFixedSize(true);
        rA = new rAdapterD(myList);
        recList.setAdapter(rA);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        recList.setLayoutManager(llm);

        mRV = (RecyclerView) findViewById(R.id.meds);
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
