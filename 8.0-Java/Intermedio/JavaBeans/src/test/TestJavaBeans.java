package test;

import domain.Person;

public class TestJavaBeans {

    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Esteban");
        person.setLastName("Martinez");

        System.out.println(person);
    }
}
