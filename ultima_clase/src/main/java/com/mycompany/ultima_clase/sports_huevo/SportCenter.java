package com.mycompany.ultima_clase.sports_huevo;
import java.util.ArrayList;
import java.util.List;

public class SportCenter {

    private String name;
    private String ID;
    private String location;
    private String horario;
    
    List<Scenario> scenaries = new ArrayList<>();

    public SportCenter(String name, String ID, String location, String horario) {
        this.name = name;
        this.ID = ID;
        this.location = location;
        this.horario = horario;
    }
    
    public void addScenario (Scenario scenario){
        this.scenaries.add(scenario);
    }
    
    public void bookScuptamadre (Scenario scenario){
        int index = this.scenaries.indexOf(scenario);
        Scenario sc = this.scenaries.get(index);
        
        if(sc.isAvailable()){
            System.out.println("Esta Disponible el escenario");
            sc.setAvailable(false);
        }else{
            System.out.println("No esta dsiponible");
        }
        
        
        
    }

    

    
}
