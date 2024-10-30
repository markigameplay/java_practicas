package com.mycompany.clientes;

import javax.swing.JOptionPane;

public class Clientes {
    
    static Cliente[] clientes = new Cliente[10];
    static int numClientes = 0;

    public static void main(String[] args) {
        boolean[] habitaciones = new boolean[10];
        int opcion;

        do {
            String menu = """
                    Gestión de habitaciones del hotel
                    1. Ver el estado de habitaciones.
                    2. Reservar una habitación.
                    3. Liberar una habitación.
                    4. Mostrar estadísticas de ocupación.
                    5. Registrar usuario.
                    6. Ver clientes registrados.
                    7. Salir
                    Elige una opción:
                    """;
            opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));

            switch (opcion) {
                case 1:
                    verEstadoHabitacion(habitaciones);
                    break;
                case 2:
                    reservaHabitacion(habitaciones);
                    break;
                case 3:
                    // Liberar habitación
                    break;
                case 4:
                    // Mostrar estadísticas de ocupación
                    break;
                case 5:
                    // Registrar usuario
                    break;
                case 6:
                    // Ver clientes registrados
                    break;
                case 7:
                    JOptionPane.showMessageDialog(null, "Saliendo del sistema");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida. Intenta de nuevo");
            }
        } while (opcion != 7);
    }

    public static void verEstadoHabitacion(boolean[] habitaciones) {
        StringBuilder estado = new StringBuilder("Estado de habitaciones: \n");
        
        for (int i = 0; i < habitaciones.length; i++) {
            estado.append("Habitación ").append(i + 1).append(": ")
                  .append(habitaciones[i] ? "ocupada" : "disponible").append("\n");
        }
        
        JOptionPane.showMessageDialog(null, estado.toString());
    }

    public static void reservaHabitacion(boolean[] habitaciones) {
        int numeroHabitacion = Integer.parseInt(JOptionPane.showInputDialog("Ingresar habitación a reservar"));
        if (numeroHabitacion > 0 && numeroHabitacion <= habitaciones.length) {
            if (!habitaciones[numeroHabitacion - 1]) {
                habitaciones[numeroHabitacion - 1] = true; // Marcar como ocupada
                JOptionPane.showMessageDialog(null, "Habitación " + numeroHabitacion + " reservada.");
            } 
     else  {
                JOptionPane.showMessageDialog(null, "La habitación ya está ocupada.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Número de habitación inválido");
        }
    }

    class Cliente {
        private String nombre;
        private String apellido;
        private String fechaDeNacimiento;
        private int edad;
        private String direccion;

        public Cliente(String nombre, String apellido, String fechaDeNacimiento, int edad, String direccion) {
            this.nombre = nombre;
            this.apellido = apellido;
            this.fechaDeNacimiento = fechaDeNacimiento;
            this.edad = edad;
            this.direccion = direccion;
        }

        public String getNombre() {
            return nombre;
        }

        public String getApellido() {
            return apellido;
        }

        public int getEdad() {
            return edad;
        }

        public String getDireccion() {
            return direccion;
        }
    }
}
