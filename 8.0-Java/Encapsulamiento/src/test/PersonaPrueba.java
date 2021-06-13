package test;
import dominio.Persona;

public class PersonaPrueba {

    public static void main(String[] args){
        Persona person1 = new Persona("Esteban", 4500.00, true);
        person1.setName("Elliot");
        System.out.println(person1.getName());
        System.out.println(person1);
    }
}
