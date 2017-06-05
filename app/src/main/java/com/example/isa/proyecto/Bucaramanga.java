package com.example.isa.proyecto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class Bucaramanga extends AppCompatActivity {
    WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bucaramanga);
        webView = (WebView) findViewById(R.id.Bucaramanga);
        webView.loadUrl("http://www.uniremington.edu.co/bucaramanga/");
    }
}
