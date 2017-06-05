package com.example.isa.proyecto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class MisionVision extends AppCompatActivity {
    WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mision_vision);
        webView = (WebView)findViewById(R.id.MisionVision);
        webView.loadUrl("http://www.uniremington.edu.co/manizales/general/uniremington/mision-vision.html");
    }
}
