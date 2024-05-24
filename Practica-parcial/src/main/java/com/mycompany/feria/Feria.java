package com.mycompany.feria;

import static com.mycompany.feria.Writer.reader;
import static com.mycompany.feria.Reader.writer;



public class Feria {

    public static void main(String[] args) {
    
        int max = 899;
        
        int range = max ;
       
        
        Student estudiante1 = new Student ("Juan","Perez","futbol");
        System.out.println(estudiante1.getName() + " " + estudiante1.getApellidos() + " "+ estudiante1.getActividad());
        Student estudiante2 = new Student ("Pedro","Suarez","natacion", "futbol");
        System.out.println(estudiante2.getName() + " " + estudiante2.getApellidos() + " "+ estudiante2.getActividad() + " y " + estudiante2.getActividad2());
        estudiante1.setName("Pepe");
           String codigo = estudiante1.getName() + estudiante1.getApellidos();
            for( int i=0; i<1 ; i++){
        int rand = (int)(Math.random() * range) + 100 ;
           String Srand = String.valueOf(rand);
           String Schar= String.valueOf(codigo.charAt(0));
           String Schar1= String.valueOf(codigo.charAt(4));
           
           String N=estudiante1.getName();
           String A=estudiante1.getApellidos();
           String Fname= N + " " + A;
           
           String Ac=estudiante1.getActividad();
           
            String Fcode= Schar + Schar1 + rand;
                System.out.println(Fcode);
            writer (Fcode, Fname, Ac);
            }
            
           
            
  /*escritor*/
  reader();

  
 
 
 
  }
}
