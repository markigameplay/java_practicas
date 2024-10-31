package com.example;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
   //"Realizar un programa que muestre por pantalla los números del 200 al 250 saltando de 2 en 2. La secuencia debería ser: 200...202...204...etc"
    
      int inicio = 200;
   int fnal = 250;
while (inicio < fnal) {
    //primera forma
   inicio = inicio + 2;
 //segunda forma
 //inicio+=2;
   JOptionPane.showMessageDialog(null, " va en:  " + inicio);
} 
   
    }}