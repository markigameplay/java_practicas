
package com.mycompany.sumas_al_cuadrado;

import javax.swing.JOptionPane;

/**
 *Desde la función principal (main) del programa, solicita al usuario que ingrese un número entero x.
Calcula el cuadrado de x.
Imprime en pantalla el resultado de la suma al cuadrado.
 * 
 */
public class Sumas_al_cuadrado {

    public static void main(String[] args) {
        String texto = JOptionPane.showInputDialog("ingrese numero entero");
       
        int numero = Integer.parseInt(texto);
        int cuadrado = numero * numero;
        int suma_cuadrado = cuadrado + cuadrado;
        
        JOptionPane.showMessageDialog(null,"la suma al cuadrado es: " + suma_cuadrado);
    }
}
