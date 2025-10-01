package com.zoo.species;

import com.zoo.animals.IPlayable;
import com.zoo.animals.Mammal;

public class Lion extends Mammal implements IPlayable {
    public Lion(String name, int energyLevel, double weight) {
        super(name, energyLevel, weight);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " -Roars!");
    }

    @Override
    public void eat() {
        System.out.println(name + " eats meat.");
        increaseEnergyLevelBy(getEnergyLevel() + 20);
    }

    @Override
    public void play() {

    }

    @Override
    public void move() {

    }

    @Override
    public void sleep() {
        System.out.println(name + " is sleeping in the shade.");

        int newEnergy = getEnergyLevel() + 30;
        if (newEnergy > 100) newEnergy = 100;
        increaseEnergyLevelBy(newEnergy);


    }
}
