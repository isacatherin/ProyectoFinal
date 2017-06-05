package com.example.isa.proyecto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class ModuloAtencionPQRS extends AppCompatActivity {
    WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modulo_atencion_pqrs);
        webView = (WebView)findViewById(R.id.ModuloAtencionPQRS);
        webView.loadUrl("http://sim.uniremington.edu.co/formrem/pqrs/");
    }
}
