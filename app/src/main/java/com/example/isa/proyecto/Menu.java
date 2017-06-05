package com.example.isa.proyecto;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;
import android.widget.ToggleButton;

import java.util.ArrayList;
import java.util.List;

public class Menu extends AppCompatActivity {
    Spinner spinnerprogramas;
    Spinner spinneruniremington;
    Spinner spinnersedes;
    Spinner spinneradmisiones;
    Spinner spinnerplataformas;
    Spinner spinnerbienestaryegresados;
    Spinner spinnercomunidad;
    Spinner spinnerubicacion;
    ImageView salir;
    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        spinneruniremington = (Spinner) findViewById(R.id.spinnerUniremington);
        spinnersedes = (Spinner) findViewById(R.id.spinnerSedes);
        spinnerprogramas = (Spinner) findViewById(R.id.spinnerProgramas);
        spinneradmisiones = (Spinner) findViewById(R.id.spinnerAdmisiones);
        spinnerplataformas = (Spinner) findViewById(R.id.spinnerPlataformas);
        spinnerbienestaryegresados = (Spinner) findViewById(R.id.spinnerBienestarYEgresados);
        spinnercomunidad = (Spinner) findViewById(R.id.spinnerComunidad);
        spinnerubicacion = (Spinner) findViewById(R.id.spinnerUbicacion);

        List list = new ArrayList();
        list.add("UNIREMINGTON");
        list.add("Misión - Visión");
        list.add("Valores Institucionales");
        list.add("Lineamientos Academicos");
        list.add("Calendario Academico");
        list.add("Reglamento Estudiantil");
        list.add("Directorio Administrativo");
        list.add("¿Donde Estamos?");

        List list1 = new ArrayList();
        list1.add("SEDES");
        list1.add("Armenia");
        list1.add("Boyacá");
        list1.add("Bucaramanga");
        list1.add("Cucuta");
        list1.add("Medellin");
        list1.add("Monteria");
        list1.add("Pasto");
        list1.add("Pereira");
        list1.add("Sincelejo");
        list1.add("Yopal");

        List list2 = new ArrayList();
        list2.add("PROGRAMAS");
        list2.add("Especializaciones");
        list2.add("Profesionales");
        list2.add("Tecnologicos");
        list2.add("Extensión");
        list2.add("Grupos de Estudio");

        List list3 = new ArrayList();
        list3.add("ADMISIONES");
        list3.add("Pre-Inscripcion");
        list3.add("Requisitos de Inscripcion");
        list3.add("Homologaciones");
        list3.add("Formas de Pago");
        list3.add("Convenios y Descuentos");

        List list4 = new ArrayList();
        list4.add("PLATAFORMAS");
        list4.add("Moodle");
        list4.add("Q10");
        list4.add("Recibo de Matricula");
        list4.add("Docuemntos Nuevos");
        list4.add("Reserva de Equipos");
        list4.add("Biblioteca Uniremington");
        list4.add("Modulo Atencion PQRS");

        List list5 = new ArrayList();
        list5.add("BIENESTAR Y EGRESADOS");
        list5.add("Internacionalizacion");
        list5.add("Representantes Estudiantiles");
        list5.add("Convenios y Descuentos");

        List list6 = new ArrayList();
        list6.add("COMUNIDAD");
        list6.add("Calendario - Eventos");
        list6.add("Encuesta");

