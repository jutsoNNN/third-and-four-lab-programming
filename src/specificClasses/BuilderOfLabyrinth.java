package specificClasses;

import abstractClasses.Person;
import basicClasses.Labyrinth;
import enums.Adjectives;
import interfaces.CityActions;

public class BuilderOfLabyrinth extends Person implements CityActions {
    private boolean notHuman;
    public String hand = " рука";
    public static boolean labyrinthIsCreated = false;
    public BuilderOfLabyrinth(String name, int age, boolean notHuman) {
        super(name, age);
        this.notHuman = notHuman;
    }
    public void generating(){
        System.out.println("Создание лабиринта...");
        labyrinthIsCreated = true;
        doSmth();
    }
    public void creatingLabyrinth(){
        if(notHuman){
            hand = Adjectives.INHUMAN.toString() + hand;
            System.out.println(hand + " сложила этот " + Labyrinth.name + ".");
        }
        else{
            System.out.println("Город создан простыми людьми и в нём нет ничего страшного или странного.");
            Author.enterToCity = false;
        }
    }
}
