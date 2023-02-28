package ru.itsjava.interfaces.comparable;

import java.util.Arrays;

public class ComparablePractice {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person john = new Person("John", "Void", 37);
        Person jake = new Person("Jake", "Ross", 38);
        Person peter = new Person("Peter", "Moore", 35);
        Person tim = new Person("Tim", "Cook", 38);

        Person[] persons = {john, jake, peter, tim};

        System.out.println(Arrays.toString(persons));
        Arrays.sort(persons);
        System.out.println(Arrays.toString(persons));

        Person julia = new Person("Julia", "Brown", 25);
        Person julia2 = (Person) julia.clone();
        System.out.println(julia2 + " клон " + julia);

    }
}
