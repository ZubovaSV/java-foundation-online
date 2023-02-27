package ru.itsjava.interfaces;

public class Bird implements Flyable{
    @Override
    public void fly() {
        System.out.println("Bird is flying");

    }

    @Override
    public String flyMaxDistance() {
        return "Africa";
    }

}
