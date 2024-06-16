package com.mycompany.ultima_clase.people;

import com.mycompany.ultima_clase.sports_huevo.TypeSport;

public class Sportman extends Person implements Doping, Diet{
    private TypeSport typeSport;
    private Categories categories;

    public Sportman(TypeSport typeSport, Categories categories, String name, String ID, int age, String gender, Role role) {
        super(name, ID, age, gender, role);
        this.typeSport = typeSport;
        this.categories = categories;
    }
    
    @Override
    public void doDopingTest(){
        System.out.println("Pealizando test de dopaje");
    }
    
    @Override
    public void doDiet(){
        if(this.typeSport == TypeSport.BASKETBALL){
            System.out.println("Dieta de Basketball");
            
        }else if(this.typeSport == TypeSport.FOOTBALL){
            System.out.println("Dieta de fútbol");
            
        }else {
            System.out.println("Dieta de voleybol");
        }
        
    }

}
