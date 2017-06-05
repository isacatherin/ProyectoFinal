package com.example.isa.proyecto;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    EditText correo;
    EditText contraseña;
    Button ingresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        correo = (EditText) findViewById(R.id.correo);
        contraseña = (EditText) findViewById(R.id.contraseña);
        ingresar = (Button) findViewById(R.id.BotonIngresar);
        ingresar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String usuario = correo.getText() .toString();
                String contra = contraseña.getText().toString();

                switch (v.getId()){
                    case R.id.BotonIngresar:
                        if (usuario.equals("isabel") && contra.equals("12345")){
                            Toast.makeText(getApplicationContext(), "Bienvenido", Toast.LENGTH_SHORT) .show();
                            Intent intent = new Intent(MainActivity.this, Menu.class);
                            startActivity(intent);
                        }else {
                            Toast.makeText(getApplicationContext(), "Usuario o Contraseña incorrectos", Toast.LENGTH_SHORT) .show();
                        }
                }
            }

        });
    }

    @Override
    public void onClick(View v) {

    }
}
