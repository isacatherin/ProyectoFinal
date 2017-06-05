package com.example.isa.proyecto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class RepresentantesEstudiantiles extends AppCompatActivity {
    WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_representantes_estudiantiles);
        webView = (WebView)findViewById(R.id.RepresentantesEstudiantiles);
        webView.loadUrl("http://www.uniremington.edu.co/manizales/1461-representantes-de-estudiantiles.html");
    }
}
