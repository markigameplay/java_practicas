
package com.mycompany.division_y_modulo_de_division;

import javax.swing.JOptionPane;

/**
 *Solicita dos números enteros al usuario (x, y).
Realiza la división de x entre y.
Imprime el resultado de la división en una nueva línea.
Calcula el resto de la división de x entre y.
Imprime el resto de la división en una nueva línea.
 * 
 */
public class Division_y_modulo_de_division {

    public static void main(String[] args) {
          String texto_1 = JOptionPane.showInputDialog("anota numero x");
          String texto_2 = JOptionPane.showInputDialog("anota numero y");
   
   int numero_1 = Integer.parseInt(texto_1);
   int numero_2 = Integer.parseInt(texto_2);

   int dv = numero_1 / numero_2;
   
JOptionPane.showMessageDialog(null, " la division es: " + dv);
        
        
    }
    

}
    

