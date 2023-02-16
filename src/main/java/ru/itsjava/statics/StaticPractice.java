package ru.itsjava.statics;


public class StaticPractice {
    public static void main(String[] args) {
        Car bentley = new Car("Bentley","green");
        Car opel = new Car("Opel","red" );

        bentley.setPrice(100000);
        System.out.println("bentley.getPrice() = " + bentley.getPrice());
        System.out.println("opel.getPrice() = " + opel.getPrice());

        bentley.setPrice(200000);
        System.out.println("bentley.getPrice() = " + bentley.getPrice());
        System.out.println("opel.getPrice() = " + opel.getPrice());

    }
}
