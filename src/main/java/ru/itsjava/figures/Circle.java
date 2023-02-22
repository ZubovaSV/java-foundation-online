package ru.itsjava.figures;

public class Circle extends Figure {
    private double r;

    public Circle() {

    }

    public Circle(double r) {
        this.r = r;

    }

    public void perimeter() {
        double p = 2*PI*r;
        System.out.println("Периметр круга " + p);
    }

    public void square() {
        double s = PI*r*r;
        System.out.println("Площадь круга " + s);
    }


}