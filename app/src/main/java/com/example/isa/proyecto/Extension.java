package com.example.isa.proyecto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class Extension extends AppCompatActivity {
    WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_extension);
        webView = (WebView)findViewById(R.id.Extension);
        webView.loadUrl("http://www.uniremington.edu.co/manizales/753-extension.html");
    }
}
