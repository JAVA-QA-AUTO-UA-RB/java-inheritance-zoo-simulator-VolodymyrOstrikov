package com.zoo.animals;

public abstract class Animal implements IEatable, ISleepable {

    protected String name;
    protected int energyLevel;


    public Animal(String name, int energyLevel) {
        this.name = name;
        this.energyLevel = energyLevel;
    }

    public String getName() {
        return name;
    }

    public int getEnergyLevel() {
        return energyLevel;
    }

    public void setEnergyLevel(int energyLevel) {
        if (energyLevel > 100) {
            this.energyLevel = 100;
        } else if (energyLevel < 0) {
            this.energyLevel = 0;
        } else {
            this.energyLevel = energyLevel;
        }

    }

    public abstract void makeSound();

}
