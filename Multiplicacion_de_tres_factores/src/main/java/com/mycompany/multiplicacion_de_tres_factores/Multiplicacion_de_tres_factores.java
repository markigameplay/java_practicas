
package com.mycompany.multiplicacion_de_tres_factores;

import javax.swing.JOptionPane;

/**
 *Solicita tres números al usuario.
Multiplica estos tres números entre sí.
Muestra el resultado de la multiplicación.
 * 
 */
public class Multiplicacion_de_tres_factores {

    public static void main(String[] args) {
       String texto_1 = JOptionPane.showInputDialog(" ingrese un numero entero");
       String texto_2 = JOptionPane.showInputDialog(" ingrese un numero entero");
       String texto_3 = JOptionPane.showInputDialog(" ingrese un numero entero");
    
    int numero1,numero2,numero3;
    numero1 = Integer.parseInt(texto_1);
    numero2 = Integer.parseInt(texto_2);
    numero3 = Integer.parseInt(texto_3);
    
    int calculo = numero1*numero2*numero3;
    
    JOptionPane.showMessageDialog(null, "la multiplicacion es: " + calculo
    );
    
    
    
    }
}
