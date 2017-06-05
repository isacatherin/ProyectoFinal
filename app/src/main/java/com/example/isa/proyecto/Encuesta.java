package com.example.isa.proyecto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class Encuesta extends AppCompatActivity {
    WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_encuesta);
        webView = (WebView)findViewById(R.id.Encuesta);
        webView.loadUrl("http://www.uniremington.edu.co/manizales/1460-encuesta-bienestar-universitario-y-egresados.html");
    }
}
