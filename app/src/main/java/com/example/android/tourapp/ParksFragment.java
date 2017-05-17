package com.example.android.tourapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class ParksFragment extends Fragment {

    public ParksFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);

        final ArrayList<Location> locations = new ArrayList<>();

        locations.add(new Location(getString(R.string.petite_venise),
                getString(R.string.address_petite_venise),
                getString(R.string.description_petite_venise),
                R.drawable.petite_venise));

        locations.add(new Location(getString(R.string.jardin_eveche),
                getString(R.string.address_jardin_eveche),
                getString(R.string.description_jardin_eveche),
                R.drawable.jardin_eveche));

        locations.add(new Location(getString(R.string.jardin_medieval),
                getString(R.string.address_jardin_medieval),
                getString(R.string.description_jardin_medieval),
                R.drawable.jardin_medieval));


        LocationAdapter adapter = new LocationAdapter(getActivity(), locations);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        return rootView;
    }


}
