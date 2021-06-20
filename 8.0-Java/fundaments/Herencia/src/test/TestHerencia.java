package test;

import domain.Client;
import domain.Worker;

import java.util.Date;

public class TestHerencia {

    public static void main(String[] args) {

        Worker worker1 = new Worker("Esteban", 7000);
        System.out.println(worker1);

        Client client1 = new Client("Esteban", 'M',
                30, "La Esperanza", new Date(), true);

        System.out.println(client1);
    }


}
