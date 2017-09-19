package com.example.jackreacher.calculator;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by JackReacher on 9/13/2017.
 */

public class About_Us_Activity extends AppCompatActivity {
    TextView txtVuAboutUs;
    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        setContentView(R.layout.activity_us_about);
        txtVuAboutUs=(TextView)findViewById(R.id.txt_vu_about_us);
        Intent incomingIntnet=getIntent();
        String companyName=incomingIntnet.getStringExtra("company_name");
        txtVuAboutUs.setText(companyName);
    }
}