        List list7 = new ArrayList();
        list7.add("UBICACION");
        list7.add("Sede Cable");
        list7.add("Sede Centro");

        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_dropdown_item_1line, list);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinneruniremington.setAdapter(arrayAdapter);

        spinneruniremington.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 1:
                        Intent misionvision = new Intent(Menu.this, MisionVision.class);
                        startActivity(misionvision);
                        break;
                    case 2:
                        Intent valoresinstitucionales = new Intent (Menu.this, ValoresInstitucionales.class);
                        startActivity(valoresinstitucionales);
                        //webView.loadUrl("http://uniremingtonmanizales.edu.co/administracion/");
                        break;
                    case 3:
                        Intent lineamientosacademicos = new Intent (Menu.this, LineamientosAcademicos.class);
                        startActivity(lineamientosacademicos);
                        //webView.loadUrl("http://uniremingtonmanizales.edu.co/contable/");
                        break;
                    case 4:
                        Intent calendarioacademico = new Intent (Menu.this, CalendarioAcademico.class);
                        startActivity(calendarioacademico);
                        //webView.loadUrl("http://uniremingtonmanizales.edu.co/contable/");
                        break;
                    case 5:
                        Intent reglamentoestudiantil = new Intent (Menu.this, ReglamentoEstudiantil.class);
                        startActivity(reglamentoestudiantil);
                        //webView.loadUrl("http://uniremingtonmanizales.edu.co/contable/");
                        break;
                    case 6:
                        Intent directorioadministrativo = new Intent (Menu.this, DirectorioAdministrativo.class);
                        startActivity(directorioadministrativo);
                        //webView.loadUrl("http://uniremingtonmanizales.edu.co/contable/");
                        break;
                    case 7:
                        Intent dondeestamos = new Intent (Menu.this, DondeEstamos.class);
                        startActivity(dondeestamos);
                        //webView.loadUrl("http://uniremingtonmanizales.edu.co/contable/");
                        break;


                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
            //revisar si esta opcion va en este punto
        });



        //Se crear un Array para mostrar el nombre seleccionado en una nueva pantalla de SEDES
        ArrayAdapter arrayAdapter1 = new ArrayAdapter(this, android.R.layout.simple_dropdown_item_1line, list2);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnersedes.setAdapter(arrayAdapter1);

        spinnersedes.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 1:
                        Intent armenia = new Intent(Menu.this, Armenia.class);
                        startActivity(armenia);
                        break;
                    case 2:
                        Intent boyaca = new Intent(Menu.this, Boyaca.class);
                        startActivity(boyaca);
                        break;
                    case 3:
                        Intent bucaramanga = new Intent(Menu.this, Bucaramanga.class);
                        startActivity(bucaramanga);
                        break;
                    case 4:
                        Intent cucuta = new Intent(Menu.this, Cucuta.class);
                        startActivity(cucuta);
                        break;
                    case 5:
                        Intent medellin = new Intent(Menu.this, Medellin.class);
                        startActivity(medellin);
                        break;
                    case 6:
                        Intent monteria = new Intent(Menu.this, Monteria.class);
                        startActivity(monteria);
                        break;
                    case 7:
                        Intent pasto = new Intent(Menu.this, Pasto.class);
                        startActivity(pasto);
                        break;
                    case 8:
                        Intent pereira = new Intent(Menu.this, Pereira.class);
                        startActivity(pereira);
                        break;
                    case 9:
                        Intent sincelejo = new Intent(Menu.this, Sincelejo.class);
                        startActivity(sincelejo);
                        break;
                    case 10:
                        Intent yopal = new Intent(Menu.this, Yopal.class);
                        startActivity(yopal);
                        break;


                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }

        });
        //Se crear un Array para mostrar el nombre seleccionado en una nueva pantalla de UNIREMINGTON
        ArrayAdapter arrayAdapter2 = new ArrayAdapter(this, android.R.layout.simple_dropdown_item_1line, list1);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerprogramas.setAdapter(arrayAdapter2);

        spinnerprogramas.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 1:
                        Intent especializaciones = new Intent(Menu.this, Especializaciones.class);
                        startActivity(especializaciones);
                        break;
                    case 2:
                        Intent pregrados = new Intent (Menu.this, Pregrado.class);
                        startActivity(pregrados);
                        //webView.loadUrl("http://uniremingtonmanizales.edu.co/administracion/");
                        break;
                    case 3:
                        Intent tecnologias = new Intent (Menu.this, Tecnologias.class);
                        startActivity(tecnologias);
                        //webView.loadUrl("http://uniremingtonmanizales.edu.co/contable/");
                        break;
                    case 4:
                        Intent extencion = new Intent (Menu.this, Extension.class);
                        startActivity(extencion);
                        //webView.loadUrl("http://uniremingtonmanizales.edu.co/contable/");
                        break;
                    case 5:
                        Intent gruposdeestudio = new Intent (Menu.this, GruposDeEstudio.class);
                        startActivity(gruposdeestudio);
                        //webView.loadUrl("http://uniremingtonmanizales.edu.co/contable/");
                        break;


                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        //Se crear un Array para mostrar el nombre seleccionado en una nueva pantalla de ADMISIONES
        ArrayAdapter arrayAdapter3 = new ArrayAdapter(this, android.R.layout.simple_dropdown_item_1line, list3);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinneradmisiones.setAdapter(arrayAdapter3);

        spinneradmisiones.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 1:
                        Intent preinscriocion = new Intent(Menu.this, PreInscripcion.class);
                        startActivity(preinscriocion);
                        break;
                    case 2:
                        Intent requisitosdeinscripcion = new Intent(Menu.this, RequisitosDeInscripcion.class);
                        startActivity(requisitosdeinscripcion);
                        break;
                    case 3:
                        Intent homologaciones = new Intent(Menu.this, Homologaciones.class);
                        startActivity(homologaciones);
                        break;
                    case 4:
                        Intent formasdepago = new Intent(Menu.this, FormasDePago.class);
                        startActivity(formasdepago);
                        break;
                    case 5:
                        Intent conveniosydescuentos = new Intent(Menu.this, ConveniosYDescuentos.class);
                        startActivity(conveniosydescuentos);
                        break;
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        //Se crear un Array para mostrar el nombre seleccionado en una nueva pantalla de PLATAFORMAS
        ArrayAdapter arrayAdapter4 = new ArrayAdapter(this, android.R.layout.simple_dropdown_item_1line, list4);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerplataformas.setAdapter(arrayAdapter4);

        spinnerplataformas.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 1:
                        Intent moodle = new Intent(Menu.this, Moodle.class);
                        startActivity(moodle);
                        break;
                    case 2:
                        Intent q10 = new Intent(Menu.this, Q10.class);
                        startActivity(q10);
                        break;
                    case 3:
                        Intent recibodematricula = new Intent(Menu.this, ReciboDeMatricula.class);
                        startActivity(recibodematricula);
                        break;
                    case 4:
                        Intent documentosnuevos = new Intent(Menu.this, DocumentosNuevos.class);
                        startActivity(documentosnuevos);
                        break;
                    case 5:
                        Intent reservadeequipos = new Intent(Menu.this, ReservaDeEquipos.class);
                        startActivity(reservadeequipos);
                        break;
                    case 7:
                        Intent bibliotecauniremington = new Intent(Menu.this, BibliotecaUniremington.class);
                        startActivity(bibliotecauniremington);
                        break;
                    case 8:
                        Intent moduloatencionpqrs = new Intent(Menu.this, ModuloAtencionPQRS.class);
                        startActivity(moduloatencionpqrs);
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        //Se crear un Array para mostrar el nombre seleccionado en una nueva pantalla de BIENESTAR Y EGRESADOS
        ArrayAdapter arrayAdapter5 = new ArrayAdapter(this, android.R.layout.simple_dropdown_item_1line, list5);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerbienestaryegresados.setAdapter(arrayAdapter5);

        spinnerbienestaryegresados.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 1:
                        Intent internacionalizacion = new Intent(Menu.this, Internacionalizacion.class);
                        startActivity(internacionalizacion);
                        break;
                    case 2:
                        Intent representantesestudiantiles = new Intent(Menu.this, RepresentantesEstudiantiles.class);
                        startActivity(representantesestudiantiles);
                        break;
                    case 3:
                        Intent conveniosbienestar = new Intent(Menu.this, ConveniosYDescuentosBienestar.class);
                        startActivity(conveniosbienestar);
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        //Se crear un Array para mostrar el nombre seleccionado en una nueva pantalla de COMUNIDAD
        ArrayAdapter arrayAdapter6 = new ArrayAdapter(this, android.R.layout.simple_dropdown_item_1line, list6);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnercomunidad.setAdapter(arrayAdapter6);

        spinnercomunidad.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 1:
                        Intent calendarioeventos = new Intent(Menu.this, CalendarioEventos.class);
                        startActivity(calendarioeventos);
                        break;
                    case 2:
                        Intent encuesta = new Intent(Menu.this, Encuesta.class);
                        startActivity(encuesta);
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        //Se crear un Array para mostrar el nombre seleccionado en una nueva pantalla de UBICACION
        ArrayAdapter arrayAdapter7 = new ArrayAdapter(this, android.R.layout.simple_dropdown_item_1line, list7);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerubicacion.setAdapter(arrayAdapter7);

        spinnerubicacion.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 1:
                        Intent sedecable = new Intent(Menu.this, SedeCable.class);
                        startActivity(sedecable);
                        break;
                    case 2:
                        Intent sedecentro = new Intent(Menu.this, SedeCentro.class);
                        startActivity(sedecentro);
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


        ToggleButton toggle;
        toggle = (ToggleButton)findViewById(R.id.toggleButton);

        toggle.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    Toast.makeText(getApplicationContext(),"Isabel Catherin Zapata Gil",Toast.LENGTH_LONG).show();
                }else{
                    Toast.makeText(getApplicationContext(),"Andres Felipe Montoya",Toast.LENGTH_LONG).show();
                }
            }
        });



        salir = (ImageView)findViewById(R.id.btnsalir);
        salir.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_MAIN);
                intent.addCategory(Intent.CATEGORY_HOME);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
            }
        }));
    }
}
