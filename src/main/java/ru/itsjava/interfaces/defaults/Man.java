package ru.itsjava.interfaces.defaults;

public class Man implements Talkable,Eatable{

    @Override
    public void eat() {
        System.out.println("Man is eating");

    }

}
