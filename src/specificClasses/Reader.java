package specificClasses;

import abstractClasses.Person;

public class Reader extends Person {
//  mindCondition (true - нормальное, false - ненормальное).
    public static boolean mindCondition = true;
    public Reader(String name, int age) {
        super(name, age);
    }

    @Override
    public void say(String saying) {
        super.say(saying);
        System.out.println("Читатель понял ....");
    }
}
