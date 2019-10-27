package com.example.varnatourguide;

import android.content.Context;
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
        View rootView = inflater.inflate(R.layout.sites_list, container, false);
        Context context = this.getContext();

        // Create a list of sites
        final ArrayList<Site> sites = new ArrayList<>();
        sites.add(Site.createSite(context, R.string.museums_retro_museum_label, R.string.museums_retro_museum_description, R.drawable.retro_museum));
        sites.add(Site.createSite(context, R.string.museums_vladislav_varnenchik_label, R.string.museums_vladislav_varnenchik_description, R.drawable.vladislav_varnenchik_museum));
        sites.add(Site.createSite(context, R.string.museums_varna_history_label, R.string.museums_varna_history_description, R.drawable.history_of_varna_museum));
        sites.add(Site.createSite(context, R.string.museums_history_medicine_label, R.string.museums_history_medicine_description, R.drawable.history_of_medicine_museum));

        // Create an {@link SiteAdapter}, whose data source is a list of {@link Site}s. The
        // adapter knows how to create list items for each item in the list.
        SiteAdapter adapter = new SiteAdapter(getActivity(), sites);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link SiteAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Site} in the list.
        listView.setAdapter(adapter);
        return rootView;
    }

}
