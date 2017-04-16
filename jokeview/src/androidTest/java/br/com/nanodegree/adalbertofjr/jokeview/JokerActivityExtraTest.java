package br.com.nanodegree.adalbertofjr.jokeview;

import android.content.Context;
import android.content.Intent;
import android.support.test.InstrumentationRegistry;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import br.com.nanodegree.adalbertofjr.jokeview.ui.JokerActivity;

import static org.junit.Assert.assertEquals;

/**
 * JokerActivityExtraTest
 * Created by Adalberto Fernandes Júnior on 15/04/17.
 * Copyright © 2016. All rights reserved.
 */
@RunWith(AndroidJUnit4.class)
public class JokerActivityExtraTest {

    @Rule
    public ActivityTestRule<JokerActivity> activityRule =
            new ActivityTestRule<JokerActivity>(JokerActivity.class) {
                @Override
                protected Intent getActivityIntent() {
                    Context targetContext = InstrumentationRegistry.getInstrumentation()
                            .getTargetContext();
                    Intent result = new Intent(targetContext, JokerActivity.class);
                    result.putExtra(Intent.EXTRA_TEXT, "Uma piada sem graça");
                    return result;
                }
            };

    @Test
    public void testGetExtra() {
        String jokerExtra = activityRule.getActivity().getIntent().getStringExtra(Intent.EXTRA_TEXT);
        assertEquals(jokerExtra, "Uma piada sem graça");
    }
}
