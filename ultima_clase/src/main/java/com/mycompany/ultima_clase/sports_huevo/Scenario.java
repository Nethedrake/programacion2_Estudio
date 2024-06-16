package com.mycompany.ultima_clase.sports_huevo;

public class Scenario {
    private int capacity;
    private TypeSport typeSport;
    
    private String horario;
    private boolean avaliable;

    public Scenario(int capacity, TypeSport typeSport, String horario) {
        this.capacity = capacity;
        this.typeSport = typeSport;
        this.horario = horario;
        this.avaliable = true;            // Le estoy dadno la dsiponibilidad
    }
    
    public boolean isAvailable(){
        return avaliable;
    }
    

    public void setAvailable(boolean available) {
        this.avaliable = available;
    }
    
}
