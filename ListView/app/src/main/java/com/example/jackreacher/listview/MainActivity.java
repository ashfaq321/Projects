package com.example.jackreacher.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText editTextPassword;
    CheckBox chkBoxBtn;
    ListView citiesBeautifulWorld;
    ArrayAdapter citiesBeautifulWorldArrayAdapter;
    String[] citiesWorld = {"Islamabad", "Melbourn", "Sydney", "Alice Springs", "London", "Rome", "Florence", "Paris", "Vience", "Amsterdam"
            , "San Fransisco", "Las Vegas", "Istambol"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        chkBoxBtn=(CheckBox)findViewById(R.id.chk_box_btn);
        editTextPassword=(EditText)findViewById(R.id.edit_text_password);
        citiesBeautifulWorld = (ListView) findViewById(R.id.cities_beautiful_world);
        citiesBeautifulWorldArrayAdapter = new ArrayAdapter(MainActivity.this, R.layout.dummy_row_style, citiesWorld);
        citiesBeautifulWorld.setAdapter(citiesBeautifulWorldArrayAdapter);

        citiesBeautifulWorld.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                // Getting text out from TextView
                TextView mTitleText = (TextView) view;
                String citiesName = mTitleText.getText().toString();
                Toast.makeText(MainActivity.this, citiesName, Toast.LENGTH_SHORT).show();


            }
        });
        chkBoxBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                {
                    editTextPassword.setInputType(InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD);
                }
                else
                {
                    editTextPassword.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);
                }
            }
        });

    }
    /*Rule No 2: One method never define another method but it can use it.*/
    /*Rule no 3: in method super statement should be first statement,and return should be the last.*/

    @Override
    /**/
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.basic_menu_test, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        /*Using Switch statement*/
        switch (id) {

            case R.id.opt_menu_refresh:
                Toast.makeText(this, "Refresh", Toast.LENGTH_SHORT).show();
                break;
            case R.id.opt_menu_search:
                Toast.makeText(this, "Search", Toast.LENGTH_SHORT).show();
                break;
            case R.id.opt_menu_select:
                Toast.makeText(this, "Select", Toast.LENGTH_SHORT).show();
                break;
            case R.id.opt_menu_edit:
                Toast.makeText(this, "Edit", Toast.LENGTH_SHORT).show();
                break;
            case R.id.opt_menu_delete:
                Toast.makeText(this, "Delete", Toast.LENGTH_SHORT).show();
                break;
            case R.id.opt_menu_info:
                Toast.makeText(this, "Information", Toast.LENGTH_SHORT).show();
                break;
        }
         /*Using if else Statement*/
        /*if(id == R.id.opt_menu_refresh)
        {
            Toast.makeText(this, "Refresh", Toast.LENGTH_SHORT).show();
        }
        else if(id==R.id.opt_menu_search)
        {
            Toast.makeText(this, "Search", Toast.LENGTH_SHORT).show();
        }else if(id==R.id.opt_menu_select)
        {
            Toast.makeText(this, "Select", Toast.LENGTH_SHORT).show();
        }else if (id==R.id.opt_menu_edit)
        {
            Toast.makeText(this, "Edit", Toast.LENGTH_SHORT).show();
        }else if(id==R.id.opt_menu_delete)
        {
            Toast.makeText(this, "Delete", Toast.LENGTH_SHORT).show();
        }else if(id==R.id.opt_menu_info)
        {
            Toast.makeText(this, "Information", Toast.LENGTH_SHORT).show();
        }*/

        return true;
    }
}
