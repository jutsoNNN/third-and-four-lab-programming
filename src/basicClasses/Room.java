package basicClasses;

import enums.Adjectives;

import static java.lang.Math.*;

public class Room {
    public class Door{
        private int size = 12;
        protected void beInRoom(){
            System.out.println("Настенную резьбу разрывали " + Adjectives.HIGH + " "
                    + Adjectives.WINDOW + " и " + size + " футов в размере дверные проёмы.");
        }
        protected void beOnTheSamePlace(){
            System.out.println("Двери, спустя много лет, всё равно оставались на тех же местах.");
        }
    }
    public class WoodBoards{
        protected void liedOn(int howMany){
            if (howMany >= 2){
                System.out.println("Деревянные доски лежали повсюду...");
            }
        }
    }
    public class Walls{
        //    recess = выемка/углубление
        public class Recess{
            protected boolean isEmpty = true;
            public void generateThings(){
                if(random() < 0.5){
                    isEmpty = false;
                    System.out.println("В выемках в стенах лежали какие-то предметы.");
                }
                else{
                    System.out.println("В выемках в стенах ничего не лежало.");
                }
            }
        }
        public void getGeneratedThings(){
            Recess recess = new Recess();
            recess.generateThings();
        }
    }
    public class Window{
        private boolean isBroken = true;
        public void brokenWindows(){
            if(random() < 0.5){
                isBroken = false;
                System.out.println("На удивление, окна были целые");

            }
            else{
                System.out.println("Окна были разбиты вдребезги, но какие-то всё равно были целы.");
            }
        }
    }
    public class Ceiling{
        protected boolean beMosaic = false;
        protected void beUnusual(){
            beMosaic = true;
            System.out.println("Потолки ничем не выделялись, кроме того, что были из мозайки.");
        }
    }
    public class Floor{
        public void describe(){
            System.out.println("На полах мозайка встречалась редко, в основном он был из " + Adjectives.ROUGH + " плитки.");
        }
    }
    public class Trash{

    }
    public void getPicture(){
        Walls walls = new Walls();
        Door door = new Door();
        WoodBoards woodBoards = new WoodBoards();
        Window window = new Window();
        door.beInRoom();
        woodBoards.liedOn(10);
        door.beOnTheSamePlace();
        window.brokenWindows();
        walls.getGeneratedThings();
    }
    public void getPicture2(){
        Ceiling ceiling = new Ceiling();
        Floor floor = new Floor();
        ceiling.beUnusual();
        floor.describe();
    }
}
