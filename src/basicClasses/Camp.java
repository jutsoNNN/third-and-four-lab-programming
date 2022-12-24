package basicClasses;

import interfaces.CityActions;

public class Camp implements CityActions {
    public String name;
    public boolean isCreated = false;

    public String getName() {
        return name;
    }
    public Camp(String name) {
        this.name = name;
    }
    @Override
    public void generating() {
        System.out.println("Генерация лагеря из прошлого...");
        isCreated = true;
        doSmth();
    }
}