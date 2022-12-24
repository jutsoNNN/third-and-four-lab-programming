package specificClasses;

import abstractClasses.Animal;
import enums.Countries;
import interfaces.AnimalActions;

public class StrangeCreatures extends Animal implements AnimalActions {
    public StrangeCreatures(String name, int yearOld) {
        super(name, yearOld);
    }
    @Override
    public void life(String cityName) {
        System.out.println(this.name + " жили в этом городе давно.");
    }
    public void whereLife(){
        System.out.println(this.name + " жили на территории " + Countries.EUROPE.toString() + " и " + Countries.ASIA.toString() + ".");
    }
    public void ownCastle(){

    }
    public void describe(){

    }
    public void beCreatersOfLife(){

    }
    public void comeToEarth(){

    }
    
}
