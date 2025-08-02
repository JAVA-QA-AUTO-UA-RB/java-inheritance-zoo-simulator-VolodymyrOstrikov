package com.zoo.species;

import com.zoo.animals.Mammal;


public class Lion extends Mammal {
    public Lion(String name, int age, double weight, int energyLevel, String furColor) {
        super(name, age, weight, energyLevel, furColor);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " Roars!");
    }

    public void hunt() {
        System.out.println(name + " is hunting!");
        setEnergyLevel(getEnergyLevel() - 25);
        setHappinessLevel(getHappinessLevel() + 5);
    }

    @Override
    public void sleep() {
        System.out.println(name + " is sleeping in the shade.");

        int newEnergy = getEnergyLevel() + 30;
        if (newEnergy > 100) newEnergy = 100;
        setEnergyLevel(newEnergy);

        setHappinessLevel(getHappinessLevel() + 10);
    }
}
