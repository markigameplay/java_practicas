package com.mycompany.calculadora.basica.usando_if;

import javax.swing.JOptionPane;

public class CalculadoraBasicaUsando_if {

    public static void main(String[] args) {
        
        // Solicitar entrada al usuario
        String texto_1 = JOptionPane.showInputDialog("Ingrese un número");
        String texto_2 = JOptionPane.showInputDialog("Ingrese otro número");
        String texto_3 = JOptionPane.showInputDialog("Ingresa un operador (+, -, /, *)");

        // Convertir los valores ingresados a enteros
        int numero_1 = Integer.parseInt(texto_1);
        int numero_2 = Integer.parseInt(texto_2);
        
        // Realizar las operaciones
        int suma = numero_1 + numero_2;
        int resta = numero_1 - numero_2;
        int division = 0; // Inicializamos por si no se realiza la división
        if (numero_2 != 0) { // Validación para evitar división entre 0
            division = numero_1 / numero_2;
        }
        int multiplicacion = numero_1 * numero_2;

        // Comparar el operador ingresado y realizar la operación correspondiente
        if (texto_3.equals("+")) {
            JOptionPane.showMessageDialog(null, "La suma es: " + suma);    
        } else if (texto_3.equals("-")) {
            JOptionPane.showMessageDialog(null, "La resta es: " + resta);    
        } else if (texto_3.equals("/")) {
            if (numero_2 != 0) {
                JOptionPane.showMessageDialog(null, "La división es: " + division);
            } else {
                JOptionPane.showMessageDialog(null, "No se puede dividir entre 0.");
            }
        } else if (texto_3.equals("*")) {
            JOptionPane.showMessageDialog(null, "La multiplicación es: " + multiplicacion);    
        } else {
            JOptionPane.showMessageDialog(null, "Operador no reconocido.");
        }
    }
}
