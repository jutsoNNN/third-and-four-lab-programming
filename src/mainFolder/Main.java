package mainFolder;

import abstractClasses.*;
import basicClasses.*;
import enums.Adjectives;
import specificClasses.*;

public class Main {
    public static void main(String[] args) {
        Author author = new Author("Автор", 30);
        Reader reader = new Reader("Читатель", 20);
        Danfort danfort = new Danfort("Данфорт", 30);
        Labyrinth labyrinth = new Labyrinth();
        City city = new City("Древний город");
        BuilderOfLabyrinth builderOfLabyrinth = new BuilderOfLabyrinth("Строитель лабиринта", 1000000, true);
        Camp camp = new Camp("Лагерь");
        city.generating();
        builderOfLabyrinth.generating();
        camp.generating();
        System.out.println("/---------------/ НАЧАЛО /---------------/");
        author.walk(danfort.getName(), city.getName());
        labyrinth.toKeep();
        builderOfLabyrinth.creatingLabyrinth();
        author.senses("Только зашли");
        author.realize();
        author.think("После увиденного города");
        author.think("Мысли о пережитом");
        danfort.see();
    }
}