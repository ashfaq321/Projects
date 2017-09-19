package com.example.jackreacher.calculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_options,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id=item.getItemId();
        if(R.id.optn_menu_privacy==id)
        {
            Toast.makeText(this, "Priacy", Toast.LENGTH_SHORT).show();
        }
        else
        {
            Intent mIntent=new Intent(MainActivity.this,About_Us_Activity.class);
            mIntent.putExtra("company_name","MegaApps");
            startActivity(mIntent);
        }
        return true;
    }
}
