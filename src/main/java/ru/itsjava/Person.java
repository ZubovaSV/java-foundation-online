package ru.itsjava;

import lombok.AllArgsConstructor;
import lombok.Data;
@AllArgsConstructor
@Data
public class Person {
    public String name;
    public int age;

    void birthday() {
        age ++;
    }

    boolean takeBeer(){
        return age > 18;
    }


}
