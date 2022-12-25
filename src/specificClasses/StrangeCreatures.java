package specificClasses;

import abstractClasses.Animal;
import enums.Adjectives;
import enums.Countries;
import interfaces.AnimalActions;
import interfaces.StrangeCreaturesActions;
import org.w3c.dom.ls.LSOutput;

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
    public void describe(String whatDescribe){
        if(whatDescribe.equals("Плоть")){
            System.out.println(whatDescribe + " " + this.name + " сформировалась за годы эволюции на другой планете.");
        }
        if (whatDescribe.equals("Сила")){
            System.out.println(this.name + " обладали " + Adjectives.HUGE + ", " + Adjectives.INHUMAN + " силой.");
        }
    }
    @Override
    public void beCreatersOfLife(){
        this.name = "Старцы";
        System.out.println(this.name + " являлись создателями жизни, и послужили прототипами " + Adjectives.ANCIENT + " миф.");
    }
    @Override
    public void comeToEarth(){
        System.out.println("Теперь мы будем назвать их " + this.name + ".");
        System.out.println(this.name + " прилетели на Землю, когда она только появилась.");
    }
    @Override
    public void beSmart() {
        System.out.println(this.name + " были, в отличии от них, " + Adjectives.SMART + " и " + Adjectives.WISE);
    }
    @Override
    public void createCity() {
        System.out.println(this.name + " создали этот город задолго до появления привычной жизни.");
    }
}
