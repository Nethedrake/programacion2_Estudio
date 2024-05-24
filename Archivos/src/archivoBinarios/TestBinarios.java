package archivoBinarios;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TestBinarios {

    private void escribirBinario() {
        //FileOutputStream Sirve para indicarle ala archivo Binarioque vamos a mandar output
        //Metodo para escribir en un archivo binario
        try {
            FileOutputStream archivo = new FileOutputStream("personas.bin");
            ObjectOutputStream escritura = new ObjectOutputStream(archivo);
            
            
            escritura.writeObject(new Persona(15, "Juan")); 
            System.out.println("Objeto añadido");
            escritura.close();
        } catch (IOException error) {
            error.printStackTrace(System.out);
        }
    }
    //Creamos el metodo para leer contenido de un archivo binario
    private void leerBinario() throws ClassNotFoundException{
        Persona persona;
        try{
        FileInputStream archivo = new FileInputStream ("personas.bin");
        ObjectInputStream lectura = new ObjectInputStream(archivo); // va leer un archivo binario
        
        while(true){
            persona = (Persona)lectura.readObject(); //esta leyendo en cada linea 
            persona.mostrarDatos();
        }
        }catch(EOFException excepcion){
            return;
        }catch(IOException error){
        error.printStackTrace(System.out);
        } 
    
    }
    private void añadirBinario(){
        try {
            FileOutputStream archivo = new FileOutputStream("personas.bin",true);
            AñadirContenido escritura = new AñadirContenido(archivo);
            
            
            escritura.writeObject(new Persona(15, "Juan")); 
            escritura.writeObject(new Persona(22, "Alex")); 
            escritura.writeObject(new Persona(14, "Pedro")); 
            System.out.println("Objeto añadido");
            escritura.close();
        } catch (IOException error) {
            error.printStackTrace(System.out);
        }
    }

    public static void main(String[] args) throws ClassNotFoundException {
        TestBinarios test = new TestBinarios ();
        test.escribirBinario();
        test.añadirBinario();
        test.leerBinario();
    }

}
