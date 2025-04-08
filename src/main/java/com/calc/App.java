package com.calc;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello Calculadora!" );
        Calculadora calc = new Calculadora(5, 3);  // ejemplo con 5 + 3
        int resultado = calc.suma();
        System.out.println("Resultado de la suma: " + resultado);
    }
}