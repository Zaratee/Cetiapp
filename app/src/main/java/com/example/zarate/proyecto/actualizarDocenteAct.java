package com.example.zarate.proyecto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class actualizarDocenteAct extends AppCompatActivity {
    Spinner Carrera;
    ArrayAdapter<CharSequence> adaptCarrera;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actualizar_docente);

        Carrera = (Spinner) findViewById(R.id.spin_carreraActualizarDocente);
        adaptCarrera = ArrayAdapter.createFromResource(this,R.array.carreras,android.R.layout.simple_spinner_item);
        adaptCarrera.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        Carrera.setAdapter(adaptCarrera);
    }
}
