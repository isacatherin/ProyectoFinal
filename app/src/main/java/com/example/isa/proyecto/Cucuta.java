package com.example.isa.proyecto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class Cucuta extends AppCompatActivity {
    WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cucuta);
        webView =(WebView)findViewById(R.id.Cucuta);
        webView.loadUrl("http://www.uniremington.edu.co/cucuta/");
    }
}
