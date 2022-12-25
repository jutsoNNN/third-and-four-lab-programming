package basicClasses;

public class Airplane {
    private String name;
    private int manufactureYear;
    public Airplane(int manufactureYear, String name) {
        if(manufactureYear > 1600){
            this.manufactureYear = manufactureYear;
        }
        this.name = name;
    }
    public int getManufactureYear() {
        return manufactureYear;
    }
    public String getName(){
        return name;
    }
    public void toFly(){
        System.out.println("Летели на " + this.name + " и видели всё это сверху.");
    }
}