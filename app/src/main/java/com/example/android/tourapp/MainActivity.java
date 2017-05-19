package com.example.android.tourapp;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);

        CategoryPagerAdapter adapter = new CategoryPagerAdapter(getSupportFragmentManager());

        viewPager.setAdapter(adapter);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.sliding_tabs);
        tabLayout.setupWithViewPager(viewPager);

        tabLayout.getTabAt(0).setIcon(R.drawable.ic_historical_sites);
        tabLayout.getTabAt(1).setIcon(R.drawable.ic_art);
        tabLayout.getTabAt(2).setIcon(R.drawable.ic_restaurant);
        tabLayout.getTabAt(3).setIcon(R.drawable.ic_parks);

    }
}
