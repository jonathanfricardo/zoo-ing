package com.ing.zoo.animals;

import java.util.Random;

import com.ing.zoo.behaviour.Carnivore;
import com.ing.zoo.behaviour.TrickPerformer;

public class Tiger extends Animal implements Carnivore, TrickPerformer {

    public Tiger(String name) {
        super(name);
    }

    @Override
    public void sayHello() {
        System.out.println("rraaarww");
    }

    @Override
    public void eatMeat() {
        System.out.println("nomnomnom oink wubalubadubdub");
    }

    @Override
    public void performTrick() {
        Random random = new Random();
        if (random.nextInt(2) == 0) {
            System.out.println("jumps in tree");
        } else {
            System.out.println("scratches ears");
        }
    }
}
