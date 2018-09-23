package com.demo.flickerfeed.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import javax.annotation.Generated;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class FlickerFeedResponse {

    @SerializedName("description")
    private String mDescription;
    @SerializedName("generator")
    private String mGenerator;
    @SerializedName("items")
    private List<Item> mItems;
    @SerializedName("link")
    private String mLink;
    @SerializedName("modified")
    private String mModified;
    @SerializedName("title")
    private String mTitle;

    public String getDescription() {
        return mDescription;
    }

    public void setDescription(String description) {
        mDescription = description;
    }

    public String getGenerator() {
        return mGenerator;
    }

    public void setGenerator(String generator) {
        mGenerator = generator;
    }

    public List<Item> getItems() {
        return mItems;
    }

    public void setItems(List<Item> items) {
        mItems = items;
    }

    public String getLink() {
        return mLink;
    }

    public void setLink(String link) {
        mLink = link;
    }

    public String getModified() {
        return mModified;
    }

    public void setModified(String modified) {
        mModified = modified;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

}
