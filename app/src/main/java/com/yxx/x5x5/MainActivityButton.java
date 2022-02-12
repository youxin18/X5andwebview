package com.yxx.x5x5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivityButton extends AppCompatActivity {
    private Button an_http;
    private Button an_https;
    private Button x_http;
    private Button x_h5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_button);
        an_http=findViewById(R.id.an_http);
        an_https=findViewById(R.id.an_https);
        x_http=findViewById(R.id.x_http);
        x_h5=findViewById(R.id.x_h5);
        an_http.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivityButton.this,HttpActivity.class);
                startActivity(intent);
            }
        });
        an_https.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivityButton.this,HttpsActivity.class);
                startActivity(intent);
            }
        });
        x_http.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivityButton.this,MainActivity.class);
                startActivity(intent);
            }
        });
        x_h5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivityButton.this,H5Activity.class);
                startActivity(intent);
            }
        });
    }
}