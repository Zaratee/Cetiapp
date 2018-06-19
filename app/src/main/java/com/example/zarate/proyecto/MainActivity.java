package com.example.zarate.proyecto;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button alumno, docente, admin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        alumno = (Button) findViewById(R.id.btn_alumnoAct1);
        docente = (Button) findViewById(R.id.btn_docenteAct1);
        admin = (Button) findViewById(R.id.btn_adminAct1);

        alumno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                initAlumn();
            }
        });

        docente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                initDocen();
            }
        });

        admin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                initAdmin();
            }
        });

    }

    public void initAlumn() {
        Intent alu = new Intent(MainActivity.this, unoAct.class);
        startActivity(alu);
    }

    public void initDocen() {
        Intent doc = new Intent(MainActivity.this, loginActDocent.class);
        startActivity(doc);
    }

    public void initAdmin(){
        Intent adm = new Intent(MainActivity.this,loginActAdmin.class);
        startActivity(adm);
    }
}
