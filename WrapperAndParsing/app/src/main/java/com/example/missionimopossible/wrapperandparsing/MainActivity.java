package com.example.missionimopossible.wrapperandparsing;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btnTest;
    Spinner spinnerAgesDay;
    Spinner spinnerAgesMonth;
    Spinner spinnerAgesYear;
    TextView txtVuNumBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtVuNumBtn=(TextView)findViewById(R.id.txt_vu_num_btn);
        btnTest=(Button)findViewById(R.id.btn_test);
        spinnerAgesDay=(Spinner)findViewById(R.id.spinner_ages_day);
        spinnerAgesMonth=(Spinner)findViewById(R.id.spinner_ages_month);
        spinnerAgesYear=(Spinner)findViewById(R.id.spinner_ages_year);
        spinnerAgesDay.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
                Toast.makeText(MainActivity.this, "Day"+position, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }

        });
        spinnerAgesMonth.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        spinnerAgesYear.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        btnTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String numAsString=txtVuNumBtn.getText().toString();
                int convertedNum=Integer.valueOf(numAsString);
                convertedNum++;
                txtVuNumBtn.setText(String.valueOf(convertedNum));
            }
        });
    }
}
