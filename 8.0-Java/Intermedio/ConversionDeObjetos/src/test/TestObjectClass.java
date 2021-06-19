package test;

import domain.Worker;

public class TestObjectClass {

    public static void main(String[] args) {
        Worker worker1 = new Worker("Ivan", 7000);
        Worker worker2 = new Worker("Esteban", 12000);
        Worker worker3 = new Worker("Esteban", 12000);

        System.out.println(worker1.equals(worker2));
        System.out.println(worker2.equals(worker2));
        System.out.println(worker2.equals(worker3));
    }
}
