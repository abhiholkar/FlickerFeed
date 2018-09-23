package com.demo.flickerfeed.repository;

import com.demo.flickerfeed.network.APIService;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

/**
 * Created by abhiholkar on 23/09/2018.
 */
public class PublicFeedRepositoryTest {

    PublicFeedRepository publicFeedRepository;
    //@Mock
    //private Retrofit mockRetrofit;
    @Mock
    private APIService mockService;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        //publicFeedRepository = new PublicFeedRepository(mockRetrofit);


    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void getPublicFeeds() throws Exception {

        //TODO - Fix with PowerMock
        /*
        //Given :
        Observable mockObservable = Mockito.mock(Observable.class);
        TestObserver<FlickerFeedResponse> testObserver = new TestObserver<>();
        TestSubscriber testSubscriber = new TestSubscriber();
        testObserver.onSubscribe(testSubscriber);

        //when :
        //Mockito.when(mockRetrofit.create(APIService.class)).thenReturn(mockService);
        //Mockito.when(mockService.getFlickerPublicFeeds()).thenReturn(mockObservable);
        publicFeedRepository.getPublicFeeds();

        //then :
        testObserver.assertNotSubscribed();
        Mockito.verify(mockRetrofit).create(APIService.class);
        Mockito.verify(mockService).getFlickerPublicFeeds();
        */

    }

}