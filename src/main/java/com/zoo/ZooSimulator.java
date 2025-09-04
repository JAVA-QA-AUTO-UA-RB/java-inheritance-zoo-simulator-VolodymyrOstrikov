package com.zoo;

import com.zoo.animals.Animal;
import com.zoo.species.Eagle;
import com.zoo.species.Elephant;
import com.zoo.species.Lion;
import com.zoo.species.Penguin;
import com.zoo.zookeper.ZooKeeper;

import java.util.ArrayList;
import java.util.List;

public class ZooSimulator {

    public static void main(String[] args) {
        ZooKeeper keeper = new ZooKeeper("Mr_Keeper");

        Lion lion = new Lion("Bob", 10);
        Elephant elephant = new Elephant("BigGuy", 8);
        Eagle eagle = new Eagle("Tommy", 3);
        Penguin penguin = new Penguin("Bernard", 2);


        List<Animal> animals = new ArrayList<>();
        animals.add(lion);
        animals.add(elephant);
        animals.add(eagle);
        animals.add(penguin);

        System.out.println("    Animal Info    ");
        for (Animal animal : animals) {
            keeper.checkAnimalEnergyLevel(animal);
            animal.makeSound();
            animal.eat();
            animal.sleep();
        }
    }
}