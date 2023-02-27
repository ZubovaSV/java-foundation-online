package ru.itsjava.interfaces;

public class Cat implements Walkable, Runnable{

    @Override
    public void run() {
        System.out.println("Cat is running");

    }

    @Override
    public int maxRunDistance() {
        return 1000;
    }


    @Override
    public void walk() {
        System.out.println("Cat is walking");

    }
}
