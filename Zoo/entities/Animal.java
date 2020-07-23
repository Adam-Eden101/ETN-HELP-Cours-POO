package entities;

import java.util.concurrent.ThreadLocalRandom;

public class Animal {
    
    protected String name;
    protected String meal;
    protected int weight;
    protected int age;
    protected int agressivity;
    protected String genre;

    public Animal() {}

    public Animal(String name, String meal, int weight, int age, int agressivity, String genre) {
        this.name = name;
        this.meal = meal;
        this.weight = weight;
        this.age = age;
        this.agressivity = agressivity;
        this.genre = genre;
    }

    public void inspect() {
        System.out.println("It is a " + this.name + " who eats " + this.meal + ". It is " + this.age + " and weigths " + this.weight + " kg.");
    }
}
