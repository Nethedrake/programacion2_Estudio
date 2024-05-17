/*
CONTENIDO DE LA EVALUACIÓN El torneo de fútbol universitario requiere de una aplicación para registrar equipos y los avances del torneo conforme se juegan las fechas de los partidos. Se solicita entonces que se permita lo siguiente:
• Añadir equipos, ingresar fechas de partidos e ingresar resultados por parte de un usuario organizador.
 • Registrar los jugadores que pertenecen a cada equipo.
 • Visualizar la tabla de posiciones sin restricciones de usuario
 */

package com.mycompany.parcialprogramacion2;

/**
 *
 * @author Usuario
 */
public class ParcialProgramacion2 {

    public static void main(String[] args) {
        Jugadores jugador = new Jugadores ("Juan","Pedro","Diego","Alberto");
        Equipos equipo = new Equipos ("la barbacio","Los mejores", "Ariiba España","Tu puedes","Juan","Pedro","Diego","Alberto");
        Partido partido = new Partido ("la barbacio vs los mejores","arriba españa vs Tu puedes","La barbacio vs Arriba españa","Los mejores vs Tu puedes","la barbacio","Los mejores", "Ariiba España","Tu puedes","Juan","Pedro","Diego","Alberto");
        Resultados resultado = new Resultados ("2-1","4-6","3-2","2-0","la barbacio vs los mejores","arriba españa vs Tu puedes","La barbacio vs Arriba españa","Los mejores vs Tu puedes","la barbacio","Los mejores", "Ariiba España","Tu puedes","Juan","Pedro","Diego","Alberto");
        Posiciones posicion = new Posiciones ("Los mejores","La barbacio","Tu puedes","Arriba españa","2-1","4-6","3-2","2-0","la barbacio vs los mejores","arriba españa vs Tu puedes","La barbacio vs Arriba españa","Los mejores vs Tu puedes","la barbacio","Los mejores", "Ariiba España","Tu puedes","Juan","Pedro","Diego","Alberto");
        
        System.out.println("Capitan " + jugador.getCapitan1());
        System.out.println("Capitan " + jugador.getCapitan2());
        System.out.println("Capitan " + jugador.getCapitan3());
        System.out.println("Capitan " + jugador.getCapitan4());
        
        System.out.println("--------------------------------");
        
        System.out.println("Equipos : " + equipo.getEquipo1() + " su capitan es : " + jugador.getCapitan1());
        System.out.println("Equipos : " + equipo.getEquipo2() + " su capitan es : " + jugador.getCapitan2());
        System.out.println("Equipos : " + equipo.getEquipo3() + " su capitan es : " + jugador.getCapitan3());
        System.out.println("Equipos : " + equipo.getEquipo4() + " su capitan es : " + jugador.getCapitan4());
        
        System.out.println("--------------------------------");
        
        System.out.println("Partido 1 : " + partido.getPartido1() + " su resultado fue : " + resultado.getResultado1());
        System.out.println("Partido 1 : " + partido.getPartido2() + " su resultado fue : " + resultado.getResultado2());
        System.out.println("Partido 1 : " + partido.getPartido3() + " su resultado fue : " + resultado.getResultado3());
        System.out.println("Partido 1 : " + partido.getPartido4() + " su resultado fue : " + resultado.getResultado4());
        
        System.out.println("--------------------------------");
        
        System.out.println("Primera posicion : " + posicion.getPosicion1());
        System.out.println("Segunda posicion : " + posicion.getPosicion2());
        System.out.println("Tercera posicion : " + posicion.getPosicion3());
        System.out.println("Cuarta posicion : " + posicion.getPosicion4());
    }
    
}
