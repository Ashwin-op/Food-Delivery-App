package com.example.healthify;

import android.content.Intent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;

public class SplashScreen extends AppCompatActivity {

    private final int SPLASH_DISPLAY_DURATION = 1000;

    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);


        new Handler().postDelayed(() -> {

            Intent mainIntent = new Intent(SplashScreen.this, login.class);
            SplashScreen.this.startActivity(mainIntent);
            SplashScreen.this.finish();
        }, SPLASH_DISPLAY_DURATION);
    }
}
