package mainFolder;

import basicClasses.*;
import specificClasses.*;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Author author = new Author("Автор", 30);
        Reader reader = new Reader("Читатель", 20);
        Reader reader2 = new Reader("Читатель", 20);
        Danfort danfort = new Danfort("Данфорт", 30);
        Labyrinth labyrinth = new Labyrinth();
        City city = new City("Древний город");
        BuilderOfLabyrinth builderOfLabyrinth = new BuilderOfLabyrinth("Строитель лабиринта", 1000000, true);
        Camp camp = new Camp("Лагерь");
        StrangeCreatures strangeCreatures = new StrangeCreatures("Странные древние существа",100000);
        Dinosaur dinosaur = new Dinosaur("Динозавр", 100000);
        AncientMammal ancientMammal = new AncientMammal("Древнее млекопитающее", 100000);
        Civilizations miioniyskaya = new Civilizations("Мийонийская", "Крит", "мийонийцы", "бык");
        Civilizations egypitskaya = new Civilizations("Египетская", "Египет", "египтяне", "скарабей");
        Civilizations rimskaya = new Civilizations("Римская", "Рим", "римцы", "волчица и орёл");
        Civilizations drevnaya = new Civilizations("Древняя", "Древний мир", "австралопитеки", "разные существа");
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
        danfort.see("Посмотрел на стены");
        author.see("Увидел какие-то рисунки");
        danfort.realize();
        strangeCreatures.life();
        strangeCreatures.whereLife();
        dinosaur.life();
        ancientMammal.life();
        author.see("Рассматривает рисунки");
        miioniyskaya.useAnimals();
        egypitskaya.useAnimals();
        rimskaya.useAnimals();
        drevnaya.useAnimals();
        author.senses("Смирились с реальностью");
        reader.recognize();
        System.out.println("/---------------/ Сравнение /---------------/");
        System.out.println(reader.equals(reader2));
        Set readers = new HashSet();
        readers.add(reader);
        readers.add(reader2);
        System.out.println(readers);
    }
}