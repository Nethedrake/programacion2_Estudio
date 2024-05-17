/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.programacion2;

/**
 *
 * @author Usuario
 */
public class Programacion2 {

    public static void main(String[] args) {
        Alumno alu1 = new  Alumno(8,"pedro","Trigos");
        Alumno alu2 = new Alumno (3,"Juan Diego", "De olmo");
        
        System.out.println("El id del alumno 2 es: " + alu2.getId());
        System.out.println("El nombre del alumno es : " + alu2.getNombre());
        System.out.println("El apellido es : " + alu2.getApellido());
        
        
        
        
        System.out.println("------------------------------------");
        
        
        System.out.println("El id del alumno 1 es: " + alu1.getId());
        System.out.println("El nombre del alumno es : " + alu1.getNombre());
        System.out.println("El apellido es : " + alu1.getApellido());
         
        
        System.out.println("------------------------------");
        
        
        alu2.setId(32);
        System.out.println("El id del alumno 2 es: " + alu2.getId());
        System.out.println("El nombre del alumno es : " + alu2.getNombre());
        System.out.println("El apellido es : " + alu2.getApellido());
         
        
        
        
    }  
}
