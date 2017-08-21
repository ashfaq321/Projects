package com.example.missionimopossible.parsinginandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btnTest;
    Spinner spinnerAges;
    TextView mTxtVuNum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnTest = (Button) findViewById(R.id.btn_test);
        spinnerAges = (Spinner) findViewById(R.id.spinner_ages);
        mTxtVuNum = (TextView) findViewById(R.id.m_txt_vu_num);
        btnTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String numAsString = mTxtVuNum.getText().toString();
                int convertedNum = Integer.valueOf(numAsString);
                convertedNum++;
                mTxtVuNum.setText(String.valueOf(convertedNum));
            }
        });
        spinnerAges.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long Id) {
                Toast.makeText(MainActivity.this, "Item" + position, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

    }
}
