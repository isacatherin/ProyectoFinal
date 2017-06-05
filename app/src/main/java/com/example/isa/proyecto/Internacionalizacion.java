package com.example.isa.proyecto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class Internacionalizacion extends AppCompatActivity {
    WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_internacionalizacion);
        webView = (WebView)findViewById(R.id.Internacionalizacion);
        webView.loadUrl("http://www.uniremington.edu.co/internacionalizacion.html");
    }
}
