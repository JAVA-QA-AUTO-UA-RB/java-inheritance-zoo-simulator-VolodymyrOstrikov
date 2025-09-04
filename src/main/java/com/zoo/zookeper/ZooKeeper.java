package com.zoo.zookeper;

import com.zoo.animals.Animal;
import com.zoo.species.Elephant;
import com.zoo.species.Lion;


public class ZooKeeper {
    private String name;

    public ZooKeeper(String name) {
        this.name = name;
    }

    public void feedAnimal(Lion animal) {
        System.out.println(name + " feeds " + animal.getName());
        animal.eat();
    }

    public void playWithAnimal(Elephant animal) {
        System.out.println(name + " plays with " + animal.getName());
        animal.makeSound();

    }

    public void checkAnimalEnergyLevel(Animal animal) {
        int energy = animal.getEnergyLevel();
        String status;
        if (energy >= 0 && energy <= 30) status = "Low";
        else if (energy > 30 && energy <= 70) status = "Medium";
        else status = "High";
        System.out.println(animal.getName() + " has " + status + " energy.");
    }
}
