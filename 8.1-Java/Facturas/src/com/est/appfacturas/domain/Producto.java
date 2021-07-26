package com.est.appfacturas.domain;

import javax.print.DocFlavor;

public class Producto {
    private int cod;
    private String name;
    private double price;



    public int getCod() {
        return cod;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
