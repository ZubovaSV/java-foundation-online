package ru.itsjava.figures;

public class Main {
    public static void main(String[] args) {
        Figure tria = new Triangle(3,4,5,4);
        tria.perimeter();
        tria.square();

        Figure sq = new Square(5);
        sq.perimeter();
        sq.square();

        Figure rec = new Rectangle(6,8);
        rec.perimeter();
        rec.square();

        Figure circ = new Circle(5.5);
        circ.perimeter();
        circ.square();

    }
}
