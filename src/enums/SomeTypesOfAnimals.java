package enums;

public enum SomeTypesOfAnimals {
    WOLF("волк"),
    SCARABEY("скарабей"),
    BULL("бык"),
    EAGLE("орёл");
    private String mean;
    SomeTypesOfAnimals(String name) {
        this.mean = name;
    }
    @Override
    public String toString() {
        return mean;
    }
}
