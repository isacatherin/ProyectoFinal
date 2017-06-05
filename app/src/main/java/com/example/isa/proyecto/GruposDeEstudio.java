package com.example.isa.proyecto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class GruposDeEstudio extends AppCompatActivity {
    WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grupos_de_estudio);
        webView = (WebView)findViewById(R.id.GruposDeEstudio);
        webView.loadUrl("http://www.uniremington.edu.co/manizales/general/programas/semilleros.html");
    }
}
