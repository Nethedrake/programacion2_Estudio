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
public class Ejercicio7 {
     public static void main(String[] args) {
         Scanner sc = new Scanner (System.in);
         String objeto1 [] = {"Licuadora","1200000","0.1"};
         String objeto2 [] = {"Televisor","1600000","0.29"};
         String objeto3 [] = {"Nevera","1820000","0.19"};
         
         String productos [][] = new String [3][3];
         productos [0]= objeto1;
         productos [1] = objeto2;
         productos [2] = objeto3;
       
         for (String [] producto : productos){
             String name = producto [0];
             double precioReal = Double.parseDouble(producto[1]);
             double iva = Double.parseDouble(producto[2]);
             double precioTotal = (precioReal * iva)*precioReal;
             System.out.println("Ingrese cuantas " + name + " quiere");
             int objetos = sc.nextInt();
             
             double ventaReal = (objetos * precioTotal);
             System.out.println("Se vendieron  " +objetos + "en el dia y su precio real con iva es de " + ventaReal);
         }
         
         
     }
    
}
