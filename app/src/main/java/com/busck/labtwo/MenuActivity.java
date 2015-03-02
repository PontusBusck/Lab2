package com.busck.labtwo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class MenuActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    public void openShapesActivity(View view) {
        Intent intent = new Intent(this, ShapesActivity.class);
        this.startActivity(intent);
    }

    public void openScreenActivity(View view) {
        Intent intent = new Intent(this, ScreenInfoActivity.class);
        this.startActivity(intent);
    }

    public void openCirclesActivity(View view) {
        Intent intent = new Intent(this, CirclesActivity.class);
        this.startActivity(intent);
    }

    public void openBitmapActivity(View view) {
        Intent intent = new Intent(this, BitmapActivity.class);
        this.startActivity(intent);
    }
}
