package ru.itsjava.figures;

public class Rectangle extends Figure {
    private int a;
    private int b;

    public Rectangle() {

    }

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void perimeter() {
        int p = 2 * (a + b);
        System.out.println("Периметр прямоугольника " + p);
    }

    public void square() {
        int s = a * b;
        System.out.println("Площадь прямоугольника " + s);
    }
}