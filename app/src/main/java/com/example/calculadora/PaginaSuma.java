package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class PaginaSuma extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagina_suma);
    }

    public int Suma(int n1, int n2){

        int res = Calculadora.Suma(n1, n2);

        return res;

    };
}