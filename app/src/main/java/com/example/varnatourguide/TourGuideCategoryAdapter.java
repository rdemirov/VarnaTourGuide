package com.example.varnatourguide;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;


public class TourGuideCategoryAdapter extends FragmentPagerAdapter {

    /**
     * Context of the app
     */
    private Context mContext;

    public TourGuideCategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    /**
     * Return the {@link Fragment} that should be displayed for the given page number.
     */
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new MuseumsFragment();
        } else if (position == 1) {
            return new LandmarksFragment();
        } else if (position == 2) {
            return new ParksFragment();
        } else {
            return new ShoppingFragment();
        }
    }

    /**
     * Return the total number of pages.
     */
    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.museums_category);
        } else if (position == 1) {
            return mContext.getString(R.string.landmarks_category);
        } else if (position == 2) {
            return mContext.getString(R.string.parks_category);
        } else {
            return mContext.getString(R.string.shopping_category);
        }
    }
}