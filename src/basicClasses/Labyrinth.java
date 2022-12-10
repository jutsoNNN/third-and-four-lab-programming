package basicClasses;

import enums.Adjectives;
import specificClasses.Author;
import specificClasses.BuilderOfLabyrinth;

public class Labyrinth{
    public static String name = "Лабиринт зданий";

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