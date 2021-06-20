package testPcword;

import co.com.est14.pcword.*;

public class PcWorld {

    public static void main(String[] args) {

        Mouse mouse = new Mouse("Bluetooth", "Lenovo");
        Keyboard keyboard = new Keyboard("Bluetooth", "Lenovo");
        Monitor monitor = new Monitor("Samsung", 15.0);
        Computer computer1 = new Computer("Dell Latitude", monitor, keyboard, mouse);
        Computer computer2 = new Computer("Dell Latitude", monitor, keyboard, mouse);
        Computer computer3 = new Computer("Dell Latitude", monitor, keyboard, mouse);

        Order firstOrder = new Order();
        firstOrder.addComputer(computer1);
        firstOrder.addComputer(computer3);
        firstOrder.addComputer(computer2);
        firstOrder.addComputer(computer2);
        firstOrder.addComputer(computer3);
        firstOrder.addComputer(computer1);

        firstOrder.showOrder();
    }
}
