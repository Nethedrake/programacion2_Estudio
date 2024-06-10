package com.softwarepeliculas.servicio;

import com.softwarepeliculas.datos.AccesoDatosImpl;
import com.softwarepeliculas.datos.IAccesoDatos;
import com.softwarepeliculas.domain.Pelicula;
import com.softwarepeliculas.excepciones.AccesoDatosExcepcion;
import java.util.List;

public class ControlPeliculasImpl implements IControlPeliculas {

    //Esto es un interfaz, tiene los metodos necesarios para poder trabajar con esta clase
    private final IAccesoDatos datos;

    //Tenemos que crear un metodo constructor porque si no genera un error
    public ControlPeliculasImpl() {
        //Instaciamos al metodo contructor es MUY necesario
        this.datos = new AccesoDatosImpl();
    }

    @Override
    public void agregarPelicula(String nombrePelicula) {
        Pelicula pelicula = new Pelicula(nombrePelicula);
        boolean anexar = false;
        try {
            //Si anexar es tru existe, y si es false no eciste
            anexar = datos.comprobarSiExisteArchivo(NOMBRE_RECURSO);
            datos.escribir(pelicula, NOMBRE_RECURSO, anexar);
        } catch (AccesoDatosExcepcion excepcion) {
            System.out.println("\nError de acceso a datos ");
            excepcion.printStackTrace(System.out);
        }
    }

    @Override
    public void listarPeliculas() {
        try {
            //Vamos a enlistar las peliculas y guardalas en peliculas
            List<Pelicula> peliculas = this.datos.listar(NOMBRE_RECURSO);
            //Lo recorre
            for (Pelicula pelicula : peliculas) {
                System.out.println("Pelicula : " + pelicula);
            }
        } catch (AccesoDatosExcepcion excepcion) {
            System.out.println("\nError de acceso a datos ");
            excepcion.printStackTrace(System.out);
        }

    }

    @Override
    public void buscarPelicula(String PeliculaABuscar) {
        String resultado = null;
        try {
            resultado = this.datos.buscar(NOMBRE_RECURSO, PeliculaABuscar);

        } catch (AccesoDatosExcepcion excepcion) {
            System.out.println("\nError de acceso a datos ");
            excepcion.printStackTrace(System.out);
        }
        if (resultado == null) {
            System.out.println("No se ha encontrado la pelicula . ");
        } else {
            System.out.println("Pelicula encontrada " + resultado);
        }
    }

    @Override
    public void iniciarControlDePeliculas() {
        //Este metodo elimina y crea un archivo de texto
        try {
            if (this.datos.comprobarSiExisteArchivo(NOMBRE_RECURSO)) {
                datos.borrar(NOMBRE_RECURSO);
                datos.crear(NOMBRE_RECURSO);
            } else {
                datos.crear(NOMBRE_RECURSO);
            }
        } catch (Exception excepcion) {
            System.out.println("\nError al iniciar control DE Peliculas ");
            excepcion.printStackTrace(System.out);
        }
    }

}
