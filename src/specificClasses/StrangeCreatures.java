package specificClasses;

import abstractClasses.Animal;
import enums.Countries;
import interfaces.AnimalActions;
import interfaces.StrangeCreaturesActions;

public class StrangeCreatures extends Animal implements AnimalActions, StrangeCreaturesActions {
    public StrangeCreatures(String name, int yearOld) {
        super(name, yearOld);
    }
    @Override
    public void life(String cityName) {
        System.out.println(this.name + " жили в этом городе давно.");
    }
    @Override
    public void whereLife(){
        System.out.println(this.name + " жили на территории " + Countries.EUROPE.toString() + " и " + Countries.ASIA.toString() + ".");
    }
    @Override
    public void dropThings(){
        System.out.println(this.name + " бросали их за ненадобностью, видино потому что сломались.");
    }
    @Override
    public void ownCastle(){
        System.out.println(this.name + " ,которые владели замками, не являлись динозавр.");
    }
    @Override
    public void describe(){

    }
    @Override
    public void beCreatersOfLife(){

    }
    @Override
    public void comeToEarth(){

    }
}
