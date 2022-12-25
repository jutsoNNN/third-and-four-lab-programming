package abstractClasses;

import exception.AgeException;
import specificClasses.Author;

public abstract class Person {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) throws AgeException{
        if (age <= 0){
            throw new AgeException("Возраст " + this.name + " введён некорректно");
        }
        this.age = age;
    }
    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }
//    public Person(String name, int age) {
//        this.name = name;
//        if (age >= 0) {
//            this.age = age;
//        } else {
//            System.out.println("Ошибка! Возраст не может быть отрицательным числом!");
//            System.exit(1);
//        }
//    }
    public void say(String saying) {
        System.out.println(saying);
    }
}

