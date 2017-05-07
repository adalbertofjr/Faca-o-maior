package com.udacity.gradle.builditbigger;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.udacity.gradle.builditbigger.task.GetJokeEndpointAsyncTask;

/**
 * MainActivityFragment
 * Created by Adalberto Fernandes Júnior on 01/05/17.
 * Copyright © 2016. All rights reserved.
 */

public class MainActivityFragment extends Fragment
        implements View.OnClickListener {
    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_main, container, false);
        root.findViewById(R.id.main_btn_tellJoke).setOnClickListener(this);

        return root;
    }

    @Override
    public void onClick(View v) {
        tellJoke();
    }

    public void tellJoke() {
        new GetJokeEndpointAsyncTask().execute(getActivity());
    }
}
