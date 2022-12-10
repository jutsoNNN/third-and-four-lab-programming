package enums;

public enum Countries {
    EUROPE ("Европа"),
    ASIA ("Азия"),
    KRIT ("Крит");
    private String mean;
    Countries(String name) {
        this.mean = name;
    }
    @Override
    public String toString() {
        return mean;
    }
}
