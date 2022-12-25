package specificClasses;

import abstractClasses.Person;
import enums.Nouns;
import interfaces.DanfortActions;

public class Danfort extends Person implements DanfortActions {
    public static String name;
    public boolean scared = false;
    public boolean guessSmth = true;
    public boolean seeSmth = false;
    private boolean authorGuessSmth = true;
    public boolean enterToCity = false;
    @Override
    public void realize() {
        if(guessSmth && authorGuessSmth){
            System.out.println(this.getName() + " и напарник поняли, чья " + BuilderOfLabyrinth.hand + " построила этот город.");
        }
    }
    @Override
    public void see(String seeSmth) {
        if(scared && seeSmth == "Посмотрел на стены"){
            System.out.println(this.getName() + " и его напарник увидели "
                    + Nouns.REVELATIONS.toString() + " сошедшие к ним с покрытых резьбой стен.");
            this.seeSmth = true;
        }
    }
}