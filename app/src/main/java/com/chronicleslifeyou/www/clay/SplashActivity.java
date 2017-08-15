package com.chronicleslifeyou.www.clay;

import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.chronicleslifeyou.www.clay.Login.View.LoginActivity;

public class SplashActivity extends AppCompatActivity {
    CountDownTimer StartJapa_Timer;
    TextView count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        StartJapa_Timer = new CountDownTimer(5000, 1000) {
            @Override
            public void onTick(long l) {

            }

            @Override
            public void onFinish() {
                startActivity(new Intent(getApplicationContext(),LoginActivity.class));
                finish();


            }

        };
        StartJapa_Timer.start();
    }


    }




