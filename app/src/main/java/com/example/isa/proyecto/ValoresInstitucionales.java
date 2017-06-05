package com.example.isa.proyecto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class ValoresInstitucionales extends AppCompatActivity {
    WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_valores_institucionales);
        webView = (WebView)findViewById(R.id.ValoresInstitucionales);
        webView.loadUrl("http://www.uniremington.edu.co/manizales/general/uniremington/valores-institucionales.html");
    }
}
