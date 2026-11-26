package com.ing.zoo.animals;

import com.ing.zoo.behaviour.Carnivore;

public class Lion extends Animal implements Carnivore {

    public Lion(String name) {
        super(name);
    }

    @Override
    public void sayHello() {
        System.out.println("roooaoaaaaar");
    }

    @Override
    public void eatMeat() {
        System.out.println("nomnomnom thx mate");
    }
}
