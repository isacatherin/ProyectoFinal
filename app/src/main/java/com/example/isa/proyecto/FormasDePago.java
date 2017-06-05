package com.example.isa.proyecto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class FormasDePago extends AppCompatActivity {
    WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formas_de_pago);
        webView = (WebView)findViewById(R.id.FormasDePago);
        webView.loadUrl("http://www.uniremington.edu.co/manizales/779-formas-de-pago.html");
    }
}
