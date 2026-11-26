package com.ing.zoo;

import com.ing.zoo.animals.*;
import com.ing.zoo.behaviour.*;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Zoo {
    public static void main(String[] args) {
        List<Animal> animals = Arrays.asList(
                new Lion("henk"),
                new Hippo("elsa"),
                new Pig("dora"),
                new Tiger("wally"),
                new Zebra("marty")

        );

        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.print("Voer uw command in: ");
            String input = scanner.nextLine();

            if (input.equals("exit")) {
                break;
            } else if (input.equals("hello")) {

                for (Animal animal : animals) {
                    animal.sayHello();
                }

            } else if (input.startsWith("hello ")) {

                String name = input.substring("hello ".length());
                boolean found = false;

                for (Animal animal : animals) {
                    if (animal.getName().equals(name)) {
                        animal.sayHello();
                        found = true;
                    }
                }

                if (!found) {
                    System.out.println("Geen dier gevonden met de naam: " + name);
                }

            } else {
                System.out.println("Onbekend command: " + input);
            }
        }
    }
}
