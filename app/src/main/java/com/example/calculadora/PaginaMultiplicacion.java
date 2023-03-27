package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class PaginaMultiplicacion extends AppCompatActivity {

    EditText et1, et2, tvRes;

    Button btnResultado, btnRegresar;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagina_multiplicacion);

        et1 = findViewById(R.id.editTextNumeroUno);
        et2 = findViewById(R.id.editTextNumeroDos);
        tvRes = findViewById(R.id.editTextResultado);
        btnResultado = findViewById(R.id.btonOperacionM);
        btnRegresar = findViewById(R.id.buttonRegresarMult);

        btnResultado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Multiplicar();
            }
        });

        btnRegresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Regresar();
            }
        });
    }

    public void Multiplicar(){

        float n1, n2, resm;
        n1 = Float.parseFloat((et1.getText().toString()));
        n2 = Float.parseFloat((et2.getText().toString()));
        resm = n1 * n2;
        tvRes.setText(String.valueOf(resm));

    }
    private void Regresar(){
        Intent regresar = new Intent(this, MainActivity.class);
        startActivity(regresar);
    }


}