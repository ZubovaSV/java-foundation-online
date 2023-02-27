package ru.itsjava.interfaces;

public class InterfacePractice {
    public static void main(String[] args) {

        Marathon(new Man());
        Marathon(new Dog());
        Marathon(new Cat());

        Sky(new Bird());

        Sea(new Fish());


    }

    private static void Marathon(Runnable run) {
        System.out.println(run.maxRunDistance());
    }
    private static void Sky(Flyable fly) {
        System.out.println(fly.flyMaxDistance());
    }
    private static void Sea(Swimable swimable) {
       swimable.swim();
    }

}
