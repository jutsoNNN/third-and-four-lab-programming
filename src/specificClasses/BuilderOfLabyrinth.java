package specificClasses;

import abstractClasses.Person;
import basicClasses.Labyrinth;
import enums.Adjectives;
import interfaces.CityActions;

public class BuilderOfLabyrinth extends Person implements CityActions {
    private boolean notHuman;
    public static String hand = " рука";
    public static boolean labyrinthIsCreated = false;
    private boolean enterToCity = false;
    public BuilderOfLabyrinth(boolean notHuman) {
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
            System.out.println(hand + " сложила этот лабиринт зданий.");
        }
        else{
            System.out.println("Город создан простыми людьми и в нём нет ничего страшного или странного.");
            enterToCity = false;
            System.exit(1);
        }
    }
}
