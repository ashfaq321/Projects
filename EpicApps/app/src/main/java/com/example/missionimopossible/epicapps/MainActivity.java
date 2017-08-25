package com.example.missionimopossible.epicapps;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.util.Log;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.inputmethod.InputMethod;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    Animation alphaLogin;
    EditText passwordEditText;
    CheckBox checkBoxId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e("onCreate()","Created");
        alphaLogin=AnimationUtils.loadAnimation(MainActivity.this,R.anim.alpha_anim_login);
        passwordEditText=(EditText)findViewById(R.id.password_edittext);
        checkBoxId=(CheckBox)findViewById(R.id.chck_box_id);
        checkBoxId.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b)
                {
                    passwordEditText.setInputType(InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD);
                }
                else{
                   passwordEditText.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);
                }
            }
        });
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
