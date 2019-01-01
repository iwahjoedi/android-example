package com.kalian.bmc.bhabinm.activity;

import android.support.v7.app.AppCompatActivity;
//import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.os.Bundle;

import com.kalian.bmc.bhabinm.R;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(SplashScreen.this,MainScreen.class));
                finish();   
            }
        },3000);

    }
}
