package com.example.isa.proyecto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class DocumentosNuevos extends AppCompatActivity {
    WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_documentos_nuevos);
        webView = (WebView)findViewById(R.id.DocumentosNuevos);
        webView.loadUrl("http://www.uniremington.edu.co/manizales/844-documentos-nuevos.html");
    }
}
