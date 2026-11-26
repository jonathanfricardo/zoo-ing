package com.ing.zoo.animals;

import java.util.Random;

import com.ing.zoo.behaviour.Carnivore;
import com.ing.zoo.behaviour.TrickPerformer;

public class Otter extends Animal implements Carnivore, TrickPerformer{
        public String name;
    public String helloText;
    public String eatText;
    public String trick;

    public Otter(String name)
    {
        super(name);
    }

    public void sayHello()
    {
        helloText = "squeek squeeeeek";
        System.out.println(helloText);
    }

    public void eatMeat()
    {
        eatText = "nomnomnom chuckle purr";
        System.out.println(eatText);
    }

    public void performTrick()
    {
        Random random = new Random();
        int rnd = random.nextInt(2);
        if(rnd == 0)
        {
            trick = "swims through inflatable rubber ring";
        }
        else
        {
            trick = "jumps out the water ands starts to break dance";
        }
        System.out.println(trick);
    }
    
}
