package ru.itsjava.interfaces;

public class Man implements Walkable, Swimable, Runnable{



    @Override
    public void run() {
        System.out.println("Man is running");

    }

    @Override
    public int maxRunDistance() {
        return 20000;
    }

    @Override
    public void swim() {
        System.out.println("Man is swimming");

    }

    @Override
    public double maxSwimSpeed() {
        return 5000;
    }

    @Override
    public void walk() {
        System.out.println("Man is walking");

    }
}
