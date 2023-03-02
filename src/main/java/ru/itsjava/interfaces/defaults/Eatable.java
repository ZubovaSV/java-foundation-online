package ru.itsjava.interfaces.defaults;

public interface Eatable {
    default void eat() {
        System.out.println("ЕМ!");
    }
}
