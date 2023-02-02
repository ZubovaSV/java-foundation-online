package ru.itsjava.oop2;

public class Airplane {
    private final String brand;
    private final boolean isPassenger;
    private String model;
    private int range;


    public Airplane(String brand, boolean isPassenger) {
        this.brand = brand;
        this.isPassenger = isPassenger;
    }




    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setRange(int range) {
        this.range = range;
    }
    public int getRange() {
        return range;
    }
    public String toString() {
        return "{" + brand + " " + " Passenger " + isPassenger + " }";
    }
    public void start() {
        System.out.println(brand + " " + getModel() + " is ready to start");
    }

    public void fly() {
        System.out.println(brand + " " + getModel() + " start flying");
    }
}
