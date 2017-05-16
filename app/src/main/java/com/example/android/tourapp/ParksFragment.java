package com.example.android.tourapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by maria on 04/05/2017.
 */

public class ParksFragment extends Fragment {

    public ParksFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);

        final ArrayList<Location> locations = new ArrayList<>();
        locations.add(new Location("La Petite Venise - Guinguette de Chartres", "48 ter boulevard de la Courtille", "description"));
        locations.add(new Location("Jardins de l'Eveche ", "Cloître Notre-Dame (derrière la Cathédrale)", "description"));
        locations.add(new Location("Jardin Medieval (Collegiale St André)", "Cloître Notre-Dame (derrière la Cathédrale)", "description"));


        LocationAdapter adapter = new LocationAdapter(getActivity(), locations);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        return rootView;
    }



}
