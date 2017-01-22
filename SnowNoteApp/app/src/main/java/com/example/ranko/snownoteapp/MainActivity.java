package com.example.ranko.snownoteapp;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setTitle("Snow Note");
        setContentView(R.layout.activity_main);
        //Transition mFadeTransition = new Fade();
        //TransitionManager.go(mEndingScene, mFadeTransition);
    }
}
