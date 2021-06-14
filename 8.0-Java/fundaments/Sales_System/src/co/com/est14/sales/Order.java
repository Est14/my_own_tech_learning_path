package co.com.est14.sales;

public class Order {

    private int idOrder;
    private Product listProducts[];
    private static int orderCounter;
    private int productsCounter;
    private final static int ORDER_SIZE = 10;

    public Order(){
        this.idOrder = ++Order.orderCounter;
        this.listProducts = new Product[Order.ORDER_SIZE];
    }

    public void addProduct(String name, double price){

        if (this.productsCounter < Order.ORDER_SIZE){
            this.listProducts[this.productsCounter++] = new Product(name, price);
        }
        else{
            System.out.println("Your order list is full");
        }
    }

    public String calculateTotal(){
        double sum = 0;

        for (int i = 0; i < this.listProducts.length; i++) {
            if (this.listProducts[i] != null){
                sum += this.listProducts[i].getPrice();
            }else{
                continue;
            }
        }
        return "$" + sum;
    }

    public void showOrder(){

        System.out.println("WELCOME TO SALE SYSTEM");
        System.out.println("Id order: " + this.idOrder);
        System.out.println("Products' Order: ");
        for (int i = 0; i < this.productsCounter; i++) {
                System.out.println(this.listProducts[i].getName() + "....." +
                        " $" + this.listProducts[i].getPrice() + '\n');

        }
        System.out.println("Total ...........  " + this.calculateTotal());
    }
}
