package com.udacity.gradle.builditbigger;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.udacity.gradle.builditbigger.util.Util;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    @Override
    protected void onResume() {
        super.onResume();
        View fragmentView = findViewById(R.id.fragment);
        View wifiView = findViewById(R.id.main_wifi_off);

        if (!Util.isConnected(this)) {
            fragmentView.setVisibility(View.INVISIBLE);
            wifiView.setVisibility(View.VISIBLE);
        } else {
            wifiView.setVisibility(View.INVISIBLE);
            fragmentView.setVisibility(View.VISIBLE);
        }
    }
}
