package com.mycompany.ultima_clase;

import com.mycompany.ultima_clase.sports_huevo.Scenario;
import com.mycompany.ultima_clase.sports_huevo.SportCenter;
import com.mycompany.ultima_clase.sports_huevo.TypeSport;

public class Ultima_clase {

    public static void main(String[] args) {
        
        SportCenter sportCenter = new SportCenter("El campo", "127", "Bogota", "En la mañana");
         
        Scenario scenario_1 = new Scenario(1800, TypeSport.FOOTBALL, "En la tarde");
        Scenario scenario_2 = new Scenario(1500, TypeSport.BASKETBALL, "En la tarde");
        
        sportCenter.addScenario(scenario_1);
        sportCenter.addScenario(scenario_2);
        
        sportCenter.bookScuptamadre(scenario_1);
        sportCenter.bookScuptamadre(scenario_2);
        sportCenter.bookScuptamadre(scenario_1);
        
        
    }
}
