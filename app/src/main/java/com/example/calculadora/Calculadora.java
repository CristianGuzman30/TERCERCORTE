package com.example.calculadora;

public class Calculadora {

    public static float Multiplicar(float n1, float n2){

        float  resm;
        resm = n1 * n2;

        return resm;
    }

    public static float Potencia(int base, int exponente){

        int p=1;

        while(exponente>0)
        {
            p=p*base;
            exponente--;
        }

        return p;

    }


    public static int Fibonacci(int n) {
            if (n <= 0) {
                return 0;
            } else if (n == 1) {
                return 1;
            } else {
                return Fibonacci(n - 1) + Fibonacci(n - 2);
            }
        }

    public static int Suma(int n1, int n2){

        int res = n1+n2;

        return res;

    }


}
