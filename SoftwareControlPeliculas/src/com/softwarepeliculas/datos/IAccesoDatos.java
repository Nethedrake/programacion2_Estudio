
//Va tener una interfaz(Se usa para operacion de una base de datos) logica de negocios
//Vamos a crear de los metodos abstractos necesarios
//Para nuestro archivo de texto 
package com.softwarepeliculas.datos;

import com.softwarepeliculas.domain.Pelicula;
import com.softwarepeliculas.excepciones.AccesoDatosExcepcion;
import com.softwarepeliculas.excepciones.EscrituraDatosExcepcion;
import com.softwarepeliculas.excepciones.LecturaDatosExcepcion;
import java.util.List;

public interface IAccesoDatos {

    //creamos los metodos necesarios para ejecutar operaciones al archivo
    public boolean comprobarSiExisteArchivo(String nombreRecurso) throws AccesoDatosExcepcion;
    //trhows sirve para lanzar una excepcion a un metodo

    //Lo que hace una lista es como un arreglo con una pequeña diferencia(No se necesita pasar un tamaño) hay que poner el tipo de lista que es
    public List<Pelicula> listar(String nombreRecurso) throws LecturaDatosExcepcion;
    
    //Aca se sescribe los datos pasamos la pelicula, el nombreRecuros, y boolean para ver si es falso o verdadero
    public void escribir(Pelicula pelicula, String nombreRecurso, boolean anexar) throws EscrituraDatosExcepcion;
    
    //Tenemos que leer, mas no que escribir, esos 2 parametros, para lbuscarlos y leerlos
    public String buscar(String nombreRecurso, String buscar) throws LecturaDatosExcepcion;
    
    //Aca lo heredamos de acceso es porque vamos a crearlo 
    public void crear(String nombreRecurso) throws AccesoDatosExcepcion;
    
    //
    public void borrar(String nombreRecurso) throws AccesoDatosExcepcion;
}
