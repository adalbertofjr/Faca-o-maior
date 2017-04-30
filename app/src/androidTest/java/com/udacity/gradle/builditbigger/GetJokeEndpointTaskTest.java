package com.udacity.gradle.builditbigger;

import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;

import com.udacity.gradle.builditbigger.task.GetJokeEndpointAsyncTask;

import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import static junit.framework.Assert.assertNotNull;

/**
 * GetJokeEndpointTaskTest
 * Created by Adalberto Fernandes Júnior on 30/04/17.
 * Copyright © 2016. All rights reserved.
 */
@RunWith(AndroidJUnit4.class)
public class GetJokeEndpointTaskTest {

    @Test
    public void testGetJokeEndpointAsyncTask() throws InterruptedException, ExecutionException, TimeoutException {
        GetJokeEndpointAsyncTask getJokeEndpointTask = new GetJokeEndpointAsyncTask();
        getJokeEndpointTask.execute(InstrumentationRegistry.getTargetContext());
        String joke = getJokeEndpointTask.get(20, TimeUnit.SECONDS);
        assertNotNull(joke);
    }
}