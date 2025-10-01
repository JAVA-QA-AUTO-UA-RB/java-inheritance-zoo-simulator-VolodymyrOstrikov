package com.zoo.animals;

public abstract class Mammal extends Animal {

    public Mammal(String name, int age, double weight) {
        super(name, age, weight);
    }

    public abstract void move();

    @Override
    public void makeSound() {

    }
}