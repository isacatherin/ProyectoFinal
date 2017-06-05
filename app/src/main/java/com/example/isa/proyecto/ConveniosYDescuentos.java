package com.example.isa.proyecto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class ConveniosYDescuentos extends AppCompatActivity {
    WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_convenios_ydescuentos);
        webView = (WebView)findViewById(R.id.ConveniosYDescuetos);
        webView.loadUrl("http://www.uniremington.edu.co/manizales/781-convenios-y-descuentos.html");
    }
}
