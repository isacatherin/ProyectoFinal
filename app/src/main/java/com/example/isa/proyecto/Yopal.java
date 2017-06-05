package com.example.isa.proyecto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class Yopal extends AppCompatActivity {
    WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yopal);
        webView = (WebView)findViewById(R.id.Yopal);
        webView.loadUrl("http://www.uniremington.edu.co/yopal/");
    }
}
