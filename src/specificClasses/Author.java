package specificClasses;

import abstractClasses.Person;
import basicClasses.City;
import basicClasses.Images;
import enums.Adjectives;
import enums.Nouns;
import interfaces.AuthorActions;

public class Author extends Person implements AuthorActions {
    public boolean guessSmth = false;
    private boolean headpain = false;
    public boolean enterToCity = false;
    private int helpInt = 0;
    public boolean scared = false;
    public boolean seeSmth = true;
    public Author(String name, int age) {
        super(name, age);
    }

    public void say(String saying){
        System.out.println(saying);
    }
    @Override
    public void think(String whereIs) {
        if (headpain && whereIs.equals("После увиденного города") && helpInt == 2){
            System.out.println(this.getName() + " подумал: \"" + Nouns.HUMAN.toString() + ", если он "
                    + Adjectives.SENSITIVE.toString() + ", получит " + Nouns.DIZZINESS.toString() + " здесь\".");
            helpInt += 1;
        }
        if (whereIs.equals("Мысли о пережитом") && helpInt == 3){
            System.out.println(this.getName() + " и напарник пережили " + Adjectives.RECENTLY.toString()
                    + " в Лагерь " + Adjectives.STRONG.toString() + " потрясение.");
        }
    }

    @Override
    public void realize(String cityName) {
        if ((enterToCity) && (!headpain) && (helpInt == 1)){
            headpain = true;
            String head = " кружится голова";
            System.out.println("У " + this.getName() + head + " от того, что " + cityName + " был " + Adjectives.DESOLATE.toString() + ".");
            helpInt += 1;
        }
    }
    @Override
    public void walk(String s, String n) {
        System.out.println(this.getName() + " и " + s +" попадают в " + n);
        enterToCity = true;
    }
    @Override
    public void senses(String whereIs) {
        if(enterToCity){
            if (whereIs.equals("Только зашли")) {
                System.out.println(this.getName() + " и его друг испытали " + Adjectives.DEADLY.toString() +
                        " " + Adjectives.EXHAUSTING.toString() + " череду " + Nouns.MOOD.toString() + " " + Nouns.IMPRESSIONS.toString()
                + " " + Nouns.MEMORIES.toString() + ".");
                helpInt += 1;
            }
            if (whereIs.equals("Смирились с реальностью")){
                System.out.print(this.getName() + " и напарник смирились с реальностью, из-за которой ");
                see("Смирились с реальностью");
            }
        }
    }
    @Override
    public void see(String seeSmth) {
        if (seeSmth.equals("Увидел какие-то рисунки")) {
            guessSmth = true;
        }
        if (seeSmth.equals("Рассматривает рисунки")){
            System.out.print(this.getName() + " увидел ");
            Images.visibility = true;
        }
        if (seeSmth.equals("Смирились с реальностью")){
            helpInt = 65;
            System.out.println("волосы встали дыбом.");
        }
    }
}