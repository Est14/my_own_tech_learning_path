package test;

import domain.Person;

public class Arrays {

    public static void main(String[] args) {

        // Primitive array
        int ages[] = new int[3];
        ages[0] = 25;
        ages[2] = 30;

        for (int i = 0; i < ages.length ; i++) {
            System.out.println(ages[i]);
        }

        // Array of object type - person
        Person persons[] = new Person[2];

        persons[0] = new Person("Esteban");
        persons[1] = new Person("Andrea");

        for (int i = 0; i < persons.length; i++) {
            System.out.println(persons[i].getName());
        }
    }
}
