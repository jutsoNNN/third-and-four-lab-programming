package abstractClasses;

public abstract class Animal {
    protected String name;
    private int yearOld;
    public Animal(String name, int yearOld) {
        this.name = name;
        if (yearOld >= 0) {
            this.yearOld = yearOld;
        } else {
            System.out.println("Ошибка! Возраст не может быть отрицательным числом!");
            System.exit(1);
        }
    }
    public void createTheCity() {
        System.out.println("Обитают в древнем городе...");
    }
}

