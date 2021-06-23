package test;

import data.DAOPerson;
import domain.Person;
import org.w3c.dom.ls.LSOutput;

public class TestHandlePeople {

    public static void main(String[] args) {
        DAOPerson person = new DAOPerson();


       // Insert  data
        //Person person2 = new Person("Nico", "Velandia", "nico@gmail.com", "3225689704");
        //var record = person.insert(person2);



        // Print data
        var people = person.select();
        people.forEach(p -> {
            System.out.println(p);
        });

        System.out.println();

        // Update data
        Person person3 = new Person("Miguel", "Otalora", "migue@gmail.com", "3003382365");
        person.update(person3, 3);
        Person person4 = new Person("Santiago", "Velandia", "santi@gmail.com", "3223382378");
        person.update(person4, 2);

        //Delete
        //Person person5 = new Person(11);
        //person.delete(person5);


    }
}
