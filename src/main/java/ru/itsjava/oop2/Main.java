package ru.itsjava.oop2;

public class Main {
    public static void main(String[] args) {

        Airplane boeing737 = new Boeing();
        boeing737.setModel("737");
        boeing737.setRange(5000);
        System.out.println("boeing737.toString() = " + boeing737.toString());
        boeing737.start();
        boeing737.fly();

        Airplane airbusA320 = new Airbus();
        airbusA320.setModel("A320");
        airbusA320.setRange(5600);
        System.out.println("airbusA320.toString() = " + airbusA320.toString());
        airbusA320.start();
        airbusA320.fly();
    }
}
