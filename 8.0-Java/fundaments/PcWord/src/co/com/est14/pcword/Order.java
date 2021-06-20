package co.com.est14.pcword;

public class Order {

    private final int idOrder;
    Computer computers[];
    private static int orderCounter;
    private int computersCounter;
    private final static int COMPUTERS_MAX = 5;

    public Order() {
        this.idOrder = ++Order.orderCounter;
        this.computers = new Computer[COMPUTERS_MAX];
    }

    public void addComputer(Computer computer){
        if (computers.length > this.computersCounter){
            computers[this.computersCounter++] = computer;
        }else{
            System.out.println("Your order is full " + computersCounter + " in list");
        }

    }

    public void showOrder(){
        System.out.println("Order No " + this.idOrder);
        System.out.println("Computers in Order No " + this.idOrder);
        for (int i = 0; i < this.computersCounter; i++) {
            System.out.println("item: " + (i+1) +
                    " " + computers[i].toString()
                    );
        }
    }

}
