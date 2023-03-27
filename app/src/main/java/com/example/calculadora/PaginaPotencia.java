package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class PaginaPotencia extends AppCompatActivity {

    EditText et1, et2;
    TextView tv1;
    Button btnResultado, btnRegresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagina_potencia);

        et1 = findViewById(R.id.editTextIngresarNumero);
        et2 = findViewById(R.id.editTextIngresarNumero2);
        tv1 = findViewById(R.id.textViewResPotencia);
        btnResultado = findViewById(R.id.buttonPotencia);
        btnRegresar = findViewById(R.id.buttonRegresarPotencia);

        btnResultado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Potencia();

            }
        });
        btnRegresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Regresar();
            }
        });
    }

    public void Potencia(){

        int base=Integer.parseInt(et1.getText().toString());
        int exponente=Integer.parseInt(et2.getText().toString());
        int p=1;

        while(exponente>0)
        {
            p=p*base;
            exponente--;
        }

        tv1.setText(String.valueOf(p));
    }

    private void Regresar(){
        Intent regresar = new Intent(this, MainActivity.class);
        startActivity(regresar);
    }

}
