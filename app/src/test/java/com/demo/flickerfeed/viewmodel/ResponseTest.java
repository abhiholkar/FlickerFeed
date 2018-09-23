package com.demo.flickerfeed.viewmodel;

import com.demo.flickerfeed.model.FlickerFeedResponse;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertEquals;

/**
 * Created by abhiholkar on 23/09/2018.
 */
public class ResponseTest {

    @Mock
    private FlickerFeedResponse mockReponse;

    @Mock
    private Throwable mockError;

    private Response response;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        response = new Response(mockReponse, mockError);

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void getFlickerFeedResponse() throws Exception {
        assertEquals(mockReponse, response.getFlickerFeedResponse());
    }

    @Test
    public void getError() throws Exception {
        assertEquals(mockError, response.getError());
    }
}