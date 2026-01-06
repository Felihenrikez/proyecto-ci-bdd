package com.empresa.app;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void shouldSumTwoNumbers() {
        Calculator calc = new Calculator();
        assertEquals(5, calc.sum(2, 3));
    }

    @Test
    void shouldSubtractTwoNumbers() {
        Calculator calc = new Calculator();
        assertEquals(1, calc.subtract(3, 2));
    }
}