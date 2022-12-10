package specificClasses;

import abstractClasses.Person;

public class Reader extends Person {
//  mindCondition (true - нормальное, false - ненормальное).
    public static boolean mindCondition = true;
    public static boolean guessSmth;
    public Reader(String name, int age) {
        super(name, age);
    }
    public void recognize(){
        System.out.println(this.getName() + " догадался, в чём тут дело...");
    }
    @Override
    public int hashCode()
    {
        final int PRIME = 31;
        int result = 1;
        result = PRIME * result + getAge();
        return result;
    }
    @Override
    public boolean equals(Object o) {
        if (o == null) {
            return false;
        }
        if (o == this) {
            return true;
        }
        if (getClass() != o.getClass()) {
            return false;
        }
        Reader e = (Reader) o;
        return (this.getAge() == e.getAge());
    }
}
