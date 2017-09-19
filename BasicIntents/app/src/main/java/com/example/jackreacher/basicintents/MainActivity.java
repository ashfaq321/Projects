package com.example.jackreacher.basicintents;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ListView bestSoftwareHousesInPakistan;
    ArrayAdapter bestSoftwareHousesInPakistanArrayAdapter;
    String[] softwareHousesData={"Zepto Systems","NetSol Technologies","Ovex Technologies","TRG tech","System Private Ltd",
    "Kalsoft","Elixir Tech Ibds","Elixir Technologies Pakistan(PVT)Ltd","Macrosoft Pakistan",
    "Xavor Corporation","Techlogix","Pakistan Software Houses Association","SolotionDotsSystem","TMR Consult"
    ,"LMKR","LMKT","Seven Technologies","Detam Suquare","Power Objects"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bestSoftwareHousesInPakistan=(ListView)findViewById(R.id.list_vu_software_houses);
        bestSoftwareHousesInPakistanArrayAdapter=new ArrayAdapter(MainActivity.this,R.layout.list_custom_design,softwareHousesData);
        bestSoftwareHousesInPakistan.setAdapter(bestSoftwareHousesInPakistanArrayAdapter);

        bestSoftwareHousesInPakistan.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                TextView itemTextView=(TextView) view;
                String incomingText=itemTextView.getText().toString();
                startNextPageWithSoftwareHouseName(incomingText);



            }
        });

        /*i was doing intent practice and it didn't worked.
        * i will do it dont worry*/
        /*Intent sendIntent=new Intent();
        sendIntent.setAction(Intent.ACTION_SEND);
        sendIntent.putExtra(Intent.EXTRA_TEXT,"textmessage");
        sendIntent.setType("text/plain");
        //it will verify to resolve activity mean either app has installed or not.
        if(sendIntent.resolveActivity(getPackageManager())!= null)
            startActivity(sendIntent);*/
    }
    private void startNextPageWithSoftwareHouseName(String softwareHouseName){
        Intent mIntent=new Intent(MainActivity.this,Second_Activity.class);
        mIntent.putExtra("software_house_name",softwareHouseName);
        startActivity(mIntent);
    }
}
