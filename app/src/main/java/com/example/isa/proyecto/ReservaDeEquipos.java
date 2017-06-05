package com.example.isa.proyecto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class ReservaDeEquipos extends AppCompatActivity {
    WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reserva_de_equipos);
        webView = (WebView)findViewById(R.id.ReservaDeEquipos);
        webView.loadUrl("http://reservas.uniremingtonmanizales.edu.co/login.php");
    }
}
