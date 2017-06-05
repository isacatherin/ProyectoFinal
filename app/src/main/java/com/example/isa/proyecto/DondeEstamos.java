package com.example.isa.proyecto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class DondeEstamos extends AppCompatActivity {
    WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donde_estamos);
        webView = (WebView)findViewById(R.id.DondeEstamos);
        webView.loadUrl("http://www.uniremington.edu.co/uniremington/donde-estamos.html");
    }
}
