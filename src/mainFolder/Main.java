package mainFolder;

import basicClasses.*;
import specificClasses.*;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws NoSuchFieldException {
        Author author = new Author("Автор", 30);
        Reader reader = new Reader("Читатель", 20);
        Reader reader2 = new Reader("Читатель", 20);
        Danfort danfort = new Danfort("Данфорт", 30);
        Images images = new Images("Мотив пятиконечия ");
        Labyrinth labyrinth = new Labyrinth();
        City city = new City("Древний город");
        Airplane airplane = new Airplane(1999, "Самолёт");
        Room room = new Room();
        String cityName = city.getName();
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
        author.enterToCity = true;
        danfort.enterToCity = true;
        room.getPicture();
        strangeCreatures.dropThings();
        room.getPicture2();
        author.say(1);
        author.say(2);
        author.see("Рассматривает комнату");
        author.see("Нижние этажи");
        author.go("Вышли из здания");
        strangeCreatures.ownCastle();
        labyrinth.toKeep();
        builderOfLabyrinth.creatingLabyrinth();
        author.senses("Только зашли");
        author.realize(cityName);
        author.think("После увиденного города");
        reader.mindCondition = false;
        if(camp.isCreated){
            author.think("Мысли о пережитом");
            author.scared = true;
            danfort.scared = true;
        }
        danfort.see("Посмотрел на стены");
        author.scared = false;
        danfort.scared = false;
        author.see("Увидел какие-то рисунки");
        images.giveSmth();
        danfort.realize();
        strangeCreatures.life(cityName);
        strangeCreatures.whereLife();
        dinosaur.life(cityName);
        ancientMammal.life(cityName);
        author.see("Рассматривает рисунки");
        images.imgFivePointed();
        images.describe();
        miioniyskaya.useAnimals();
        egypitskaya.useAnimals();
        rimskaya.useAnimals();
        drevnaya.useAnimals();
        author.senses("Смирились с реальностью");
        author.scared = true;
        danfort.scared = true;
        reader.recognize();
        airplane.toFly();
        dinosaur.beOnEarth();
        strangeCreatures.beSmart();
        if (camp.isCreated) {
            strangeCreatures.createCity();
        }
        strangeCreatures.beCreatersOfLife();
        strangeCreatures.comeToEarth();
        strangeCreatures.describe("Плоть");
        strangeCreatures.describe("Сила");
        author.say(3);
        author.beInShock(author.getName());
        author.beInShock(danfort.getName());
        author.see("Изображения в доме");
        author.say(4);
        System.out.println("/---------------/ Сравнение /---------------/");
        System.out.println(reader.equals(reader2));
        Set readers = new HashSet();
        readers.add(reader);
        readers.add(reader2);
        System.out.println(readers);
    }
}