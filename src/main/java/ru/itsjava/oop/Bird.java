package ru.itsjava.oop;

public class Bird {
    public String name;
    public boolean migration;

    public Bird() {

    }

    public Bird(String name) {
        this.name = name;

    }

    public Bird(String name, boolean migration) {
        this.name = name;
        this.migration = migration;

    }

    public String toString() {
        return "{" + name + " " + migration + "}";
    }

    public void fly() {
        System.out.println("Flying...");
    }

}
