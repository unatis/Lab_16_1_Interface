package com.company;

public class Pig implements Animal{

    @Override
    public void animalSound() {
        System.out.println("The pig says: wee wee");
    }

    @Override
    public void sleep() {
        System.out.println("Zzz");
    }

    public void EatBread() {
        System.out.println("Om nom nom");
    }
}
