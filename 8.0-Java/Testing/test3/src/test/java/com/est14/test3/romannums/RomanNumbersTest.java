package com.est14.test3.romannums;

import org.junit.Test;

import static org.junit.Assert.*;

public class RomanNumbersTest {

    @Test
    public void arabic_to_romans_numbers() {
        RomanNumbers number = new RomanNumbers();
        String result = number.toRomanNumber(2);
        assertEquals("II", result);
    }
}