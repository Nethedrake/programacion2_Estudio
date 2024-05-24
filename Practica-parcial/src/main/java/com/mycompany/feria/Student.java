package com.mycompany.feria;

public class Student {
    private String name;
    private String apellidos;
    private String actividad;
    private String actividad2;

    public Student(String name, String apellidos, String actividad) {
        this.name = name;
        this.apellidos = apellidos;
        this.actividad = actividad;
    }

    public Student(String name, String apellidos, String actividad, String actividad2) {
        this.name = name;
        this.apellidos = apellidos;
        this.actividad = actividad;
        this.actividad2 = actividad2;
    }

    public Student() {
    }
    
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getActividad() {
        return actividad;
    }

    public void setActividad(String actividad) {
        this.actividad = actividad;
    }

    public String getActividad2() {
        return actividad2;
    }
    
    
}
