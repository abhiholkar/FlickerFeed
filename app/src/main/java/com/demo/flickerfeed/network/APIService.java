package com.demo.flickerfeed.network;

import com.demo.flickerfeed.model.FlickerFeedResponse;

import io.reactivex.Observable;
import retrofit2.http.GET;

/**
 * Created by abhiholkar on 22/09/2018.
 */

public interface APIService {

    String BASE_FLICKER_URL = "https://api.flickr.com/services/feeds/";

    @GET("photos_public.gne?lang=en-us&format=json&nojsoncallback=1")
    Observable<FlickerFeedResponse> getFlickerPublicFeeds();
}
