package com.example.crs40.medicationmanager;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;

public class myMeds extends AppCompatActivity {

    ArrayList<Meds> meds = createArrayList();
    private RecyclerView mRV;
    private LinearLayoutManager mLL;
    private rAdapter rA;

    public void deleteThis(View view) {
        Intent i = new Intent(getApplicationContext(), delete.class);
        i.putExtra("mylist", meds);
        startActivity(i);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_meds);


        RecyclerView recList = (RecyclerView) findViewById(R.id.meds);
        recList.setHasFixedSize(true);
        rA = new rAdapter(meds);
        recList.setAdapter(rA);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        recList.setLayoutManager(llm);

        mRV = (RecyclerView) findViewById(R.id.meds);
        mLL = new LinearLayoutManager(this);
        mRV.setLayoutManager(mLL);

    }

    public void sendMessageAddDrug(View view) {



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
