package com.example.crs40.medicationmanager;

import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
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
    static final int PICK_CONTACT_REQUEST = 1;

    public void deleteThis(View view) {
        Intent i = new Intent(getApplicationContext(), delete.class);
        i.putParcelableArrayListExtra("key", meds);
        startActivityForResult(i, PICK_CONTACT_REQUEST);


    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        // Check which request we're responding to
        if (requestCode == PICK_CONTACT_REQUEST) {
            // Make sure the request was successful
            if (resultCode == RESULT_OK) {
                Uri contactUri = data.getData();
                //meds = (ArrayList<Meds>) contactUri;
            }
        }
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
