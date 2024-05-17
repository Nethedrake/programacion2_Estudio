/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parcialprogramacion2;

/**
 *
 * @author Usuario
 */
public class Posiciones extends Resultados {
    private String posicion1;
    private String posicion2;
    private String posicion3;
    private String posicion4;

    public Posiciones(String posicion1, String posicion2, String posicion3, String posicion4, String resultado1, String resultado2, String resultado3, String resultado4, String partido1, String partido2, String partido3, String partido4, String equipo1, String equipo2, String equipo3, String equipo4, String capitan1, String capitan2, String capitan3, String capitan4) {
        super(resultado1, resultado2, resultado3, resultado4, partido1, partido2, partido3, partido4, equipo1, equipo2, equipo3, equipo4, capitan1, capitan2, capitan3, capitan4);
        this.posicion1 = posicion1;
        this.posicion2 = posicion2;
        this.posicion3 = posicion3;
        this.posicion4 = posicion4;
    }

    public String getPosicion1() {
        return posicion1;
    }

    public void setPosicion1(String posicion1) {
        this.posicion1 = posicion1;
    }

    public String getPosicion2() {
        return posicion2;
    }

    public void setPosicion2(String posicion2) {
        this.posicion2 = posicion2;
    }

    public String getPosicion3() {
        return posicion3;
    }

    public void setPosicion3(String posicion3) {
        this.posicion3 = posicion3;
    }

    public String getPosicion4() {
        return posicion4;
    }

    public void setPosicion4(String posicion4) {
        this.posicion4 = posicion4;
    }
    
    
    
}
