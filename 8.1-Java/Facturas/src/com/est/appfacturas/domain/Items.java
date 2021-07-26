package com.est.appfacturas.domain;

public class Items {

    private int amount;
    private Producto producto;


    public Items(int amount, Producto producto) {
        this.amount = amount;
        this.producto = producto;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public float calculateTast(){

        return (float) (this.amount * this.producto.getPrice());
    }
}
