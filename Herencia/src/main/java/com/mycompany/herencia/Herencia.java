/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.herencia;

/**
 *
 * @author Usuario
 */
public class Herencia {

    public static void main(String[] args) {

        Consultor consultor = new Consultor("Alina", "Pisos y enchapes", 109123123, "3912391239", "Juan", "Trigos", "Ferias", "3172212110");

        Empleado empleado = new Empleado(123123123, "Jefe", 1.900000, 123132132, "AJSDHAKDJAH", "Pedro", " Acosta", "Acolsure", "3124990444");
    
        System.out.println("Nombre : " + consultor.getNombre());
        System.out.println("Apellido : " + empleado.getApellido());
        System.out.println("Telefono : " + consultor.getTelefono());
        
    }

}
