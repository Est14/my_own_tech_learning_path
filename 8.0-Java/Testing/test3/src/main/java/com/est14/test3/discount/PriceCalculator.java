package com.est14.test3.discount;

import java.util.ArrayList;
import java.util.List;

public class PriceCalculator {
    List<Double> acount;
    private double disc;

    PriceCalculator() {
        acount = new ArrayList<Double>();
    }


    public double getTotal() {
        Double total = 0.0;
        for (Double x : this.acount) {
            total += x;
        }
        return total * ((100 - this.disc) / 100);
    }

    public void addPrice(double i) {
        this.acount.add(i);
    }

    public void discount(double i) {
        this.disc = i;
    }

    public void print() {

    }
}
