package com.zoo.species;

import com.zoo.animals.Bird;


public class Penguin extends Bird {

    public Penguin(String name, int age, double weight, int energyLevel, double wingSpan) {
        super(name, age, weight, energyLevel, wingSpan);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " Squawks! ");
    }

    public void swim() {
        System.out.println(name + " swims in ice-cold water.");
        setEnergyLevel(getEnergyLevel() - 10);
    }

    @Override
    public void fly() {
        System.out.println(name + " doesn't fly, but swims instead!");
        swim();
    }
}
