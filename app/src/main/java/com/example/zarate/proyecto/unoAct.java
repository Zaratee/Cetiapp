package com.example.zarate.proyecto;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class unoAct extends AppCompatActivity {

    Button ingresarbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uno);
        ingresarbtn = (Button) findViewById(R.id.btn_ingresarAlumno);
        ingresarbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent alumnointent = new Intent(unoAct.this,alumno1stAct.class);
                startActivity(alumnointent);

            }
        });
    }
}
