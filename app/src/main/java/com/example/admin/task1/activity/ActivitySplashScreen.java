package com.example.admin.task1.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import com.example.admin.task1.R;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by Admin on 7/21/2017.
 */

public class ActivitySplashScreen extends Activity {
    long delay = 4000;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.layout_splash_screen);
        Timer RunSplash = new Timer();

        TimerTask ShowSplash = new TimerTask() {
            @Override
            public void run() {
                finish();

                Intent intent = new Intent(ActivitySplashScreen.this, ActivityMain.class);
                startActivity(intent);
            }
        };

        RunSplash.schedule(ShowSplash, delay);

    }

}
