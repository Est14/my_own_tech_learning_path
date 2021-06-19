package test;

import domain.Manager;
import domain.Worker;

public class TestOverride {

    public static void main(String[] args) {

        Worker manager = new Manager("Esteban", 7000.50, "IT");
        Worker trainer = new Worker("Miguel", 5000.50);
        print(manager);
        print(trainer);
    }
    private static void print(Worker worker){
            System.out.println(worker.getDetails());
    }
}
