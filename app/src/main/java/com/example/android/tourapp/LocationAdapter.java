package com.example.android.tourapp;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

class LocationAdapter extends ArrayAdapter<Location> {

    public LocationAdapter(Activity context, ArrayList<Location> words) {
        super(context, 0, words);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        ViewHolder holder = new ViewHolder();
        holder.picture = (ImageView) listItemView.findViewById(R.id.image);
        holder.name = (TextView) listItemView.findViewById(R.id.name_text_view);
        holder.address = (TextView) listItemView.findViewById(R.id.address_text_view);
        holder.description = (TextView) listItemView.findViewById(R.id.description_text_view);
        listItemView.setTag(holder);

        Location currentLocation = getItem(position);

        holder.name.setText(currentLocation.getName());
        holder.address.setText(currentLocation.getAddress());
        holder.description.setText(currentLocation.getDescription());

        if (currentLocation.hasImage()) {
            holder.picture.setImageResource(currentLocation.getImageResourceId());
        } else {
            holder.picture.setVisibility(View.GONE);
        }

        return listItemView;
    }

    static class ViewHolder {
        TextView name;
        TextView address;
        TextView description;
        ImageView picture;
    }
}




