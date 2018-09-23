package com.demo.flickerfeed.viewmodel;

import com.demo.flickerfeed.model.FlickerFeedResponse;
import com.demo.flickerfeed.usecase.GetPublicFeedUsecase;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import io.reactivex.Observable;
import io.reactivex.observers.TestObserver;

import static org.junit.Assert.assertNotNull;

/**
 * Created by abhiholkar on 23/09/2018.
 */
public class FlickerFeedViewModelTest {

    @Mock
    private GetPublicFeedUsecase getPublicFeedUsecase;
    private FlickerFeedViewModel flickerFeedViewModel;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        flickerFeedViewModel = new FlickerFeedViewModel(getPublicFeedUsecase);
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void getFlickerPublicFeeds() throws Exception {
        //Given :
        TestObserver<FlickerFeedResponse> testObserver = new TestObserver<>();
        Observable mockObservable = Mockito.mock(Observable.class);

        mockObservable.subscribe(testObserver);


        //When :
        Mockito.when(getPublicFeedUsecase.getFlickerPublicFeeds()).thenReturn(mockObservable);
        flickerFeedViewModel.getFlickerPublicFeeds();

        //Then:
        assertNotNull(getPublicFeedUsecase);
        testObserver.assertNoErrors();
        testObserver.onComplete();
        testObserver.assertComplete();


    }

    @Test(expected = Throwable.class)
    public void getFlickerPublicFeedsWithException() throws Exception {
        //Given :
        TestObserver<FlickerFeedResponse> testObserver = new TestObserver<>();
        Observable mockObservable = Mockito.mock(Observable.class);
        Throwable mockException = Mockito.mock(Throwable.class);
        mockObservable.subscribe(testObserver);

        //When :

        Mockito.when(getPublicFeedUsecase.getFlickerPublicFeeds()).thenThrow(mockException);
        flickerFeedViewModel.getFlickerPublicFeeds();

        //Then:
        assertNotNull(getPublicFeedUsecase);
        testObserver.assertError(mockException);
        testObserver.onComplete();
        testObserver.assertComplete();
    }

}