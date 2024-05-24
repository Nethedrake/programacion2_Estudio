package archivosTexto;

import java.io.*;


public class ArchivosTexto {

    File archivo;

    private void crearArchivoDeTexto() {
        archivo = new File("archivo.txt");
        try {
            if (archivo.createNewFile()) {
              //  System.out.println("Archivo creado");

            } else {
                //System.out.println("Error al crearlo");
            }

        } catch (IOException exepcion) {
            exepcion.printStackTrace(System.out);

        }
    }

    private void eliminarArchivoDeTexto() {
        if (archivo.delete()) {
            System.out.println("Archivo eliminado con exito");

        } else {
            System.out.println("Error al eliminar");
        }

    }
    
    //Creamos el metodo para escribir al archivo de texto
    
    private void escribirAlArchivoDeTexto(){
        try{
        FileWriter escritura = new FileWriter("archivo.txt", true); //Ese true se utiliza para añadir texto 
        escritura.write("\nSaludos desde mi casa");
        //escritura.write("\nHola desde java!!"); podemos añadirlo desde acá quitanso el true dejamos de añadir
        escritura.close();
            //System.out.println("Texto añadido");
    }catch(IOException excepcion){
    excepcion.printStackTrace(System.out);
}
}
    //Creamos el metodo para leer un archivo de texto
    private void leerArchivoDeTexto(){
        String contenido;
        try{
        FileReader lector = new FileReader("archivo.txt"); // indicamos el archivo a leer 
        BufferedReader lectura = new BufferedReader (lector); // Le pasamos el archivo a leer
        
        contenido = lectura.readLine();
        
        while(contenido != null){
        
            System.out.println(contenido);
            contenido = lectura.readLine();
        }
            System.out.println(contenido);
        }catch(IOException excepcion){
       excepcion.printStackTrace(System.out);
       }

}
    public static void main(String [] args){
    ArchivosTexto archivoTexto = new ArchivosTexto();
    //archivoTexto.crearArchivoDeTexto(); 
    //archivoTexto.eliminarArchivoDeTexto();esto se hace para eliminarlo sin borrar lo de arriba
    archivoTexto.escribirAlArchivoDeTexto();
    archivoTexto.leerArchivoDeTexto();
    }
}
