package com.zoo.animals;


public class Bird extends Animal {
    protected double wingSpan;

    public Bird(String name, int age, double weight, int energyLevel, double wingSpan) {
        super(name, age, weight, energyLevel);
        this.wingSpan = wingSpan;
    }

    @Override
    public void makeSound() {
        System.out.println(name + " makes a bird sound.");
    }

    public void fly() {
        System.out.println(name + " is flying.");
        setEnergyLevel(getEnergyLevel() - 15);
    }
}
