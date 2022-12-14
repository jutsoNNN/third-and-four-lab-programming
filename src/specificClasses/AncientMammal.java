package specificClasses;

import abstractClasses.Animal;
import basicClasses.City;
import interfaces.AnimalActions;

public class AncientMammal extends Animal implements AnimalActions {
    public AncientMammal(String name, int yearOld) {
        super(name, yearOld);
    }
    @Override
    public void life(String cityName) {
        System.out.println(this.name + " жил в " + cityName);
    }
}
