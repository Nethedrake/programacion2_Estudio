/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.herenciachatgpt;

/**
 *
 * @author Usuario
 */
public class HerenciaChatgpt {

    public static void main(String[] args) {
        Consultor consultor = new Consultor("TT", "Juan", "3172212110");
        Empleado empleado = new Empleado("Pedro", "987654321", 2500.0);

        System.out.println("Consultor:");
        System.out.println("Nombre: " + consultor.getNombre());
        System.out.println("Teléfono: " + consultor.getTelefono());
        System.out.println("Especialidad: " + consultor.getEspecialidad());

        System.out.println("\nEmpleado:");
        System.out.println("Nombre: " + empleado.getNombre());
        System.out.println("Teléfono: " + empleado.getTelefono());
        System.out.println("Salario: $" + empleado.getSalario());
    }
}
