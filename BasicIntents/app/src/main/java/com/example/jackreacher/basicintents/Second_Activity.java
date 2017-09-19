package com.example.jackreacher.basicintents;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by JackReacher on 9/7/2017.
 */

public class Second_Activity extends AppCompatActivity{
    TextView textVuNextPageId;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        textVuNextPageId=(TextView)findViewById(R.id.txt_vu_nxt_page_id);
        Intent callerIntent=getIntent();
        String incomingSoftwareHouseName=callerIntent.getStringExtra("software_house_name");
        textVuNextPageId.setText(incomingSoftwareHouseName);
    }
}
