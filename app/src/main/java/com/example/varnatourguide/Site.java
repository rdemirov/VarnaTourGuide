package com.example.varnatourguide;

import android.content.Context;

public class Site {
    String mName;
    String mDescription;
    int mSitePhoto;

    public static Site createSite(Context context, int name, int description, int siteImage) {
        Site citySite = new Site();
        citySite.mName = context.getString(name);
        citySite.mDescription = context.getString(description);
        citySite.mSitePhoto = siteImage;
        return citySite;
    }

    public String getSiteName() {
        return this.mName;
    }

    public String getSiteDescription() {
        return this.mDescription;
    }

    public int getSitePhoto() {
        return this.mSitePhoto;
    }
}
