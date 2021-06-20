package test;

import domain.Person;

public class TestForEach {

    public static void main(String[] args) {

        int ages[] = {5, 6 ,7, 8, 18 ,20};
        Person people[] = {new Person("Esteban"), new Person("Miguel"), new Person("Dani")};

        for (int age:ages) {
            System.out.println(age);
        }

        for(Person person: people){
            System.out.println(person.getName());
        }
    }
}
