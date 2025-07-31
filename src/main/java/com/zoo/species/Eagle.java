package com.zoo.species;


import com.zoo.animals.Bird;

public class Eagle extends Bird {

    public Eagle(String name, int age, double weight, int energyLevel, double wingSpan) {
        super(name, age, weight, energyLevel, wingSpan);
    }

    @Override
    public void makeSound() {
        System.out.println("Screeches!");
    }

    @Override
    public void fly() {
        System.out.println(name + " is soaring high in the sky.");
        setEnergyLevel(getEnergyLevel() - 20);
    }
}
