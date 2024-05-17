/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parcialprogramacion2;

/**
 *
 * @author Usuario
 */
public class Partido extends Equipos {
    private String partido1;
    private String partido2;
    private String partido3;
    private String partido4;

    public Partido(String partido1, String partido2, String partido3, String partido4, String equipo1, String equipo2, String equipo3, String equipo4, String capitan1, String capitan2, String capitan3, String capitan4) {
        super(equipo1, equipo2, equipo3, equipo4, capitan1, capitan2, capitan3, capitan4);
        this.partido1 = partido1;
        this.partido2 = partido2;
        this.partido3 = partido3;
        this.partido4 = partido4;
    }

    public String getPartido1() {
        return partido1;
    }

    public void setPartido1(String partido1) {
        this.partido1 = partido1;
    }

    public String getPartido2() {
        return partido2;
    }

    public void setPartido2(String partido2) {
        this.partido2 = partido2;
    }

    public String getPartido3() {
        return partido3;
    }

    public void setPartido3(String partido3) {
        this.partido3 = partido3;
    }

    public String getPartido4() {
        return partido4;
    }

    public void setPartido4(String partido4) {
        this.partido4 = partido4;
    }
    
    
}
    

   
