package org.examples.streamapi._1;

import org.junit.jupiter.api.Test;

import static org.examples.streamapi.TestUtil.PEOPLE;

public class ForEachTest {
    @Test
    public void printOutNamesAllCaps_comments(){
        PEOPLE
                .forEach(
                      /*
                        To help you understand the lambda's syntax
                        You may start with this and use IntelliJ to simplify the expression.
                     */
                        (person) -> {
                            System.out.println(person.getName().toUpperCase());
                        }
                );
    }

    @Test
    public void printOutAllCaps(){
        PEOPLE
                .forEach(p -> System.out.println(p.getName().toUpperCase()));
    }

    // Time for some practice: print out, in separate tests: lastName, age, Gender.
    @Test
    public void printOutLastName(){
        PEOPLE
                .forEach(p-> System.out.println(p.getLastName()));
    }
    @Test
    public void printAge(){
        PEOPLE
                .forEach(p-> System.out.println(p.getAge()));
    }
    @Test
    public void printGender(){
        PEOPLE
                .forEach(p-> System.out.println(p.getGender()));
    }
}
