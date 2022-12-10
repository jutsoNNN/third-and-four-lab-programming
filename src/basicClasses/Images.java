package basicClasses;

import enums.Adjectives;
import enums.Nouns;

public class Images {
    public static boolean visibility = false;
    public static void giveSmth(){
        System.out.println(Adjectives.UNAMBIGUOUS.toString() + " " + Nouns.IMAGES.toString()
                + " выдавали " + Adjectives.SCARY.toString() + " " + Nouns.SECRETS.toString() + ".");
    }
    public static void imgFivePointed(){
        if (visibility) {
            System.out.println("мотив пятиконечия на стенах:");
        }
    }
    public static void describe(){
        System.out.println(" Знак - " + Adjectives.CULTURAL.toString() + " и " + Adjectives.RELIGIOUS.toString()
                + " почитания некоего " + Adjectives.ANCIENT.toString() +  " физического объекта, имевшего подобные признаки.");
    }
}
