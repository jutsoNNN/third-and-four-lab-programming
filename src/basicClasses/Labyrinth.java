package basicClasses;

import enums.Adjectives;
import interfaces.CityActions;
import interfaces.Walls;
import specificClasses.Author;
import specificClasses.BuilderOfLabyrinth;

public class Labyrinth implements Walls {
    public static String name = "Лабиринт зданий";
    @Override
    public void haveСondition() {

    }
    public void toKeep(){
        if (BuilderOfLabyrinth.labyrinthIsCreated){
            System.out.println(Labyrinth.name + " был " + Adjectives.EMPTY.toString() + " и хранил " + Adjectives.COFFIN + " молчание.");
        }
        else {
            System.out.println("Они спокойно нашли дорогу к выходу и покинули это место.");
            Author.enterToCity = false;
        }
    }
}