package com.example.isa.proyecto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class SedeCable extends AppCompatActivity {
    WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sede_cable);
        webView = (WebView)findViewById(R.id.SedeCable);
        webView.loadUrl("http://www.uniremington.edu.co/manizales/792-sede-cable.html");
    }
}
