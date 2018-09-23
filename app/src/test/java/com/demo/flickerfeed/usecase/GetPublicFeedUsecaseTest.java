package com.demo.flickerfeed.usecase;

import com.demo.flickerfeed.repository.PublicFeedRepository;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

/**
 * Created by abhiholkar on 23/09/2018.
 */
public class GetPublicFeedUsecaseTest {

    @Mock
    private PublicFeedRepository mockRepository;

    private GetPublicFeedUsecase getPublicFeedUsecase;


    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        getPublicFeedUsecase = new GetPublicFeedUsecase(mockRepository);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getFlickerPublicFeeds() throws Exception {
        getPublicFeedUsecase.getFlickerPublicFeeds();
        Mockito.verify(mockRepository).getPublicFeeds();
    }

}