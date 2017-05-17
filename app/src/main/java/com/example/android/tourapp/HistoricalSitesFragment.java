package com.example.android.tourapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class HistoricalSitesFragment extends Fragment {

    public HistoricalSitesFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);

        final ArrayList<Location> locations = new ArrayList<>();
        locations.add(new Location("Cathédrale de Chartres", "16 Cloître Notre Dame", "Une des plus belles cathédrales de France", R.drawable.cathedrale));
        locations.add(new Location("Maison Picassiette", "20 rue du Repos", "Maison magnifique en assiettes brisées", R.drawable.picassiette));

        LocationAdapter adapter = new LocationAdapter(getActivity(), locations);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }


}
