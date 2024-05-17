
package com.mycompany.herenciachatgpt;


public class Consultor extends Persona {
    
     private String especialidad;

    public Consultor(String especialidad, String nombre, String telefono) {
        super(nombre, telefono);
        this.especialidad = especialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    
}
