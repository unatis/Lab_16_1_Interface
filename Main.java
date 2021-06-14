package com.company;

public class Main {

    public static void main(String[] args) {

        Pig pig = new Pig();
        pig.animalSound();
        pig.sleep();
        pig.SomeDefaultMethod();
        pig.EatBread();

        //Animal animal = new Animal();
        Animal animal = pig;
        animal.animalSound();
    }

}
