package abstractClasses;

public abstract class Person {
    String name;
    int age;

    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void say(String saying) {
        System.out.println(saying);
    }
}
