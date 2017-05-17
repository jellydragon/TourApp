package com.example.android.tourapp;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;


public class CategoryPagerAdapter extends FragmentPagerAdapter {

    private Context mContext;

    public CategoryPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new HistoricalSitesFragment();
        } else if (position == 1) {
            return new MuseumsFragment();
        } else if (position == 2) {
            return new RestaurantsFragment();
        } else {
            return new ParksFragment();
        }

    }

    @Override
    public int getCount() {
        return 4;
    }

    /*@Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.category_restaurants);
        } else if (position == 1) {
            return mContext.getString(R.string.category_museums);
        } else if (position == 2) {
            return mContext.getString(R.string.category_parks);
        } else {
            return mContext.getString(R.string.category_historical_sites);
        }
    }*/


}
