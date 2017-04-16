package com.udacity.gradle.builditbigger.joker;

import com.udacity.gradle.builditbigger.jokes.Joker;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * JokerTest
 * Created by Adalberto Fernandes Júnior on 15/04/17.
 * Copyright © 2016. All rights reserved.
 */

public class JokerTest {

    private Joker joker;

    @Before
    public void setUp() {
        joker = new Joker();
    }

    @Test
    public void testJoker() {
        Assert.assertEquals(joker.getJoke(), "Uma piada sem graça...");
    }
}
