package com.udacity.gradle.builditbigger.jokerbackend;


import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;
import com.udacity.gradle.builditbigger.jokes.JokerProvider;

/**
 * An endpoint class we are exposing
 */
@Api(
        name = "myApi",
        version = "v1",
        namespace = @ApiNamespace(
                ownerDomain = "jokerbackend.builditbigger.gradle.udacity.com",
                ownerName = "jokerbackend.builditbigger.gradle.udacity.com",
                packagePath = ""
        )
)

/**
 * JokeEndpoint
 * Created by Adalberto Fernandes Júnior on 30/04/17.
 * Copyright © 2016. All rights reserved.
 */
public class JokeEndpoint {

    @ApiMethod(name = "getJoke")
    public Joke getJoke() {
        Joke response = new Joke();
        response.setData(JokerProvider.getJoke());

        return response;
    }
}
