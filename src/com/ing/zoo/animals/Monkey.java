package com.ing.zoo.animals;

import java.util.Random;

import com.ing.zoo.behaviour.Carnivore;
import com.ing.zoo.behaviour.Herbivore;
import com.ing.zoo.behaviour.TrickPerformer;

public class Monkey extends Animal implements Carnivore, Herbivore, TrickPerformer{
        public String name;
    public String helloText;
    public String eatText;
    public String trick;

    public Monkey(String name)
    {
        super(name);
    }

    public void sayHello()
    {
        helloText = "oeh oeh aah aah";
        System.out.println(helloText);
    }

    public void eatLeaves()
    {
        eatText = "munch munch bleh oeh aah";
        System.out.println(eatText);
    }

    public void eatMeat()
    {
        eatText = "nomnomnom whoop whooooop";
        System.out.println(eatText);
    }

    public void performTrick()
    {
        Random random = new Random();
        int rnd = random.nextInt(2);
        if(rnd == 0)
        {
            trick = "*throws banana peel* slips and dies...";
        }
        else
        {
            trick = "*throws banana peel* perfect salto and lands";
        }
        System.out.println(trick);
    }
    
}
