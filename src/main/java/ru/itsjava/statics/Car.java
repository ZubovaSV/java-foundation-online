package ru.itsjava.statics;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Car {

    private String brand;
    private String color;
    private static double price;

    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price = price;
    }





}
