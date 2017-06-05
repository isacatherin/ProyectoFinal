package com.example.isa.proyecto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class LineamientosAcademicos extends AppCompatActivity {
    WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lineamientos_academicos);
        webView = (WebView) findViewById(R.id.LineamientosAcademicos);
        webView.loadUrl("http://www.uniremington.edu.co/manizales/general/uniremington/2016-02-10-22-02-36.html");
    }
}
