package com.example.android.recipesnewsappstage1;

/**
 * Created by admin on 05.05.2018.
 */

public class News {

    private String mTitle;
    private String mCategory;
    private String mAuthor;
    private String mDate;
    private String mUrl;

    /**
     * Constructs a new News object.
     */

    public News(String title, String category, String author, String date, String url) {

        mTitle = title;
        mCategory = category;
        mAuthor = author;
        mDate = date;
        mUrl = url;
    }

    /**
     * Returns the news title.
     */
    public String getTitle() {
        return mTitle;
    }

    /**
     * Returns the news category.
     */
    public String getCategory() {
        return mCategory;
    }

    /**
     * Returns the news author name.
     */
    public String getAuthor() {
        return mAuthor;
    }

    /**
     * Returns the news date.
     */
    public String getDate() {
        return mDate;
    }

    /**
     * Returns news website URL.
     */
    public String getUrl() {
        return mUrl;
    }
}
