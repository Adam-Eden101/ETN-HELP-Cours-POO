package entities;

public class Carnivore extends Animal {

    public Carnivore(String name, int weight, int age, int agressivity, String genre) {
        super(name, "meat", weight, age, agressivity, genre);
    }
}
