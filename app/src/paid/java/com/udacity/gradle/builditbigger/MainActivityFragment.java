package com.udacity.gradle.builditbigger;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;

import com.udacity.gradle.builditbigger.task.GetJokeEndpointAsyncTask;

/**
 * MainActivityFragment
 * Created by Adalberto Fernandes Júnior on 01/05/17.
 * Copyright © 2016. All rights reserved.
 */

public class MainActivityFragment extends Fragment
        implements View.OnClickListener {

    private ProgressBar progressBar;
    private Button tellJokeButton;

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_main, container, false);
        tellJokeButton = (Button) root.findViewById(R.id.main_btn_tellJoke);
        progressBar = (ProgressBar) root.findViewById(R.id.main_pb_load);

        tellJokeButton.setOnClickListener(this);

        return root;
    }

    @Override
    public void onClick(View v) {
        tellJoke();
    }

    @Override
    public void onStop() {
        progressBar.setVisibility(View.GONE);
        tellJokeButton.setEnabled(true);
        super.onStop();
    }

    public void tellJoke() {
        tellJokeButton.setEnabled(false);
        progressBar.setVisibility(View.VISIBLE);
        new GetJokeEndpointAsyncTask().execute(getActivity());
    }
}
