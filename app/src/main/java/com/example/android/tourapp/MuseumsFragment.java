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

        //locations.add(new Location("Musée des Beaux-Arts", "29 cloître Notre-Dame", "Le principal musée de la ville"));

        locations.add(new Location("Théâtre de Chartres", "Place de Ravenne", "Lieu incontournable pour des spectacles de qualité", R.drawable.theatre));
        locations.add(new Location("Centre International du Vitrail", "5 Rue du Cardinal Pie", "Le monde merveilleux du vitrail et du verre", R.drawable.vitrail));
        locations.add(new Location("Musée de l'Ecole de Chartres et d'Eure-et-Loir", "12 Place Drouaise", "L'école il y a cent ans", R.drawable.musee_ecole));


        LocationAdapter adapter = new LocationAdapter(getActivity(), locations);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        return rootView;
    }


}
