package com.example.crs40.medicationmanager;

import android.os.Parcelable;

/**
 * Created by Test on 4/8/2017.
 */

public class Meds {

    protected String medicationName;
    protected int medicationAmount;

    public Meds(String medicationName, int medicationAmount) {
        this.medicationName = medicationName;
        this.medicationAmount = medicationAmount;
    }
}
