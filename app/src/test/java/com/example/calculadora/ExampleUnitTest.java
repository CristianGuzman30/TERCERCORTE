package com.example.calculadora;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void testOperacionFibonacci() {
        Calculadora fibonacci = new Calculadora();

        int result = fibonacci.Fibonacci(5);
        assertEquals(5, result);

        int result2 = fibonacci.Fibonacci(8);
        assertEquals(21, result2);

        int result3 = fibonacci.Fibonacci(11);
        assertEquals(89, result3);

    }

    @Test
    public void testOperacionPotencia() {
        Calculadora potencia = new Calculadora();

        int result = (int) potencia.Potencia(2, 3);
        assertEquals(8, result);

        int result2 = (int) potencia.Potencia(5, 5);
        assertEquals(3125, result2);

        int result3 = (int) potencia.Potencia(10, 3);
        assertEquals(1000, result3);
    }

    @Test
    public void testOperacionMultiplicacion() {
        Calculadora multiplicar = new Calculadora();

        float result = multiplicar.Multiplicar(2.5f, 3.0f);
        assertEquals(7.5f, result, 0.001); // Tolerancia para comparación de números flotantes

        float result2 = multiplicar.Multiplicar(5.0f, 8.0f);
        assertEquals(40.0f, result2, 0.001); // Tolerancia para comparación de números flotante

        float result3 = multiplicar.Multiplicar(2.82f, 7.63f);
        assertEquals(21.5166f, result3, 0.001); // Tolerancia para comparación de números flotante
    }

    @Test
    public void testOpreacionSuma(){
        Calculadora suma = new Calculadora();

        int result = suma.Suma(10,10);
        assertEquals(20, result);

        int result2 = suma.Suma(10,25);
        assertEquals(35, result2);

        int result3 = suma.Suma(-7,-2);
        assertEquals(-9, result3);


    }


}