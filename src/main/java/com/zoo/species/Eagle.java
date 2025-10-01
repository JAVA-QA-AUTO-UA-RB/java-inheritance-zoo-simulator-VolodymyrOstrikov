package com.zoo.species;


import com.zoo.animals.Bird;
import com.zoo.animals.IPlayable;

public class Eagle extends Bird implements IPlayable {

    public Eagle(String name, int age, double weight) {
        super(name, age, weight);
    }

    @Override
    public void uniqueBirdAction() {

    }

    @Override
    public void eat() {

    }

    @Override
    public void sleep() {

    }

    @Override
    public void play() {

    }

    @Override
    public void makeSound() {
        System.out.println(name + " -Screeches! ");
    }


}
