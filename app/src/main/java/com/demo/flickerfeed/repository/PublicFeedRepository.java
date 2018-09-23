package com.demo.flickerfeed.repository;

import com.demo.flickerfeed.model.FlickerFeedResponse;
import com.demo.flickerfeed.network.APIService;

import javax.inject.Inject;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Retrofit;

/**
 * Created by abhiholkar on 22/09/2018.
 */

public class PublicFeedRepository {

    private Retrofit retrofit;

    @Inject
    public PublicFeedRepository(Retrofit retrofit) {
        this.retrofit = retrofit;
    }

    public Observable<FlickerFeedResponse> getPublicFeeds() {
        return retrofit.create(APIService.class).getFlickerPublicFeeds()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread());
    }
}
