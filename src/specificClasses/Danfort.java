package specificClasses;

import abstractClasses.Person;
import enums.Nouns;
import interfaces.PersonActions;

public class Danfort extends Person implements PersonActions {
    public String name;
    public static boolean scared = false;
    public boolean seeSmth = false;
    public Danfort(String name, int age) {
        super(name, age);
    }

    @Override
    public void think(String whereIs) {

    }

    @Override
    public void realize() {

    }

    @Override
    public void say() {

    }

    @Override
    public void recognize() {

    }

    @Override
    public void beAfraid() {

    }

    @Override
    public void walk(String s, String n) {

    }

    @Override
    public void senses(String whereIs) {

    }

    @Override
    public void see() {
        if(scared){
            System.out.println("К " + this.getName() + " и его напарник увидели "
                    + Nouns.REVELATIONS.toString() + " сошедшие к ним с покрытых резьбой стен.");
            seeSmth = true;
        }
        if(seeSmth && Author.seeSmth){

        }
    }
}
