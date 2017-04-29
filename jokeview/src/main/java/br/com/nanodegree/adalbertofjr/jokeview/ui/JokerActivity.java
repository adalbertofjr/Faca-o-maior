package br.com.nanodegree.adalbertofjr.jokeview.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import br.com.nanodegree.adalbertofjr.jokeview.R;

/**
 * JokerActivity
 * Created by Adalberto Fernandes Júnior on 15/04/17.
 * Copyright © 2016. All rights reserved.
 */

public class JokerActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joker);
    }
}
