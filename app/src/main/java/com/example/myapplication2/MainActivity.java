package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;
import android.content.Intent;
import android.net.Uri;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button url;
        url=(Button)findViewById(R.id.btn3);
        url.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                {
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.tutsplus.com"));
                    startActivity(intent);
                };
            }
            });
    }
    public void miclick(View view){
        switch (view.getId()){
            case R.id.btn1:
                Button b=(Button)view;
                TextView tt=(TextView) findViewById(R.id.lbl);
                        tt.setText("Bienvenidos a Mundo Programming");
                break;

            case R.id.btn2:
                Button b2=(Button)view;
                Toast.makeText(this, "Hola Mundo",Toast.LENGTH_SHORT).show();
                break;

            case R.id.lbl:
                TextView txt=(TextView)view;
                Toast.makeText(this, "Hola Perrines",Toast.LENGTH_SHORT).show();
                break;

        }
    }
}