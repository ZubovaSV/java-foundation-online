package ru.itsjava.interfaces.defaults;

public interface Talkable {
    default void talk() {
        System.out.println("Bla Bla Bla");

    }

}
