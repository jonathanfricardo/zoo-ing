package com.ing.zoo.animals;

import java.util.Random;

import com.ing.zoo.behaviour.Carnivore;
import com.ing.zoo.behaviour.TrickPerformer;

public class Otter extends Animal implements Carnivore, TrickPerformer {

    public Otter(String name) {
        super(name);
    }

    @Override
    public void sayHello() {
        System.out.println("squeek squeeeeek");
    }

    @Override
    public void eatMeat() {
        System.out.println("nomnomnom chuckle purr");
    }

    @Override
    public void performTrick() {
        Random random = new Random();
        if (random.nextInt(2) == 0) {
            System.out.println("swims through inflatable rubber ring");
        } else {
            System.out.println("jumps out of the water and starts to break dance");
        }
    }
}
