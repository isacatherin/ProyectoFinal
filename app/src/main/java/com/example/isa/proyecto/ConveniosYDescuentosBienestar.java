package com.example.isa.proyecto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class ConveniosYDescuentosBienestar extends AppCompatActivity {
    WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_convenios_ydescuentos_bienestar);
        webView = (WebView)findViewById(R.id.ConveniosYDescuentosBienestar);
        webView.loadUrl("http://www.uniremington.edu.co/manizales/1459-convenios-bienestar.html");
    }
}
