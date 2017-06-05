package com.example.isa.proyecto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class CalendarioEventos extends AppCompatActivity {
    WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendario_eventos);
        webView = (WebView)findViewById(R.id.CalendarioEventos);
        webView.loadUrl("http://www.uniremington.edu.co/manizales/general/comunidad/calendario-eventos.html");
    }
}
