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

public class rAdapter extends RecyclerView.Adapter<rAdapter.medsHolder>{


    public ArrayList<Meds> mMedsList;
        public rAdapter() {

        }
        public rAdapter(ArrayList<Meds> meds) {
            this.mMedsList = meds;
            }

    // MUST-HAVE METHOD FOR CUSTOM ADAPTER
    @Override
    public medsHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View row = LayoutInflater.from(parent.getContext() )
                .inflate(R.layout.row, parent, false);
        return new medsHolder(row);
    }

    // MUST-HAVE METHOD FOR CUSTOM ADAPTER
    @Override
    public void onBindViewHolder(medsHolder medsViewHolder, int i) {

        // Retrieve the device in the position specified by the holder
        //   Meds MEDICATION = mMedsList.get(medsHolder.getAdapterPosition());
        Meds medication = mMedsList.get(medsViewHolder.getAdapterPosition());
        medsViewHolder.mMedName.setText(medication.medicationName);
        medsViewHolder.mMedNumber.setText(String.valueOf(medication.medicationAmount));
        // Set row layout views with current Device values

  /*      holder.mRootLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View view) {
                launchDeviceDetailPage(holder);
            }


        });
*/

     /*   holder.mRootLayout.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(final View view) {
                Log.i("OnLongClick", "OnLongClick");
                return true;
            }
        });

    */
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



    public static class medsHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        private TextView mMedName;
        private TextView mMedNumber;
        private TextView mItemDescription;
        private LinearLayout mRootLayout;


        //4
       public medsHolder(View v) {
            super(v);

            mMedName = (TextView) v.findViewById(R.id.medName);
            mMedNumber = (TextView) v.findViewById(R.id.medNumber);
           mRootLayout = (LinearLayout) v.findViewById(R.id.rootLayout);
            v.setOnClickListener(this);
        }



        //5
        @Override
        public void onClick(View v) {
            Log.d("RecyclerView", "CLICK!");
        }
    }




}




