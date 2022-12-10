package specificClasses;

import abstractClasses.Person;
import enums.Nouns;
import interfaces.PersonActions;

public class Danfort extends Person implements PersonActions {
    public String name;
    public static boolean scared = false;
    public boolean guessSmth = true;
    public boolean seeSmth = false;
    public Danfort(String name, int age) {
        super(name, age);
    }

    @Override
    public void think(String whereIs) {
        //
    }

    @Override
    public void realize() {
        if(guessSmth && Author.guessSmth){
            System.out.println(this.getName() + " и напарник поняли, чья " + BuilderOfLabyrinth.hand + " построила этот город.");
        }
    }
    @Override
    public void walk(String s, String n) {
        //
    }

    @Override
    public void senses(String whereIs) {
        //
    }

    @Override
    public void see(String seeSmth) {
        if(scared && seeSmth == "Посмотрел на стены"){
            System.out.println(this.getName() + " и его напарник увидели "
                    + Nouns.REVELATIONS.toString() + " сошедшие к ним с покрытых резьбой стен.");
            this.seeSmth = true;
        }
        if(this.seeSmth && Author.seeSmth){

        }
    }
}
