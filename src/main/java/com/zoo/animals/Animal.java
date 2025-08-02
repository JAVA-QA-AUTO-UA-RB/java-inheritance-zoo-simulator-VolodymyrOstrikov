package com.zoo.animals;

public class Animal {


    protected String name;
    protected int age;
    protected double weight;
    private int energyLevel;
    private int happinessLevel;

    public void setEnergyLevel(int energyLevel) {
        if (energyLevel > 100) {
            this.energyLevel = 100;
        } else if (energyLevel < 0) {
            this.energyLevel = 0;
        } else {
            this.energyLevel = energyLevel;
        }

    }

    public void setHappinessLevel(int happinessLevel) {
        if (happinessLevel < 0) {
            this.happinessLevel = 0;
        } else if (happinessLevel > 100) {
            this.happinessLevel = 100;
        } else {
            this.happinessLevel = happinessLevel;
        }
    }

    public Animal(String name, int age, double weight, int energyLevel) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.energyLevel = energyLevel;
        this.happinessLevel = 50;
    }

    public void eat() {
        if (energyLevel + 20 > 100) {
            energyLevel = 100;
        } else {
            energyLevel += 20;
        }
        setHappinessLevel(happinessLevel + 5);
    }

    public void sleep() {
        if (energyLevel + 20 > 100) {
            energyLevel = 100;
        } else {
            energyLevel += 30;
        }
        setHappinessLevel(happinessLevel + 5);
    }


    public void makeSound() {
        System.out.println(name + " makes a sound.");
    }

    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age + ", Weight: " + weight + ", Energy: " + energyLevel +
                ", Happiness: " + happinessLevel);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public int getEnergyLevel() {
        return energyLevel;
    }

    public int getHappinessLevel() {
        return happinessLevel;
    }
}
