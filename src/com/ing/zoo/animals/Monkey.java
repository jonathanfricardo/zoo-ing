package com.ing.zoo.animals;

import java.util.Random;

import com.ing.zoo.behaviour.Carnivore;
import com.ing.zoo.behaviour.Herbivore;
import com.ing.zoo.behaviour.TrickPerformer;

public class Monkey extends Animal implements Carnivore, Herbivore, TrickPerformer {

    public Monkey(String name) {
        super(name);
    }

    @Override
    public void sayHello() {
        System.out.println("oeh oeh aah aah");
    }

    @Override
    public void eatLeaves() {
        System.out.println("munch munch bleh oeh aah");
    }

    @Override
    public void eatMeat() {
        System.out.println("nomnomnom whoop whooooop");
    }

    @Override
    public void performTrick() {
        Random random = new Random();
        if (random.nextInt(2) == 0) {
            System.out.println("*throws banana peel* slips and dies...");
        } else {
            System.out.println("*throws banana peel* perfect salto and lands");
        }
    }
}
