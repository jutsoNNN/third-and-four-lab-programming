package enums;

public enum Adjectives {
    DESOLATE ("запустевший"),
    ANCIENT ("древний"),
    COFFIN ("гробовое"),
    EMPTY ("опустевший"),
    CHAOTIC ("хаотичная"),
    EXHAUSTING ("изматывающую"),
    DEADLY("смертельно"),
    INHUMAN ("Нечеловеческая"),
    SENSITIVE ("чувствительный"),
    RECENTLY ("недавно"),
    STRONG ("сильное");
    private String mean;
    Adjectives(String name) {
        this.mean = name;
    }
    @Override
    public String toString() {
        return mean;
    }
}
