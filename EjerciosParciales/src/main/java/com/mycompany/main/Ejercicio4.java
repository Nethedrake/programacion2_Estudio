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
public class Ejercicio4 {
    public static void main(String[] args) {
       Scanner sc = new Scanner (System.in);
       String euros [] = {"Euros","4.500"};
       String dolar [] = {"dolar","4.000"};
       
       String monedas [][] = new String[2][2];
       
       monedas [0]= euros;
       monedas [1]= dolar;
       for(String [] moneda : monedas){
        String name = moneda [0];
       double valorDeMoneda = Double.parseDouble(moneda[1]);
                   
       System.out.println("Ingrese la cantidad " + name);
        double cantidad = sc.nextDouble();
                   
        double tasaDeCambio = (cantidad * valorDeMoneda);
                   
        System.out.println(" la conversion de  " + name + " tiene un valor de = " + tasaDeCambio);
        }
    }
  }
       
       
       
       
  
 