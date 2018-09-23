package com.demo.flickerfeed.viewmodel;

import android.support.annotation.Nullable;

import com.demo.flickerfeed.model.FlickerFeedResponse;

/**
 * Created by abhiholkar on 22/09/2018.
 */

public class Response {

    @Nullable
    private FlickerFeedResponse flickerFeedResponse;

    @Nullable
    private
    Throwable error;


    public Response(@Nullable FlickerFeedResponse flickerFeedResponse, @Nullable Throwable error) {
        this.flickerFeedResponse = flickerFeedResponse;
        this.error = error;
    }

    @Nullable
    public FlickerFeedResponse getFlickerFeedResponse() {
        return flickerFeedResponse;
    }

    @Nullable
    public Throwable getError() {
        return error;
    }
}
