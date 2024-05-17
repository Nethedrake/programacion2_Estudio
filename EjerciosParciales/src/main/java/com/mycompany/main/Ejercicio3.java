/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio3 {
     public static void main(String[] args) {
         Scanner sc = new Scanner (System.in);
         int counter= 0;
         for (int i = 0; i <3; i++) {
         System.out.println("Ingresa el nombre ");
         String name = sc.nextLine().toLowerCase();
         System.out.println("Ingresa el documento");
         double document = sc.nextDouble();
         System.out.println("Ingresa la edad");
         double age = sc.nextDouble();
         sc.nextLine();
         counter += age;
         }
         int averageAge = counter/3;
         System.out.println("El promedio de edad es de = " + averageAge);
     }
}
