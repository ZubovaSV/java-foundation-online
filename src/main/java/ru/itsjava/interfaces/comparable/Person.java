package ru.itsjava.interfaces.comparable;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Person implements Comparable<Person>, Cloneable{
    private final String name;
    private final String surname;
    private double age;


    @Override
    public int compareTo(Person person) {
        int dif = this.surname.compareTo(person.surname);
        if (dif == 0) {
            dif = this.name.compareTo(person.name);
        } ;
        if (dif == 0) {
            dif = (int) (this.age - person.age);
        }
        return dif;

    }

    @Override
    public String toString() {
        return name + " " + surname + ", " + age;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException{
        return super.clone();

    }


}
