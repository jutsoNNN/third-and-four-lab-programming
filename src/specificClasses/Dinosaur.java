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
    public void life() {
        System.out.println(this.name + " жил в "  + City.name);
    }
    void beBig(){
        System.out.println(Adjectives.HUGE.toString());
    }
}
