package com.example.android.tourapp;

public class Location {

    private String mAddress;
    private String mName;
    private String mDescription;

    private static final int NO_IMAGE_PROVIDED = -1;

    // Drawable resource ID

    private int mImageResourceId = NO_IMAGE_PROVIDED;
    //private int mImageResourceId = R.drawable.ic_parks;

    // constructor without image
    public Location(String name, String address, String description) {
        mName = name;
        mAddress = address;
        mDescription = description;
    }

    // constructor with image
    public Location(String name, String address, String description, int imageResourceId) {
        mName = name;
        mAddress = address;
        mDescription = description;
        mImageResourceId = imageResourceId;
    }


    @Override
    public String toString() {
        return mName + " : " + mAddress;
    }

    public String getAddress() {
        return mAddress;
    }

    public String getName() {
        return mName;
    }

    public String getDescription() {
        return mDescription;
    }

    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }
}
