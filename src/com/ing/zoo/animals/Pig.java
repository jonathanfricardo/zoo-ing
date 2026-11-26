package com.ing.zoo.animals;

import java.util.Random;

import com.ing.zoo.behaviour.Carnivore;
import com.ing.zoo.behaviour.Herbivore;
import com.ing.zoo.behaviour.TrickPerformer;

public class Pig extends Animal implements Carnivore, Herbivore, TrickPerformer {

    public Pig(String name) {
        super(name);
    }

    @Override
    public void sayHello() {
        System.out.println("oink oink");
    }

    @Override
    public void eatLeaves() {
        System.out.println("munch munch oink");
    }

    @Override
    public void eatMeat() {
        System.out.println("nomnomnom oink thx");
    }

    @Override
    public void performTrick() {
        Random random = new Random();
        if (random.nextInt(2) == 0) {
            System.out.println("rolls in the mud");
        } else {
            System.out.println("runs in circles");
        }
    }
}
