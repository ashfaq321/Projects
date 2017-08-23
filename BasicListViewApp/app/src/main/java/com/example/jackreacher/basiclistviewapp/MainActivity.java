package com.example.jackreacher.basiclistviewapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ListView citiesBeautifulWorld;
    ArrayAdapter citiesBeautifulWorldArrayAdapter;
    String[] citiesWorld={"Islamabad","Melbourn","Sydney","Alice Springs","London","Rome","Florence","Paris","Vience","Amsterdam"
    ,"San Fransisco","Las Vegas","Istambol"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        citiesBeautifulWorld=(ListView)findViewById(R.id.cities_beautiful_world);
        citiesBeautifulWorldArrayAdapter=new ArrayAdapter(MainActivity.this,android.R.layout.simple_list_item_1,citiesWorld);
        citiesBeautifulWorld.setAdapter(citiesBeautifulWorldArrayAdapter);

        citiesBeautifulWorld.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                // Getting text out from TextView
                TextView mTitleText=(TextView)view;
                String citiesName=mTitleText.getText().toString();
                Toast.makeText(MainActivity.this, citiesName , Toast.LENGTH_SHORT).show();


            }
        });

    }
}
