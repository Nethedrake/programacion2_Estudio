/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.herencia;

/**
 *
 * @author Usuario
 */
public class Consultor extends Persona{
    
   private String nombre_consultora; 
   private String num_consultor ;

    public Consultor() {
    }
    
    public Consultor(String nombre_consultora, String num_consultor, int id, String dni, String nombre, String apellido, String domicilio, String telefono) {
        super(id, dni, nombre, apellido, domicilio, telefono);
        this.nombre_consultora = nombre_consultora;
        this.num_consultor = num_consultor;
    }

    public String getNombre_consultora() {
        return nombre_consultora;
    }

    public void setNombre_consultora(String nombre_consultora) {
        this.nombre_consultora = nombre_consultora;
    }

    public String getNum_consultor() {
        return num_consultor;
    }

    public void setNum_consultor(String num_consultor) {
        this.num_consultor = num_consultor;
    }

   
   
    
}
