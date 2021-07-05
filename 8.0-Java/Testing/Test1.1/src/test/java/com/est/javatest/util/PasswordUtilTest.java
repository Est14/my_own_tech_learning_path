package com.est.javatest.util;

import com.est.javatest.util.PasswordUtil.SecurityLevel;
import org.junit.Test;

import static com.est.javatest.util.PasswordUtil.SecurityLevel.*;
import static org.junit.Assert.*;

public class PasswordUtilTest {
    @Test
    public void weak_when_has_less_than_8_letters() {
        assertEquals(WEAK, PasswordUtil.assessPassword("12345"));
    }

    @Test
    public void weak_when_has_just_letters() {
        assertEquals(WEAK, PasswordUtil.assessPassword("sdfggrrgfd"));
    }

    @Test
    public void medium_when_has__letters_and_numbers() {
        assertEquals(MEDIUM, PasswordUtil.assessPassword("sss7845tyur"));
    }

    @Test
    public void strong_when_has__letters_and_numbers() {
        assertEquals(STRONG, PasswordUtil.assessPassword("sss7845tyur%&"));
    }
}