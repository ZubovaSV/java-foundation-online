package ru.itsjava.figures;

public class Square extends Figure {

    private int a;

    public Square() {

    }

    public Square(int a) {
        this.a = a;
    }

    public void perimeter() {
        int p = 4 * a;
        System.out.println("Периметр квадрата " + p);
    }

    public void square() {
        int s = a * a;
        System.out.println("Площадь квадрата " + s);
    }

}