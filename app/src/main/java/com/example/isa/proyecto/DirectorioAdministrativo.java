package com.example.isa.proyecto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class DirectorioAdministrativo extends AppCompatActivity {
    WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_directorio_administrativo);
        webView = (WebView)findViewById(R.id.DirectorioAdministrativo);
        webView.loadUrl("http://www.uniremington.edu.co/manizales/1445-directorio-administrativo.html");
    }
}
