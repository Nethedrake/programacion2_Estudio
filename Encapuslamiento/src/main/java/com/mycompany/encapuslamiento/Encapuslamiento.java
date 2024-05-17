/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.encapuslamiento;

/**
 *
 * @author Usuario
 */
public class Encapuslamiento {

    public static void main(String[] args) {
        Alumno alu = new Alumno();
        
        Alumno alu2 = new Alumno(16, "Te quiero", "Mucho");
        System.out.println("id " +alu2.getId());
        System.out.println("nombre " + alu2.getNombre());
        System.out.println("Apeliido " + alu2.getApellido());
    }
}
