package basicClasses;

import interfaces.CityActions;

public class City implements CityActions{
    public static String name;

    public String getName() {
        return name;
    }
    public City(String name) {
        this.name = name;
    }
    @Override
    public void generating() {
        System.out.println("Генерация города...");
        doSmth();
    }
}