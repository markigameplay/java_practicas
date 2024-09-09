
package com.mycompany.practica_01;

import javax.swing.JOptionPane;


public class Practica_01 {

    public static void main(String[] args) {
        String texto = JOptionPane.showInputDialog("ingresa el numero entero: ");
        
        int numero = Integer.parseInt(texto);
        
       int cuadrado = numero * numero;
       JOptionPane.showMessageDialog(null, "numero al cuadrado es: " + cuadrado);
    }
}
