package com.example.android.recipesnewsappstage1;

import android.content.AsyncTaskLoader;
import android.content.Context;

import java.util.List;


/**
 * Created by admin on 05.05.2018.
 */

public class NewsLoader extends AsyncTaskLoader <List <News>> {

    /**
     * Query URL
     */
    private String mUrl;

    /**
     * Constructs a new {@link NewsLoader}.
     *
     * @param context of the activity
     * @param url     to load data from
     */
    public NewsLoader(Context context, String url) {
        super(context);
        mUrl = url;
    }

    @Override
    protected void onStartLoading() {
        forceLoad();
    }

    /**
     * This is on a background thread.
     */
    @Override
    public List <News> loadInBackground() {
        if (mUrl == null) {
            return null;
        }

        // Perform the network request, parse the response, and extract the news list.
        List <News> news = null;
        try {
            news = NewsUtils.fetchNewsData(mUrl);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return news;
    }
}

