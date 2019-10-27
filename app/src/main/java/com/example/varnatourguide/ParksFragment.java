package com.example.varnatourguide;

import android.content.Context;
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
        View rootView = inflater.inflate(R.layout.sites_list, container, false);
        Context context = this.getContext();

        // Create a list of sites
        final ArrayList<Site> sites = new ArrayList<>();
        sites.add(Site.createSite(context, R.string.parks_aquarium_label, R.string.parks_aquarium_description, R.drawable.aquarium));
        sites.add(Site.createSite(context, R.string.parks_sea_garden_label, R.string.parks_sea_garden_description, R.drawable.sea_garden));
        sites.add(Site.createSite(context, R.string.parks_zoo_park_label, R.string.parks_zoo_park_description, R.drawable.zoopark));
        sites.add(Site.createSite(context, R.string.parks_eco_park_label, R.string.parks_eco_park_description, R.drawable.ecopark));

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
