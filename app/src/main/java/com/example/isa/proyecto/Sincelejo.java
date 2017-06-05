package com.example.isa.proyecto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class Sincelejo extends AppCompatActivity {
    WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sincelejo);
        webView = (WebView)findViewById(R.id.Sincelejo);
        webView.loadUrl("http://www.uniremington.edu.co/sincelejo/");
    }
}
