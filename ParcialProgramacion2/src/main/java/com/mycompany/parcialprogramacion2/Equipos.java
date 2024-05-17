/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parcialprogramacion2;

/**
 *
 * @author Usuario
 */
public class Equipos extends Jugadores {
    private String equipo1;
    private String equipo2;
    private String equipo3;
    private String equipo4;

    public Equipos(String equipo1, String equipo2, String equipo3, String equipo4, String capitan1, String capitan2, String capitan3, String capitan4) {
        super(capitan1, capitan2, capitan3, capitan4);
        this.equipo1 = equipo1;
        this.equipo2 = equipo2;
        this.equipo3 = equipo3;
        this.equipo4 = equipo4;
    }

    

    public String getEquipo1() {
        return equipo1;
    }

    public void setEquipo1(String equipo1) {
        this.equipo1 = equipo1;
    }

    public String getEquipo2() {
        return equipo2;
    }

    public void setEquipo2(String equipo2) {
        this.equipo2 = equipo2;
    }

    public String getEquipo3() {
        return equipo3;
    }

    public void setEquipo3(String equipo3) {
        this.equipo3 = equipo3;
    }

    public String getEquipo4() {
        return equipo4;
    }

    public void setEquipo4(String equipo4) {
        this.equipo4 = equipo4;
    }
    

    
    
    
    
}
