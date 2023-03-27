package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    EditText ingNum;
    Button ir;

    int botonIr;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ingNum = findViewById(R.id.ingresarNumEditText);
        ir = findViewById(R.id.irButton);

        ir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                botonIr = Integer.parseInt(ingNum.getText().toString());

                if (botonIr == 1) {
                    operacionFibonacci();
                } else if (botonIr == 2) {
                    operacionPotencia();
                } else if (botonIr == 3) {
                    operacionMultiplicacion();
                }
            }
        });
    }

    private void operacionFibonacci() {
        Intent fibonacci = new Intent(this, PaginaFibonacci.class);
        startActivity(fibonacci);
    }


    private void operacionPotencia(){
            Intent potencia = new Intent(this, PaginaPotencia.class);
            startActivity(potencia);
        }

        private void operacionMultiplicacion(){
            Intent multiplicacion = new Intent(this, PaginaMultiplicacion.class);
            startActivity(multiplicacion);
        }
    }
