package com.example;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
     //realiza un programa dado por teclado un limite numerico por teclado (por ejemplo 100) muestre en pantalla todos los numeros hasta ese limite (empezando por 1)
    
    String entrada = JOptionPane.showInputDialog(null, "ingrese el numero");
    int salida = Integer.parseInt( entrada);
    int fnal = 100;
while (salida < fnal) {
    salida++;
    JOptionPane.showMessageDialog(null, " va en:  " + salida);
} 
    
    
    }
}