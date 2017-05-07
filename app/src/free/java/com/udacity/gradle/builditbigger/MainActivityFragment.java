package com.udacity.gradle.builditbigger;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.udacity.gradle.builditbigger.task.GetJokeEndpointAsyncTask;
import com.udacity.gradle.builditbigger.util.Constants;


/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment
        implements View.OnClickListener {

    private static final String LOG_TAG = MainActivityFragment.class.getSimpleName();

    private InterstitialAd interstitialAd;

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_main, container, false);
        root.findViewById(R.id.main_btn_tellJoke).setOnClickListener(this);

        AdView mAdView = (AdView) root.findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder()
                .addTestDevice(AdRequest.DEVICE_ID_EMULATOR)
                .build();
        mAdView.loadAd(adRequest);

        interstitialAd = new InterstitialAd(getActivity());
        interstitialAd.setAdUnitId(Constants.AD_UNIT_ID);

        interstitialAd.setAdListener(new AdListener() {
            @Override
            public void onAdClosed() {
                requestNewInterstitial();
                new GetJokeEndpointAsyncTask().execute(getActivity());
            }
        });

        requestNewInterstitial();

        return root;
    }

    private void requestNewInterstitial() {
        AdRequest adRequest = new AdRequest.Builder()
                .addTestDevice(AdRequest.DEVICE_ID_EMULATOR)
                .addTestDevice(Constants.AD_TEST_DEVICE)
                .build();

        interstitialAd.loadAd(adRequest);
    }

    @Override
    public void onClick(View v) {
        tellJoke();
    }

    public void tellJoke() {
        if (interstitialAd.isLoaded()) {
            Log.i(LOG_TAG, "Carregando anuncio");
            interstitialAd.show();
        } else {
            Log.i(LOG_TAG, "Buscando piada");
            new GetJokeEndpointAsyncTask().execute(getActivity());
        }
    }
}
