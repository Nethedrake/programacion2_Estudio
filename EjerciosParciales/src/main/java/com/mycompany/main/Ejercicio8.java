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
public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String vocales [] = {"a","e","i","o","u"};
            
        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese una vocal");
            String vocal = sc.nextLine();
        boolean esVocal = false;
        for (String v : vocales){
            if(vocal.equals(v));{
            esVocal = true;
            break;
            }
        }
        if(esVocal){
            System.out.println("Es una vocal");
        }else{
            System.out.println("No es vocal");
        }
        }
    }
}
        
    

