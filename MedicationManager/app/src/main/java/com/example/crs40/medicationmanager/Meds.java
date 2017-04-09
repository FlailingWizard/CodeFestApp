package com.example.crs40.medicationmanager;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Test on 4/8/2017.
 */

public class Meds implements Parcelable{

    protected String medicationName;
    protected int medicationAmount;

    public Meds(String medicationName, int medicationAmount) {
        this.medicationName = medicationName;
        this.medicationAmount = medicationAmount;
    }
    public Meds(Parcel in) {
        this.medicationAmount = in.readInt();
        this.medicationName = in.readString();
    }


    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(medicationAmount);
        dest.writeString(medicationName);
    }
    public static final Parcelable.Creator<Meds> CREATOR = new Parcelable.Creator<Meds>() {
        @Override
        public Meds createFromParcel(Parcel in) {
            return new Meds(in);
        }

        @Override
        public Meds[] newArray(int size) {
            return new Meds[size];
        }
    };
    @Override
    public int describeContents() {return 0;}

}
