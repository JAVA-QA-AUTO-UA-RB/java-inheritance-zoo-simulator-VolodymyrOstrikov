package com.zoo.zookeper;

import com.zoo.animals.Animal;
import com.zoo.animals.Mammal;


public class ZooKeeper {
    private String name;

    public ZooKeeper(String name) {
        this.name = name;
    }

    public void feedAnimal(Animal animal) {
        System.out.println(name + " feeds " + animal.getName());
        animal.eat();
    }

    public void playWithAnimal(Animal animal) {
        System.out.println(name + " plays with " + animal.getName());
        animal.makeSound();
        animal.setHappinessLevel(animal.getHappinessLevel() + 10);
    }

    public void checkAnimalEnergyLevel(Animal animal) {
        int energy = animal.getEnergyLevel();
        String status;
        if (energy >= 0 && energy <= 30) status = "Low";
        else if (energy > 30 && energy <= 70) status = "Medium";
        else status = "High";
        System.out.println(animal.getName() + " has " + status + " energy.");
    }

    public void groomMammal(Mammal mammal) {
        System.out.println(name + " is grooming " + mammal.getName());
        mammal.groom();
    }

    public void showAnimalInfo(Animal animal) {
        System.out.println(name + " is checking info about " + animal.getName() + ":");
        animal.displayInfo();
    }
}
