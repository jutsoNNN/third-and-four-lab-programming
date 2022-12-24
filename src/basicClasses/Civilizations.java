package basicClasses;

public class Civilizations {
    private String name; //todo модификаторы!!!
    private String country;
    private String namePeople;
    private String totemAnimal;
    public String getName() {
        return name;
    }
    public String getCountry() {
        return country;
    }
    public String getNamePeople() {
        return namePeople;
    }
    public String getTotemAnimal() {
        return totemAnimal;
    }
    public Civilizations(String name, String country, String namePeople, String totemAnimal) {
        this.name = name;
        this.country = country;
        this.namePeople = namePeople;
        this.totemAnimal = totemAnimal;
    }
    public void useAnimals(){
        System.out.println(this.getName() + " цивилизация использовала " + this.totemAnimal + " в качестве тотемного животного на своих знаках.");
    }
}
