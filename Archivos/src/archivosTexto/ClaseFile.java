
package archivosTexto;

import java.io.File;
import java.io.IOException;

public class ClaseFile {
    public static void main (String [] args) {
        //Clase File
        File archivo = new File("prueba.txt");
       
        System.out.println("Nombre del archivo : " + archivo.getName());
        System.out.println("Ruta del archivo : " + archivo.getAbsolutePath());
        System.out.println("Existe este archivo? " + archivo.exists());
        System.out.println("Se puede escribir en el archivo? " + archivo.canWrite());
        System.out.println("Se puede leer el archivo ? " + archivo.canRead());
        System.out.println("Es archivo? " + archivo.isFile());
        System.out.println("Es directorio ? " + archivo.isDirectory());
        System.out.println("Longitud del archivo : " + archivo.length());
    }
}
