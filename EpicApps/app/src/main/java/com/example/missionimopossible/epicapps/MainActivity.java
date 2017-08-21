package com.example.missionimopossible.epicapps;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e("onCreate()","Created");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("onStart","Started");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("onResume","Rusumed");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("onPause","Paused");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("onStop","Stopped");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("onDestroy","Destroyed");
    }
}
