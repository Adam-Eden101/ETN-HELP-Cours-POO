package entities;

import java.util.concurrent.ThreadLocalRandom;

public class Lion extends Carnivore {

    public Lion(int weight, int age) {
        super("Lion", weight, age, 0, "");

        if (age > 10) {
            this.agressivity = ThreadLocalRandom.current().nextInt(40, 100 + 1);
        } else {
            this.agressivity = ThreadLocalRandom.current().nextInt(1, 39 + 1);
        }

        Integer is_male = ThreadLocalRandom.current().nextInt(0, 1 + 1);
        this.genre = is_male.equals(1) ? "male" : "female";
    }

    public void inspect() {
        System.out.println("It is a " + this.genre + " who is at " + this.agressivity + "% agressive. It eats " + this.meal + ". It is " + this.age + " and weigths " + this.weight + " kg.");
    }
}
