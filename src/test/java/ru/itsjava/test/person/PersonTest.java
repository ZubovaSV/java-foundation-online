package ru.itsjava.test.person;

//import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.itsjava.Person;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Класс Person должен:")
public class PersonTest {
    public static final String DEFUALT_NAME = "John";
    public static final int DEFUALT_AGE = 20;
    public static final String NEW_PERSON = "Michel";

    @DisplayName("корректно создаваться конструктором")
    @Test
    public void shouldHaveCorrectConstructor(){
        Person actualPerson = new Person(DEFUALT_NAME, DEFUALT_AGE );
        Person actualPerson2 = new Person("George", 17);

//        Assertions.assertEquals(DEFUALT_NAME, actualPerson.getName());
//        Assertions.assertEquals(DEFUALT_AGE, actualPerson.getAge());

        assertAll("actualPerson", ()-> assertEquals(DEFUALT_NAME, actualPerson.getName()),
                ()->assertEquals(DEFUALT_AGE, actualPerson.getAge()));
    }


@DisplayName("корреткно менять имя")
    @Test
    public void shouldHaveCorrectUpdatePerson(){
        Person actualPerson = new Person(DEFUALT_NAME, DEFUALT_AGE );
        actualPerson.setName(NEW_PERSON);

        assertEquals(NEW_PERSON, actualPerson.getName());

    }
    @DisplayName("корректно считать возраст")
    @Test
    public void shouldHaveCorrectCalculateAge(){
        Person actualPerson = new Person("Tom", 25 );
        Person actualPerson2 = new Person("George", 17);

        actualPerson.birthday();
        actualPerson2.birthday();

        assertAll("Method birthday", ()-> assertEquals(26, actualPerson.getAge()),
                ()->assertEquals(18, actualPerson2.getAge()));
    }
    @DisplayName("корректно разрешать продажу пива")
    @Test
    public void shouldHaveGiveBeer(){
        Person actualPerson = new Person("Tom", 25 );
        Person actualPerson2 = new Person("George", 17);

        assertFalse(actualPerson2.takeBeer());
        assertTrue(actualPerson.takeBeer());

    }
}
