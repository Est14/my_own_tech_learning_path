package com.est14.test3.discount;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class PriceCalculatorShould {

    @Test
    public void return_zero_when_dont_exist_price() {
        PriceCalculator calculator = new PriceCalculator();
        assertThat(calculator.getTotal(), is(0.0));
    }

    @Test
    public void total_is_the_sum_of_prices() {
        PriceCalculator calculator = new PriceCalculator();
        calculator.addPrice(10.5);
        calculator.addPrice(30.6);
        assertEquals(41.5, calculator.getTotal(), 0.50);
    }

    @Test
    public void apply_discount_to_prices() {
        PriceCalculator calculator = new PriceCalculator();
        calculator.addPrice(10.5);
        calculator.addPrice(30.6);
        calculator.discount(10);
        assertEquals(36.99, calculator.getTotal(), 0.50);
    }
}