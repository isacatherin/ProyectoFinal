package com.example.isa.proyecto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class Pregrado extends AppCompatActivity {
    WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pregrado);
        webView = (WebView) findViewById(R.id.Pregrado);
        webView.loadUrl("http://www.uniremington.edu.co/manizales/buscador.html?isc=1&category_id=&xf_1=3&xf_2=33&programa=si");
    }
}
