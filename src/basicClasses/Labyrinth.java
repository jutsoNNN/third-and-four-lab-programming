package basicClasses;

import enums.Adjectives;
import specificClasses.Author;
import specificClasses.BuilderOfLabyrinth;

public class Labyrinth{
    public String name = "Лабиринт зданий";
    private boolean enterToCity = true;

    public void toKeep(){
        if (BuilderOfLabyrinth.labyrinthIsCreated){
            System.out.println(this.name + " был " + Adjectives.EMPTY.toString() + " и хранил " + Adjectives.COFFIN + " молчание.");
        }
        else {
            System.out.println("Они спокойно нашли дорогу к выходу и покинули это место.");
            enterToCity = false;
        }
    }
}