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

    //private int mColorResourceId;

    public LocationAdapter(Activity context, ArrayList<Location> words) {
        super(context, 0, words);
        //mColorResourceId = colorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item_vertical, parent, false);
        }

        Location currentLocation = getItem(position);

        TextView nameTextView = (TextView) listItemView.findViewById(R.id.name_text_view);
        nameTextView.setText(currentLocation.getName());

        TextView addressTextView = (TextView) listItemView.findViewById(R.id.address_text_view);
        addressTextView.setText(currentLocation.getAddress());

        TextView descriptionTextView = (TextView) listItemView.findViewById(R.id.description_text_view);
        descriptionTextView.setText(currentLocation.getDescription());

        // Find the ImageView in the list_item.xml layout with the ID list_item_icon
        ImageView iconView = (ImageView) listItemView.findViewById(R.id.image);

        if (currentLocation.hasImage()) {
            // Get the image resource ID from the current location object and
            // set the image to iconView
            //iconView.setImageResource(R.mipmap.ic_launcher);
            iconView.setImageResource(currentLocation.getImageResourceId());
        }
        else {
            iconView.setVisibility(View.GONE);

        }

        // Set the theme color for the list item
        //View textContainer = listItemView.findViewById(R.id.text_container);
        // Find the color that the resource ID maps to
        //int color = ContextCompat.getColor(getContext(), mColorResourceId);
        // Set the background color of the text container View
        //textContainer.setBackgroundColor(color);

        return listItemView;
    }



}


