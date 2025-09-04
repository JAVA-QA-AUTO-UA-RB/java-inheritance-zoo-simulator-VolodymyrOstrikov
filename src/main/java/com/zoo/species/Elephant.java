package com.zoo.species;

import com.zoo.animals.IPlayable;
import com.zoo.animals.Mammal;


public class Elephant extends Mammal implements IPlayable {

    public Elephant(String name, int energyLevel) {
        super(name, energyLevel);
    }

    @Override
    public void move() {

    }

    @Override
    public void play() {

    }

    @Override
    public void sleep() {

    }

    @Override
    public void eat() {

    }

    @Override
    public void makeSound() {
        System.out.println(name + " Trumpets! ");
    }


}
