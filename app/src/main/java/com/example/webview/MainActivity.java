package com.example.webview;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;

import im.delight.android.webview.AdvancedWebView;

public class MainActivity extends AppCompatActivity {
    Button load;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        load=findViewById(R.id.button);
    }

}