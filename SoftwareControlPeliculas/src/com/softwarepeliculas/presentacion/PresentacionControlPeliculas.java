
/*
Esta es la clase principal
 */
package com.softwarepeliculas.presentacion;

import com.softwarepeliculas.servicio.ControlPeliculasImpl;
import com.softwarepeliculas.servicio.IControlPeliculas;
import java.util.Scanner;

public class PresentacionControlPeliculas {

    public static void main(String[] args) {
        IControlPeliculas controlPeliculas = new ControlPeliculasImpl();
        Scanner teclado = new Scanner(System.in);
        teclado.useDelimiter("\n");
        int opcion;
        System.out.println("--------------------------------");
        System.out.println("Software - Control de peliculas");
        System.out.println("--------------------------------");

        do {
            System.out.println("Digite una opcion, por favor: ");
            System.out.println("1. Iniciar control de peliculas . ");
            System.out.println("2. Agregar pelicula . ");
            System.out.println("3. Lista de peliculas . ");
            System.out.println("4. Buscar pelicula ");
            System.out.println("5. Salir . ");
            System.out.println("Digite una opcion : ");
            opcion = teclado.nextInt();

            System.out.println("");
            
            switch (opcion) {
                case 1:
                    controlPeliculas.iniciarControlDePeliculas();
                    break;
                case 2:
                    System.out.println("Digite el nombre de la pelicula : ");
                    String nombrePelicula = teclado.next();
                    controlPeliculas.agregarPelicula(nombrePelicula);
                    System.out.println("Pelicula agregada con exito . ");
                    break;
                case 3:
                    System.out.println("");
                    controlPeliculas.listarPeliculas();
                    break;
                case 4:
                    System.out.println("");
                    System.out.println("Digite la pelicula a buscar : " );
                    String peliculaABuscar = teclado.next();
                    controlPeliculas.buscarPelicula(peliculaABuscar);
                  
                    break;
                case 5:
                    System.out.println("");
                    System.out.println("-------------------------------------");
                    System.out.println("Hasta Pronto!");
                    System.out.println("-------------------------------------");
                    opcion = 5;
                    break;

                default:
                    System.out.println("");
                    System.out.println("-------------------------------------");
                    System.out.println("No disponible vuelva a intentantarlo");
                    System.out.println("-------------------------------------");
                    break;
            }

        } while (opcion != 5);
    }
}
