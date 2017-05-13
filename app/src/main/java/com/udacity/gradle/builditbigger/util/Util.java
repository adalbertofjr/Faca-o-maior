package com.udacity.gradle.builditbigger.util;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/**
 * Util
 * Created by Adalberto Fernandes Júnior on 13/05/17.
 * Copyright © 2016. All rights reserved.
 */

public class Util {

    //Thank's to http://stackoverflow.com/a/4009133
    public static boolean isConnected(Context context) {
        ConnectivityManager cm =
                (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = cm.getActiveNetworkInfo();
        return networkInfo != null && networkInfo.isConnectedOrConnecting();
    }
}
