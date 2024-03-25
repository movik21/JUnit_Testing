package com.example.meinedemo.demo;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class MathLibTests {

    @Test
    void testIsEven1() {
        assertTrue(MathLib.isEven(2));
    }
    @Test
    void testIsEven2() {
        assertFalse(MathLib.isEven(3));
    }
}

