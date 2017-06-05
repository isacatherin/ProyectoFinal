package com.example.isa.proyecto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class RequisitosDeInscripcion extends AppCompatActivity {
    WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_requisitos_de_inscripcion);
        webView = (WebView)findViewById(R.id.RequisitosDeInscripcion);
        webView.loadUrl("http://www.uniremington.edu.co/manizales/778-requisitos-de-inscripcion.html");
    }
}
