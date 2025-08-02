package com.zoo.species;

import com.zoo.animals.Mammal;


public class Elephant extends Mammal {

    public Elephant(String name, int age, double weight, int energyLevel, String furColor) {
        super(name, age, weight, energyLevel, furColor);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " Trumpets! ");
    }

    public void spraySelf() {
        System.out.println(name + " is spraying water on it self.");
    }
}
