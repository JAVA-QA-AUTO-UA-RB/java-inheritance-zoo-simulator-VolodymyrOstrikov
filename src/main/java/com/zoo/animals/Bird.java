package com.zoo.animals;

public abstract class Bird extends Animal {

    public Bird(String name, int age, double weight) {
        super(name, age, weight);
    }

    public abstract void uniqueBirdAction();

}
