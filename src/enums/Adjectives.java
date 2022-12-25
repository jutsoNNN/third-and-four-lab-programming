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
    UNAMBIGUOUS ("Недвусмысленные"),
    SCARY ("страшные"),
    SIMPLE("простой"),
    HUGE("огромный"),
    CULTURAL("культурное"),
    RELIGIOUS("религиозное"),
    HIGH ("высокие"),
    WINDOW ("оконные"),
    ROUGH("грубая"),
    ONWALL ("настенные"),
    ECHOING("гулкие"),
    CERTAIN("определенные"),
    EARLIER("ранее"),
    SMART("умный"),
    WISE("мудрый"),
    SEPARATED("отделенный"),
    geological("геологический"),
    biological("биологический"),
    astronomical("астрономический"),
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
