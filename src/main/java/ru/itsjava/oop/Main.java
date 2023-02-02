package ru.itsjava.oop;

public class Main {
    public static void main(String[] args) {
        Bird parrot = new Parrot();
        System.out.println("parrot.toString() = " + parrot.toString());
        parrot.fly();

        Bird crown = new Crown();
        System.out.println("crown.toString() = " + crown.toString());
        crown.fly();

        Bird duck = new Bird("Duck", true);
        System.out.println("duck.toString = " + duck.toString());
        duck.fly();


    }
}
