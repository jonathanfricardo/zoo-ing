package com.ing.zoo.animals;

import java.util.Random;

import com.ing.zoo.behaviour.Herbivore;

public class Zebra extends Animal implements Herbivore {

    public Zebra(String name) {
        super(name);
    }

    @Override
    public void sayHello() {
        System.out.println("zebra zebra");
    }

    @Override
    public void eatLeaves() {
        System.out.println("munch munch zank yee bra");
    }
}
