package enums;

public enum Nouns {
    MOOD ("настроений,"),
    IMPRESSIONS ("впечатлений,"),
    MEMORIES ("воспоминаний"),
    ABOMINATION ("мерзость"),
    HUMAN ("человек"),
    REVELATIONS ("откровения"),
    BAS_RELIEFS ("барельефы"),
    IMAGES ("изображения"),
    SECRETS ("тайны"),
    CRYPT("склеп"),
    DUST("пыль"),
    SAND("песок"),
    DIZZINESS ("головокружение");
    private String mean;
    Nouns(String name) {
        this.mean = name;
    }
    @Override
    public String toString() {
        return mean;
    }
}
