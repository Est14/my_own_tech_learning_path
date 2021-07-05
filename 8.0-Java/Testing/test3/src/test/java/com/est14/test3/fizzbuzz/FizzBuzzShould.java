package com.est14.test3.fizzbuzz;

import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzShould {

    @Test
    public void return_Fizz() {
        FizzBuzz fb = new FizzBuzz();
        String result = fb.result(3);
        assertEquals("Fizz", result);
    }

    @Test
    public void return_Buzz() {
        FizzBuzz fb = new FizzBuzz();
        String result = fb.result(5);
        assertEquals("Buzz", result);
    }

    @Test
    public void return_FizzBuzz() {
        FizzBuzz fb = new FizzBuzz();
        String result = fb.result(30);
        assertEquals("FizzBuzz", result);
    }

    @Test
    public void return_the_num_when_is_not_divisible_by_3_or_5() {
        FizzBuzz fb = new FizzBuzz();
        String result = fb.result(7);
        assertEquals("7", result);
    }

}