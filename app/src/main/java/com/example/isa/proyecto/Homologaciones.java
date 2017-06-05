package com.example.isa.proyecto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class Homologaciones extends AppCompatActivity {
    WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homologaciones);
        webView = (WebView)findViewById(R.id.Homologaciones);
        webView.loadUrl("http://www.uniremington.edu.co/manizales/782-homologaciones.html");
    }
}
