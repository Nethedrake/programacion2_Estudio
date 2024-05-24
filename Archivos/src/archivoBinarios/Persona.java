/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package archivoBinarios;

import java.io.Serializable;

//El implemenst seriazable sirve para un clase y convertirla en un flujo de bites y enviarlos a un destino
public class Persona implements Serializable{
    private int edad;
    private String nombre;

    public Persona(int edad, String nombre) {
        this.edad = edad;
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void mostrarDatos(){
        System.out.println("Nombre : " + nombre);
        System.out.println("Edad : " + edad);
    }
}
