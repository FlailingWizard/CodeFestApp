package com.example.crs40.medicationmanager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Test on 4/8/2017.
 */

public class rAdapterD extends RecyclerView.Adapter<rAdapterD.medsHolderd>{


    public ArrayList<Meds> mMedsList;
    public rAdapterD() {

    }
    public rAdapterD(ArrayList<Meds> meds) {
        this.mMedsList = meds;
    }

    // MUST-HAVE METHOD FOR CUSTOM ADAPTER
    @Override
    public medsHolderd onCreateViewHolder(ViewGroup parent, int viewType) {
        View drow = LayoutInflater.from(parent.getContext() )
                .inflate(R.layout.drow, parent, false);
        return new medsHolderd(drow);
    }

    // MUST-HAVE METHOD FOR CUSTOM ADAPTER
    @Override
    public void onBindViewHolder(medsHolderd medsViewHolder, int i) {

        // Retrieve the device in the position specified by the holder
        Meds medication = mMedsList.get(medsViewHolder.getAdapterPosition());
        medsViewHolder.mMedName.setText(medication.medicationName);


    }

    //methods required to make adapter
    @Override
    public int getItemCount(){
        return mMedsList.size();
    }
    //   @Override
    public long getItemID(int position){
        return position;
    }

    //  @Override
    public int getItemView(int position){
        return position;
    }



    public static class medsHolderd extends RecyclerView.ViewHolder {

        private TextView mMedName;

        private LinearLayout mRootLayout;



        public medsHolderd(View v) {
            super(v);

            mMedName = (TextView) v.findViewById(R.id.medName);

            mRootLayout = (LinearLayout) v.findViewById(R.id.rootLayout);

        }



    }




}




