/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.excepciones;

/**
 *
 * @author Usuario
 */
public class Excepciones {

    public static void main(String[] args) {
       /* try {
        int resultado = 3/0;
        }
        catch (Exception e){
           // System.out.println("No se puede dividir por ceroooo");
        }*/
       try {
       int eades [] = {14,12,32,42};
        System.out.println("La edad de la posicion 4 es " + eades [4]);
       }
       catch (Exception e){
           System.out.println("No hay esa posicion");
       }
    }
       
}
