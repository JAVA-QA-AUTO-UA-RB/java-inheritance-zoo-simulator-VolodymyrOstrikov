package com.zoo.animals;


public class Mammal extends Animal {
    protected String furColor;

    public Mammal(String name, int age, double weight, int energyLevel, String furColor) {
        super(name, age, weight, energyLevel);
        this.furColor = furColor;
    }

    @Override
    public void makeSound() {
        System.out.println(name + " makes a mammal sound.");
    }

    public void groom() {
        System.out.println(name + " is grooming its fur.");
    }
}