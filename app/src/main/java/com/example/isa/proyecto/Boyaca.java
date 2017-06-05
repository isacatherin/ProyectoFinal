package com.example.isa.proyecto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class Boyaca extends AppCompatActivity {
    WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boyaca);
        webView = (WebView)findViewById(R.id.Boyaca);
        webView.loadUrl("http://www.uniremington.edu.co/boyaca/");
    }
}
