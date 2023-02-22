package ru.itsjava.figures;

public class Triangle extends Figure {
    private int a, b, c, h;

    public Triangle() {

    }

    public Triangle(int a, int b, int c, int h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.h = h;
    }

    public void perimeter() {
        int p = a + b + c;
        System.out.println("Периметр треугольника " + p);
    }

    public void square() {
        int s = h * a / 2;
        System.out.println("Площадь треугольника " + s);
    }


}