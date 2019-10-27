package com.example.varnatourguide;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class ShoppingFragment extends Fragment {

    public ShoppingFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.sites_list, container, false);
        Context context = this.getContext();

        // Create a list of sites
        final ArrayList<Site> sites = new ArrayList<>();
        sites.add(Site.createSite(context, R.string.shopping_grand_mall_label, R.string.shopping_grand_mall_description, R.drawable.grand_mall));
        sites.add(Site.createSite(context, R.string.shopping_averi_beers_label, R.string.shopping_averi_beers_description, R.drawable.averi_beers));
        sites.add(Site.createSite(context, R.string.shopping_balkanik_souvenirs_label, R.string.shopping_balkanik_souvenirs_description, R.drawable.balkanik_souvenirs));
        sites.add(Site.createSite(context, R.string.shopping_lollipop_label, R.string.shopping_lollipop_description, R.drawable.lollipop_bulgaria));
        sites.add(Site.createSite(context, R.string.shopping_retail_park_label, R.string.shopping_retail_park_description, R.drawable.retail_park_varna));

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
