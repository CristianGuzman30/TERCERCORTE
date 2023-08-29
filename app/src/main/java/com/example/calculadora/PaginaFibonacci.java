package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.math.BigInteger;
import java.util.ArrayList;

public class PaginaFibonacci extends AppCompatActivity {

    EditText et1;
    Button calcular, btnRegresar;
    TextView resultado;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagina_fibonacci);

        et1 = findViewById(R.id.editTextFibonacci);
        calcular = findViewById(R.id.buttonCalcular);
        resultado = findViewById(R.id.textResultado);
        btnRegresar = findViewById(R.id.buttonRegresarFibonacci);

        calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultado.setText(operacionFibonacci(Integer.parseInt(et1.getText().toString())));
            }
        });

        btnRegresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Regresar();
            }
        });

    }

    public int operacionFibonacci(int n) {

        int res = Calculadora.Fibonacci(n);

        return res;
    }


    private void Regresar(){
        Intent regresar = new Intent(this, MainActivity.class);
        startActivity(regresar);
    }

}