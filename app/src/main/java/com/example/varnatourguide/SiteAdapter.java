package com.example.varnatourguide;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class SiteAdapter extends ArrayAdapter<Site> {


    public SiteAdapter(Context context, ArrayList<Site> sites) {
        super(context, 0, sites);

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item_site, parent, false);
        }

        // Get the site located at this position in the list
        Site currentSite = getItem(position);

        // Find the ID of the controls in the list_item_site layout
        TextView siteNameTextView = (TextView) listItemView.findViewById(R.id.siteName);
        TextView siteDescriptionTextView = (TextView) listItemView.findViewById(R.id.siteDescription);
        ImageView photo = (ImageView) listItemView.findViewById(R.id.sitePhoto);

        //Set the values in the list item layout
        siteNameTextView.setText(currentSite.getSiteName());
        siteDescriptionTextView.setText(currentSite.getSiteDescription());
        photo.setImageResource(currentSite.getSitePhoto());

        return listItemView;
    }
}