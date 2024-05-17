/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.main;

/**
 *
 * @author Usuario
 */
public class EjerciosParciales {

    public static void main(String[] args) {
      
         String firstStudent [] = {"Juan","4.0","3.7","2.6","3.0"};
         String secondStudent [] = {"Luis","3.0","2.7","3.6","4.0"};
         String threeStudent [] = {"Diego","2.0","1.7","4.6","2.9"};
         
         String students [][] = new String [3][5];
         students [0] = firstStudent;
         students [1] = secondStudent;
         students [2] = threeStudent;
         
         for(String []student : students){
            String name = student [0];
            double nota1 = Double.parseDouble(student[1]);
            double nota2 = Double.parseDouble(student[2]);
            double nota3 = Double.parseDouble(student[3]);
            double nota4 = Double.parseDouble(student[4]);
            
            double nota70 = (((nota1+nota2+nota3)/3)*0.7);
            double nota30 = (nota4*0.3);
             System.out.println("El 70 porciento del estudiante " + name + " Es = " + nota70);
             System.out.println("El 30 porciento del estudiante " + name + " Es = " + nota30);
             
             double notaFinal = nota70+nota30;
             
             if(notaFinal > 3.0){
                 System.out.println("Aprobo la materia " + name);
             } else{
                 System.out.println("Perdiste la materia " + name);
             }
            
         }
    }
}
