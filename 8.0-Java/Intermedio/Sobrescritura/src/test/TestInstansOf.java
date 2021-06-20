package test;

import domain.Manager;
import domain.Worker;

import java.util.Arrays;

public class TestInstansOf {

    public static void main(String[] args) {

        Worker manager = new Manager("Esteban", 7000.50, "IT");
        Worker trainer = new Worker("Miguel", 5000.50);
        determinateType(manager);
        determinateType(trainer);

    }

    private static void determinateType(Worker worker) {
        if (worker instanceof Manager) {
            System.out.println("Is instance of Manager");
        }
        else if (worker instanceof Worker){
            System.out.println("Is instance of Worker ");
        }
        else {
            System.out.println("I don't know");
        }

    }
}
