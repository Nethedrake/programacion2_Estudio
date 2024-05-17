/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parcialprogramacion2;

/**
 *
 * @author Usuario
 */
public class Resultados extends Partido{
    private String resultado1;
    private String resultado2;
    private String resultado3;
    private String resultado4;

    public Resultados(String resultado1, String resultado2, String resultado3, String resultado4, String partido1, String partido2, String partido3, String partido4, String equipo1, String equipo2, String equipo3, String equipo4, String capitan1, String capitan2, String capitan3, String capitan4) {
        super(partido1, partido2, partido3, partido4, equipo1, equipo2, equipo3, equipo4, capitan1, capitan2, capitan3, capitan4);
        this.resultado1 = resultado1;
        this.resultado2 = resultado2;
        this.resultado3 = resultado3;
        this.resultado4 = resultado4;
    }

    public String getResultado1() {
        return resultado1;
    }

    public void setResultado1(String resultado1) {
        this.resultado1 = resultado1;
    }

    public String getResultado2() {
        return resultado2;
    }

    public void setResultado2(String resultado2) {
        this.resultado2 = resultado2;
    }

    public String getResultado3() {
        return resultado3;
    }

    public void setResultado3(String resultado3) {
        this.resultado3 = resultado3;
    }

    public String getResultado4() {
        return resultado4;
    }

    public void setResultado4(String resultado4) {
        this.resultado4 = resultado4;
    }

    
    
}
