package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        double promedio;
        String condicionalFinal;
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("ingrese los datos de la nota");
        promedio =teclado.nextDouble();

        condicionalFinal = promedio >= 6 ? "Aprobo" : "No aprobo";
        
        System.out.println("la condicion final del alumno es: " condicionalFinal );



    }
}