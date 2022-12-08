package basicClasses;

import enums.Adjectives;
import interfaces.Walls;

public class Building implements Walls {
    String name;
    public String getName() {
        return name;
    }
    public Building(String name) {
        this.name = name;
    }
    @Override
    public void haveСondition() {

    }
}