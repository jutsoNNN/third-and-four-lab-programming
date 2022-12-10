package specificClasses;

import abstractClasses.Person;
import basicClasses.Camp;
import basicClasses.City;
import basicClasses.Images;
import enums.Adjectives;
import enums.Nouns;
import interfaces.PersonActions;

public class Author extends Person implements PersonActions {
    public static boolean guessSmth = false;
    private boolean headpain = false;
    public static boolean enterToCity = false;
    private int helpInt = 0;
    public boolean scared = false;
    public static boolean seeSmth = true;
    public Author(String name, int age) {
        super(name, age);
    }
    public void say(String saying){
        System.out.println(saying);
    }
    @Override
    public void think(String whereIs) {
        if (headpain && whereIs.equals("После увиденного города") && helpInt == 2){
            Reader.mindCondition = false;
            System.out.println(this.getName() + " подумал: \"" + Nouns.HUMAN.toString() + ", если он "
                    + Adjectives.SENSITIVE.toString() + ", получит " + Nouns.DIZZINESS.toString() + " здесь\".");
            helpInt += 1;
        }
        if (whereIs.equals("Мысли о пережитом") && helpInt == 3 && Camp.isCreated){
            System.out.println(this.getName() + " и напарник пережили " + Adjectives.RECENTLY.toString()
                    + " в " + Camp.name + " " + Adjectives.STRONG.toString() + " потрясение.");
            this.scared = true;
            Danfort.scared = true;
        }
        this.scared = false;
        Danfort.scared = false;
    }

    @Override
    public void realize() {
        if ((enterToCity) && (!headpain) && (helpInt == 1)){
            headpain = true;
            String head = " кружится голова";
            System.out.println("У " + this.getName() + head + " от того, что " + City.name + " был " + Adjectives.DESOLATE.toString() + ".");
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
            Images.giveSmth();
            guessSmth = true;
        }
        if (seeSmth.equals("Рассматривает рисунки")){
            System.out.print(this.getName() + " увидел ");
            Images.visibility = true;
            Images.imgFivePointed();
            Images.describe();
        }
        if (seeSmth.equals("Смирились с реальностью")){
            this.scared = true;
            Danfort.scared = true;
            helpInt = 65;
            System.out.println("волосы встали дыбом.");
        }
    }
}