package basicClasses;

import abstractClasses.Image;
import enums.Adjectives;
import enums.Nouns;

public class Images extends Image {
    public String picture = "мотив пятиконечия";
    public static boolean visibility = false;
    public Images(String picture){
        super(picture);
    }
    @Override
    public void giveSmth(){
        System.out.println(Adjectives.UNAMBIGUOUS.toString() + " " + Nouns.IMAGES.toString()
                + " выдавали " + Adjectives.SCARY.toString() + " " + Nouns.SECRETS.toString() + ".");
    }
    @Override
    public void imgFivePointed(){
        if (visibility) {
            System.out.println(this.picture + "на стенах:");
        }
    }
    @Override
    public void describe(){
        System.out.println(" Знак - " + Adjectives.CULTURAL.toString() + " и " + Adjectives.RELIGIOUS.toString()
                + " почитания некоего " + Adjectives.ANCIENT.toString() +  " физического объекта, имевшего подобные признаки.");
    }
}
