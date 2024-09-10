

package com.mycompany.calculadora_basica;

import javax.swing.JOptionPane;

/**
 *Solicita dos números al usuario.
Calcula la suma de los dos números.
Calcula la resta de los dos números.
Calcula la multiplicación de los dos números.
Calcula la división de los dos números.
Muestra el resultado de la suma, resta, multiplicación y división en líneas separadas.
Calcula y muestra el resto de la división de los dos números.
 * @author pc
 */
public class Calculadora_basica {

    public static void main(String[] args) {
        String texto_1 = JOptionPane.showInputDialog("ingresa numero entero");
        String texto_2 = JOptionPane.showInputDialog("ingresa numero entero");
    
        int numero_1 = Integer.parseInt(texto_1);
        int numero_2 = Integer.parseInt(texto_2);
        
        int suma = numero_1 + numero_2;
        int resta = numero_1 - numero_2;
        int multiplicacion = numero_1 * numero_2;
        int division = numero_1 / numero_2;
        
        JOptionPane.showMessageDialog(null,"suma " + suma + " \n" + 
                "resta " + resta + " \n" +
                "multiplicación " + multiplicacion + " \n" +
                "division " + division + " \n" );
        
    
    
    
    
    }
}
