package ru.itsjava.interfaces.defaults;

public class Plant implements Eatable {

    @Override
    public void eat() {
        System.out.println("Plant is eating");
    }
}
