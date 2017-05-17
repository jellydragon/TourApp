package com.example.android.tourapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class MuseumsFragment extends Fragment {

    public MuseumsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.location_list, container, false);

        final ArrayList<Location> locations = new ArrayList<>();

        locations.add(new Location(getString(R.string.theatre),
                getString(R.string.address_theatre),
                getString(R.string.description_theatre),
                R.drawable.theatre));

        locations.add(new Location(getString(R.string.centre_vitrail),
                getString(R.string.address_centre_vitrail),
                getString(R.string.description_centre_vitrail),
                R.drawable.vitrail));

        locations.add(new Location(getString(R.string.musee_ecole),
                getString(R.string.address_musee_ecole),
                getString(R.string.description_musee_ecole),
                R.drawable.musee_ecole));

        LocationAdapter adapter = new LocationAdapter(getActivity(), locations);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }


}
