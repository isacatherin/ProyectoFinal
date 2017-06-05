package com.example.isa.proyecto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class BibliotecaUniremington extends AppCompatActivity {
    WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biblioteca_uniremington);
        webView = (WebView)findViewById(R.id.BibliotecaUniremington);
        webView.loadUrl("http://biblioteca.uniremington.edu.co/index.php/login\n");
    }
}
