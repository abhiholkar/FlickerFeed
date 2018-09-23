package com.demo.flickerfeed.usecase;

import com.demo.flickerfeed.model.FlickerFeedResponse;
import com.demo.flickerfeed.repository.PublicFeedRepository;

import javax.inject.Inject;

import io.reactivex.Observable;

/**
 * Created by abhiholkar on 22/09/2018.
 */

public class GetPublicFeedUsecase {

    private PublicFeedRepository publicFeedRepository;

    @Inject
    public GetPublicFeedUsecase(PublicFeedRepository publicFeedRepository) {
        this.publicFeedRepository = publicFeedRepository;
    }

    public Observable<FlickerFeedResponse> getFlickerPublicFeeds() {
        return publicFeedRepository.getPublicFeeds();
    }
}
