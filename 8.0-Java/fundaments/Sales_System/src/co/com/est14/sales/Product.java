package co.com.est14.sales;

public class Product {

    private final int idProduct;
    private String name;
    private double price;
    private static int productCounter;

    private Product(){
        this.idProduct = ++Product.productCounter;
    }

    public Product(String name, double price){
        this();
        this.price = price;
        this.name = name;
    }


    public int getIdProduct() {
        return this.idProduct;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static int getProductCounter() {
        return productCounter;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Product{");
        sb.append("idProduct=").append(idProduct);
        sb.append(", name='").append(name).append('\'');
        sb.append(", price=").append(price);
        sb.append('}');
        return sb.toString();
    }
}
