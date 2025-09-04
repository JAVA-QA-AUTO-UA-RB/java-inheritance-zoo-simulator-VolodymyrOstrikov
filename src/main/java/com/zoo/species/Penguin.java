package com.zoo.species;

import com.zoo.animals.Bird;
import com.zoo.animals.IPlayable;


public class Penguin extends Bird implements IPlayable {

    public Penguin(String name, int energyLevel) {
        super(name, energyLevel);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " Squawks! ");
    }

    @Override
    public void eat() {

    }

    @Override
    public void sleep() {

    }

    @Override
    public void uniqueBirdAction() {

    }

    @Override
    public void play() {

    }
}
