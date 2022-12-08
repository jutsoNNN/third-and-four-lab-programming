package abstractClasses;

public abstract class Animal {
    private String name;
    private int yearOld;

    public Animal(String name, int yearOld) {
        this.name = name;
        this.yearOld = yearOld;
    }
    public void createTheCity() {
        System.out.println("Обитают в древнем городе...");
    }
}

