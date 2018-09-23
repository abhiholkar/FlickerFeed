package com.demo.flickerfeed.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Item implements Parcelable {

    public static final Parcelable.Creator<Item> CREATOR = new Parcelable.Creator<Item>() {
        @Override
        public Item createFromParcel(Parcel source) {
            return new Item(source);
        }

        @Override
        public Item[] newArray(int size) {
            return new Item[size];
        }
    };
    @SerializedName("author")
    private String mAuthor;
    @SerializedName("author_id")
    private String mAuthorId;
    @SerializedName("date_taken")
    private String mDateTaken;
    @SerializedName("description")
    private String mDescription;
    @SerializedName("link")
    private String mLink;
    @SerializedName("media")
    private Media mMedia;
    @SerializedName("published")
    private String mPublished;
    @SerializedName("tags")
    private String mTags;
    @SerializedName("title")
    private String mTitle;

    public Item() {
    }

    protected Item(Parcel in) {
        this.mAuthor = in.readString();
        this.mAuthorId = in.readString();
        this.mDateTaken = in.readString();
        this.mDescription = in.readString();
        this.mLink = in.readString();
        this.mMedia = in.readParcelable(Media.class.getClassLoader());
        this.mPublished = in.readString();
        this.mTags = in.readString();
        this.mTitle = in.readString();
    }

    public String getAuthor() {
        return mAuthor;
    }

    public void setAuthor(String author) {
        mAuthor = author;
    }

    public String getAuthorId() {
        return mAuthorId;
    }

    public void setAuthorId(String authorId) {
        mAuthorId = authorId;
    }

    public String getDateTaken() {
        return mDateTaken;
    }

    public void setDateTaken(String dateTaken) {
        mDateTaken = dateTaken;
    }

    public String getDescription() {
        return mDescription;
    }

    public void setDescription(String description) {
        mDescription = description;
    }

    public String getLink() {
        return mLink;
    }

    public void setLink(String link) {
        mLink = link;
    }

    public Media getMedia() {
        return mMedia;
    }

    public void setMedia(Media media) {
        mMedia = media;
    }

    public String getPublished() {
        return mPublished;
    }

    public void setPublished(String published) {
        mPublished = published;
    }

    public String getTags() {
        return mTags;
    }

    public void setTags(String tags) {
        mTags = tags;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.mAuthor);
        dest.writeString(this.mAuthorId);
        dest.writeString(this.mDateTaken);
        dest.writeString(this.mDescription);
        dest.writeString(this.mLink);
        dest.writeParcelable(this.mMedia, flags);
        dest.writeString(this.mPublished);
        dest.writeString(this.mTags);
        dest.writeString(this.mTitle);
    }
}
