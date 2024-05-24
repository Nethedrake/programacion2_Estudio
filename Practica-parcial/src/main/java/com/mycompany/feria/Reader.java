package com.mycompany.feria;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

public class Reader {
   public static void writer (String Fcode, String Fname, String Ac){
   File fichero = null;
 FileWriter writer = null;
 PrintWriter pw = null;
 try
 {
 fichero = new File("Estudiantes.txt");
 writer = new FileWriter(fichero);
 pw = new PrintWriter(writer);
 pw.println(Fname + " " + Fcode + " actividad: " + Ac);
 } catch (Exception e) {
 e.printStackTrace();
 } finally {
 try {
 if (null != fichero) {
 writer.close();
 }
 } catch (Exception e2) {
 e2.printStackTrace();
   }
   }
  }
}
