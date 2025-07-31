package com.zoo;

import com.zoo.species.*;
import com.zoo.zookeper.ZooKeeper;

public class ZooSimulator {

    public static void main(String[] args) {
        Lion bob = new Lion("Bob", 10, 180.0, 90, "Brown");
        Elephant bigGuy = new Elephant("BigGuy", 8, 1000.0, 80, "Gray");
        Eagle tommy = new Eagle("Tommy", 3, 10.0, 60, 2.0);
        Penguin bernard = new Penguin("Bernard", 2, 14.0, 50, 0.5);

        ZooKeeper keeper = new ZooKeeper("Mr_Keeper");

        keeper.feedAnimal(bob);
        keeper.playWithAnimal(bernard);
        keeper.playWithAnimal(bigGuy);
        keeper.checkAnimalEnergyLevel(bigGuy);
        keeper.groomMammal(bob);
        keeper.showAnimalInfo(bernard);
        keeper.showAnimalInfo(bob);

        bob.hunt();
        tommy.fly();
        bernard.fly();
        bigGuy.spraySelf();
        bob.sleep();
    }
}