package com.busck.labtwo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;


public class SplashActivity extends Activity {

    private Boolean isBackButtonPressed = false;
    private static final int SPLASH_DURATION = 2000;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Handler startActivityHandler = new Handler(); //Skapar en handler som skall styra när spashen skall stängas

        startActivityHandler.postDelayed(new Runnable() { //Ger min handler en kod att köra efter angiven tid
            @Override
            public void run() {

                finish(); //Close splash activity

                if (!isBackButtonPressed){ //If Backbutton have not
                    Intent intent = new Intent(SplashActivity.this, MenuActivity.class);
                    SplashActivity.this.startActivity(intent);
                }
            }
        }, SPLASH_DURATION); //Tiden spash visas

    }

    @Override
    public void onBackPressed(){ //Om man klickar på bakåt knappen
        super.onBackPressed();

        isBackButtonPressed = true;
    }

}
