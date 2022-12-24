package specificClasses;

import abstractClasses.Animal;
import basicClasses.City;
import enums.Adjectives;
import interfaces.AnimalActions;

public class Dinosaur extends Animal implements AnimalActions {
    public Dinosaur(String name, int yearOld) {
        super(name, yearOld);
    }
    @Override
    public void life(String cityName) {
        System.out.println(this.name + " жил в "  + cityName);
    }
    void beBig(){
        System.out.println(Adjectives.HUGE);
    }
    public void describe(){

    }
}
