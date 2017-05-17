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

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);

        final ArrayList<Location> locations = new ArrayList<>();
        locations.add(new Location("La Petite Venise - Guinguette de Chartres",
                "48 ter boulevard de la Courtille",
                "Petit coin de paradis",
                R.drawable.petite_venise));
        locations.add(new Location("Jardins de l'Eveche ",
                "Cloître Notre-Dame (derrière la Cathédrale)",
                "Joli jardin avec de belles projections à la nuit tombée",
                R.drawable.jardin_eveche));
        locations.add(new Location("Jardin Medieval (Collegiale St André)",
                "Cloître Notre-Dame (derrière la Cathédrale)",
                "Une collection de plantes de moyen age",
                R.drawable.jardin_medieval));


        LocationAdapter adapter = new LocationAdapter(getActivity(), locations);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        return rootView;
    }



}
