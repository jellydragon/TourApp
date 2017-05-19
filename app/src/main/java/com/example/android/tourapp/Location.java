package com.example.android.tourapp;

class Location {

    private static final int NO_IMAGE_PROVIDED = -1;
    private final String mAddress;
    private final String mName;
    private final String mDescription;
    // Drawable resource ID
    private int mImageResourceId = NO_IMAGE_PROVIDED;

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
