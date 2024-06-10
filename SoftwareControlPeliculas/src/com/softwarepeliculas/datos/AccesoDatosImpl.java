
/*
Esto es para acceder al archivo, como es crearlo, borrarlo, etc
*/

package com.softwarepeliculas.datos;

import com.softwarepeliculas.domain.Pelicula;
import com.softwarepeliculas.excepciones.AccesoDatosExcepcion;
import com.softwarepeliculas.excepciones.EscrituraDatosExcepcion;
import com.softwarepeliculas.excepciones.LecturaDatosExcepcion;
import java.util.List;
import java.io.*;
import java.util.ArrayList;

public class AccesoDatosImpl implements IAccesoDatos{

    @Override
    public boolean comprobarSiExisteArchivo(String nombreRecurso) throws AccesoDatosExcepcion {
        File archivo = new File(nombreRecurso);
         //El exists si un metodo existe, false o true
        return archivo.exists();
    }

    @Override
    public List<Pelicula> listar(String nombreRecurso) throws LecturaDatosExcepcion {
        File archivo = new File(nombreRecurso);
        //Aca creamos una lista de peliculas
        List<Pelicula> peliculas = new ArrayList<>();
        try {
            //Con el buffered leyendo cada linea de un archivo de texto
            BufferedReader entrada = new BufferedReader(new FileReader(archivo));
            String contenido = null;
            contenido = entrada.readLine();

            while (contenido != null) {
                Pelicula pelicula = new Pelicula(contenido);
                peliculas.add(pelicula);
                contenido = entrada.readLine();
            }
            entrada.close();
        } catch (IOException excepcion) {
            //para que nos muestre la pila de excepciones de manera ordenada
            excepcion.printStackTrace(System.out);
            throw new LecturaDatosExcepcion("Excepcion al listar peliculas : " + excepcion.getMessage());
        }
        return peliculas;
    }

    @Override
    public void escribir(Pelicula pelicula, String nombreRecurso, boolean anexar) throws EscrituraDatosExcepcion {
        File archivo = new File(nombreRecurso);
        try {
            //Que podemos escribir a nuestro archivo 
            //El PrintWriter(Pasamos algo para escribir) y FileWriter(Pasamos el archivo que estamos con PrintWriter) 
            PrintWriter salida = new PrintWriter(new FileWriter(archivo, anexar));
            //Con esto imprimimos nuestra pelicula
            salida.println(pelicula.toString());
             //Aca hay que cerrarlo
            salida.close();
        } catch (IOException excepcion) {
            excepcion.printStackTrace(System.out);
            //Esto es lo que teniamos para escribir nuestro propio mensaje de excepcion
            throw new EscrituraDatosExcepcion("Excepcion al escribir en el archivo : " + excepcion.getMessage());
        }
    }

    @Override
    public String buscar(String nombreRecurso, String buscar) throws LecturaDatosExcepcion {
        //Esto es para pasarle el nombre del archivo
        File archivo = new File(nombreRecurso);
        //Si se ha encontrado el archivo
        String resultado = null;
        try {
            //Le pasamos el archivo a leer
            BufferedReader entrada = new BufferedReader(new FileReader(archivo));
            String linea = null;
            linea = entrada.readLine();
            //Porque 1, cuando lea mi pelicula vamos ir sumando el indice 
            int indice = 1;

            while (linea != null) {
                if (buscar != null && buscar.equalsIgnoreCase(linea)) {
                    System.out.println("");
                    resultado = "Pelicula " + linea + " econtrada en el indice " + indice;
                    break;
                }
                linea = entrada.readLine();
                indice++;
            }
            entrada.close();
        } catch (IOException excepcion) {
            excepcion.printStackTrace(System.out);
            throw new LecturaDatosExcepcion("Excepcion al vuscar la pelicula : " + excepcion.getMessage());
        }
        return resultado;
    }

    @Override
    public void crear(String nombreRecurso) throws AccesoDatosExcepcion {
        File archivo = new File(nombreRecurso);
        try {
            PrintWriter salida = new PrintWriter(new FileWriter(archivo));
            salida.close();
            System.out.println("Se ha creado el archivo con exito !");
        } catch (IOException excepcion) {
            excepcion.printStackTrace(System.out);
            throw new AccesoDatosExcepcion("Exepcion al crear archivo : " + excepcion.getMessage());
        }
    }

    @Override
    public void borrar(String nombreRecurso) throws AccesoDatosExcepcion {
        File archivo = new File(nombreRecurso);
        if (archivo.exists()) {
            archivo.delete();
        }
        System.out.println("Se ha borrado el archivo");
    }

}

