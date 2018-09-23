package com.demo.flickerfeed.viewmodel;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;
import android.support.annotation.VisibleForTesting;

import com.demo.flickerfeed.model.FlickerFeedResponse;
import com.demo.flickerfeed.usecase.GetPublicFeedUsecase;

import javax.inject.Inject;

import io.reactivex.observers.DisposableObserver;

/**
 * Created by abhiholkar on 22/09/2018.
 */

public class FlickerFeedViewModel extends ViewModel {

    private MutableLiveData<Response> response;

    private GetPublicFeedUsecase getPublicFeedUsecase;

    @Inject
    public FlickerFeedViewModel(GetPublicFeedUsecase getPublicFeedUsecase) {
        this.getPublicFeedUsecase = getPublicFeedUsecase;
    }

    public MutableLiveData<Response> getFlickerPublicFeeds() {
        if (response == null) {
            response = new MutableLiveData<>();
        }
        getPublicFeedUsecase.getFlickerPublicFeeds().subscribe(new DisposableObserver<FlickerFeedResponse>() {
            @Override
            public void onNext(FlickerFeedResponse flickerFeedResponse) {
                if (flickerFeedResponse != null && !flickerFeedResponse.getItems().isEmpty()) {
                    response.setValue(getResponse(flickerFeedResponse, null));
                } else {
                    response.setValue(getResponse(null, new RuntimeException()));
                }

            }

            @Override
            public void onError(Throwable e) {
                response.setValue(getResponse(null, e));

            }

            @Override
            public void onComplete() {

            }
        });
        return response;

    }

    @SuppressWarnings("WeakerAccess")
    @VisibleForTesting
    public Response getResponse(FlickerFeedResponse flickerFeedResponse, Throwable error) {
        return new Response(flickerFeedResponse, error);
    }
}
