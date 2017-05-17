package com.example.android.tourapp;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


public class LocationAdapter extends ArrayAdapter<Location> {


    public LocationAdapter(Activity context, ArrayList<Location> words) {
        super(context, 0, words);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Location currentLocation = getItem(position);

        TextView nameTextView = (TextView) listItemView.findViewById(R.id.name_text_view);
        nameTextView.setText(currentLocation.getName());

        TextView addressTextView = (TextView) listItemView.findViewById(R.id.address_text_view);
        addressTextView.setText(currentLocation.getAddress());

        TextView descriptionTextView = (TextView) listItemView.findViewById(R.id.description_text_view);
        descriptionTextView.setText(currentLocation.getDescription());

        ImageView iconView = (ImageView) listItemView.findViewById(R.id.image);

        if (currentLocation.hasImage()) {
            iconView.setImageResource(currentLocation.getImageResourceId());
        }
        else {
            iconView.setVisibility(View.GONE);
        }

        return listItemView;
    }



}


