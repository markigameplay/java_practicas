//
package com.mycompany.division_entre_cero;

import javax.swing.JOptionPane;

/**
Solicita dos números al usuario (x, y).
Realiza la operación de división de x entre y.
Incluye una verificación para evitar la división por cero utilizando un bloque if.
    Si el usuario intenta dividir por cero, muestra el mensaje "No es posible realizar la división por cero".
 */
public class Division_entre_cero {

    public static void main(String[] args) {
       String texto_1 = JOptionPane.showInputDialog("pon el numero x");
       String texto_2 = JOptionPane.showInputDialog("pon el numero y");
       
       int numero_1 = Integer.parseInt(texto_1);
       int numero_2 = Integer.parseInt(texto_2);
       
        if (numero_2 == 0) {
            JOptionPane.showMessageDialog(null, "no es posible realizar la division por cero");
        } else {
            int division = numero_1 / numero_2;
            JOptionPane.showMessageDialog(null,numero_1 + " / " + numero_2 + " = " + division);
        }
    }
}
