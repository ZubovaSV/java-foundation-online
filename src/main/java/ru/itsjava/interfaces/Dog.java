package ru.itsjava.interfaces;

public class Dog implements Walkable, Runnable{


    @Override
    public void run() {
        System.out.println("Dog is running");

    }

    @Override
    public int maxRunDistance() {
        return 2000;
    }

    @Override
    public void walk() {
        System.out.println("Dog is walking");

    }
}
