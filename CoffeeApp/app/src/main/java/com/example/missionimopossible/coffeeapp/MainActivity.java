package com.example.missionimopossible.coffeeapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btnAddCoffee;
    TextView txtVuNum;
    Button btnSubCoffee;
    Spinner spinnerAges;
    Animation alphaAnim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinnerAges=(Spinner)findViewById(R.id.spinner_ages);
        btnAddCoffee = (Button) findViewById(R.id.btn_add_coffee);
        btnSubCoffee = (Button) findViewById(R.id.btn_sub_coffee);
        txtVuNum = (TextView) findViewById(R.id.txt_vu_num);
        alphaAnim= AnimationUtils.loadAnimation(MainActivity.this,R.anim.alpha_anim);
        btnAddCoffee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String incomingText = txtVuNum.getText().toString();
                int convertedNum = Integer.valueOf(incomingText);
                convertedNum++;
                String ans = String.valueOf(convertedNum);
                txtVuNum.setText(ans);
                btnSubCoffee.startAnimation(alphaAnim);
            }
        });
        btnSubCoffee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String incomingText = txtVuNum.getText().toString();
                int convertedNum = Integer.valueOf(incomingText);
                convertedNum--;
                if (convertedNum < 0) {
                    txtVuNum.setText("0");
                } else {
                    String ans = String.valueOf(convertedNum);
                    txtVuNum.setText(ans);
                }
                btnAddCoffee.startAnimation(alphaAnim);

            }
        });
    }
}
