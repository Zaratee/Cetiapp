package com.example.zarate.proyecto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class crearDocenteAct extends AppCompatActivity {

    Spinner Carrera;
    ArrayAdapter<CharSequence> adaptCarrera;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crear_docente);

        Carrera = (Spinner) findViewById(R.id.spin_carreraCrearDocente);
        adaptCarrera = ArrayAdapter.createFromResource(this,R.array.carreras,android.R.layout.simple_spinner_item);
        adaptCarrera.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        Carrera.setAdapter(adaptCarrera);

    }
}
