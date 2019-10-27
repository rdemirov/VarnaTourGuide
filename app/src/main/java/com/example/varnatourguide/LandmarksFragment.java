package com.example.varnatourguide;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class LandmarksFragment extends Fragment {

    public LandmarksFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.sites_list, container, false);
        Context context = this.getContext();
        // Create a list of sites
        final ArrayList<Site> sites = new ArrayList<>();
        sites.add(Site.createSite(context, R.string.landmarks_roman_baths_label, R.string.landmarks_roman_baths_description, R.drawable.roman_baths));
        sites.add(Site.createSite(context, R.string.landmarks_karadzha_monument_label, R.string.landmarks_karadzha_monument_description, R.drawable.stefan_karadzha_monument));
        sites.add(Site.createSite(context, R.string.landmarks_tzar_kaloyan_monument_label, R.string.landmarks_tzar_kaloyan_monument_description, R.drawable.tsar_kaloyan_monument));
        sites.add(Site.createSite(context, R.string.landmarks_tsarska_bistritza_label, R.string.landmarks_tsarska_bistritza_description, R.drawable.tsarska_bistritza));

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
