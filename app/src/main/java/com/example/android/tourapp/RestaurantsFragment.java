package com.example.android.tourapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class RestaurantsFragment extends Fragment {

    public RestaurantsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);

        final ArrayList<Location> locations = new ArrayList<>();
        locations.add(new Location("Passacaille", "30 rue St Même", "Une des meilleures pizzerias de Chartres", R.drawable.passacaille));
        locations.add(new Location("Académie de la Bière", "8 Rue du Cheval Blanc",
                "Un large choix de très bonnes bières de 26 pays différents", R.drawable.acad));

        //locations.add(new Location("McDo", "Place des Epars", "le McDo central"));
        //locations.add(new Location("Nouvel Orient", "26 Rue du Grand Faubourg", "Bon chinois pas cher"));

        LocationAdapter adapter = new LocationAdapter(getActivity(), locations);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);


        return rootView;
    }

}
