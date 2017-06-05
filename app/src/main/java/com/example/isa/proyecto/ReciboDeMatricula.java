package com.example.isa.proyecto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class ReciboDeMatricula extends AppCompatActivity {
    WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recibo_de_matricula);
        webView = (WebView)findViewById(R.id.ReciboDeMatricula);
        webView.loadUrl("http://www.uniremington.edu.co/manizales/843-recibo-de-matricula.html\n");
    }
}
