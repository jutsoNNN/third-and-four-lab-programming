package mainFolder;

import basicClasses.*;
import exception.AgeException;
import exception.NameException;
import interfaces.CityActions;
import interfaces.DanfortActions;
import interfaces.Shockable;
import specificClasses.*;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws NoSuchFieldException {
        Author author = new Author();
        try {
            author.setName("Автор");
            author.setAge(20);
        } catch (AgeException e) {
            throw new RuntimeException(e);
        }
        Reader reader = new Reader();
        try {
            reader.setName("Читатель");
            reader.setAge(20);
        }catch (AgeException e){
            throw  new RuntimeException(e);
        }
        Reader reader2 = new Reader();
        try {
            reader2.setName("Читатель");
            reader2.setAge(20);
        }catch (AgeException e){
            throw  new RuntimeException(e);
        }
        Danfort danfort = new Danfort();
        try {
            danfort.setName("Данфорт");
            danfort.setAge(30);
        }catch (AgeException e){
            throw  new RuntimeException(e);
        }
        Images images = new Images("Мотив пятиконечия ");
        Labyrinth labyrinth = new Labyrinth();
        City city = new City("Древний город");
        Airplane airplane = new Airplane(1999, "Самолёт");
        Room room = new Room();
        String cityName = city.getName();
        BuilderOfLabyrinth builderOfLabyrinth = new BuilderOfLabyrinth(true);
        try {
            builderOfLabyrinth.setName("Строитель лабиринта");
            builderOfLabyrinth.setAge(1000000000);
        }catch (AgeException e){
            throw  new RuntimeException(e);
        }
        Camp camp = new Camp("Лагерь");
        StrangeCreatures strangeCreatures = new StrangeCreatures("Странные древние существа",1000000000);
        Dinosaur dinosaur = new Dinosaur("Динозавр", 100000);
        AncientMammal ancientMammal = new AncientMammal("Древнее млекопитающее", 100000);
        Civilizations miioniyskaya = new Civilizations("Мийонийская", "Крит", "мийонийцы", "бык");
        Civilizations egypitskaya = new Civilizations("Египетская", "Египет", "египтяне", "скарабей");
        Civilizations rimskaya = new Civilizations("Римская", "Рим", "римцы", "волчица и орёл");
        Civilizations drevnaya = new Civilizations("Древняя", "Древний мир", "австралопитеки", "разные существа");
        city.generating();
        builderOfLabyrinth.generating();
        camp.generating();
        Shockable shockable = new Shockable() {
            @Override
            public void beInShock(String namePerson) {
                System.out.println(namePerson + " шокирован.");
            }
        };
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
        shockable.beInShock(author.getName());
        shockable.beInShock(danfort.getName());
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