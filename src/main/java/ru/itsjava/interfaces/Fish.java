package ru.itsjava.interfaces;

public class Fish implements Swimable{

    @Override
    public void swim() {
        System.out.println("Swimming is my life");

    }

    @Override
    public double maxSwimSpeed() {
        return 20;
    }


}
