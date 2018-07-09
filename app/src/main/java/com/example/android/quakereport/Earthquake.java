package com.example.android.quakereport;

/**
 * Creating an Custom ArrayAdapter
 * Step 2: Create a new Java object by creating a class that holds information about each list item
 * Creates a constructors and getters methods to access private variables declared
 */
public class Earthquake {

    //Create private variables of the elements in each list item
    private String mMagnitude;

    private String mLocation;

    private String mDate;

    //Create a constructor to initialise the variables when called
    public Earthquake(String magnitude, String location, String date) {
        mMagnitude = magnitude;
        mLocation = location;
        mDate = date;
    }

    //Getters methods to access the private variables from another classes
    public String getmMagnitude() {
        return mMagnitude;
    }

    public String getmLocation() {
        return mLocation;
    }

    public String getmDate() {
        return mDate;
    }
}
