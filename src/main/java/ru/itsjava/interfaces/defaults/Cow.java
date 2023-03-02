package ru.itsjava.interfaces.defaults;

public class Cow implements Eatable{

    @Override
    public void eat() {
        System.out.println("Cow is eating");
    }
}
