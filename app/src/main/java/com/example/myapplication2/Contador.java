package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.TextView;

public class Contador extends AppCompatActivity {
    TextView Count;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contador);
        Count=(TextView)findViewById(R.id.Contador);
        CountDownTimer Cont = new CountDownTimer(5000,1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                Count.setText(String.valueOf( millisUntilFinished/1000));
            }
            @Override
            public void onFinish() {
            startActivity(new Intent(getApplicationContext(),MainActivity.class));
            }
        }.start();
    }
}