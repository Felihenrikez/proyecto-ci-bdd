package com.empresa.app;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    private Calculator calculator;
    
    @BeforeEach
    public void setUp() {
        calculator = new Calculator();
    }
    
    // Addition tests
    @Test
    public void testAddPositiveNumbers() {
        assertEquals(5, calculator.add(2, 3));
    }
    
    @Test
    public void testAddNegativeNumbers() {
        assertEquals(-5, calculator.add(-2, -3));
    }
    
    @Test
    public void testAddZero() {
        assertEquals(5, calculator.add(5, 0));
        assertEquals(5, calculator.add(0, 5));
    }
    
    @Test
    public void testAddMixedNumbers() {
        assertEquals(2, calculator.add(5, -3));
    }
    
    // Subtraction tests
    @Test
    public void testSubtractPositiveNumbers() {
        assertEquals(1, calculator.subtract(3, 2));
    }
    
    @Test
    public void testSubtractNegativeNumbers() {
        assertEquals(1, calculator.subtract(-2, -3));
    }
    
    @Test
    public void testSubtractZero() {
        assertEquals(5, calculator.subtract(5, 0));
    }
    
    @Test
    public void testSubtractFromZero() {
        assertEquals(-5, calculator.subtract(0, 5));
    }
    
    // Multiplication tests
    @Test
    public void testMultiplyPositiveNumbers() {
        assertEquals(6, calculator.multiply(2, 3));
    }
    
    @Test
    public void testMultiplyNegativeNumbers() {
        assertEquals(6, calculator.multiply(-2, -3));
    }
    
    @Test
    public void testMultiplyByZero() {
        assertEquals(0, calculator.multiply(5, 0));
        assertEquals(0, calculator.multiply(0, 5));
    }
    
    @Test
    public void testMultiplyByOne() {
        assertEquals(5, calculator.multiply(5, 1));
        assertEquals(5, calculator.multiply(1, 5));
    }
    
    @Test
    public void testMultiplyMixedNumbers() {
        assertEquals(-6, calculator.multiply(2, -3));
    }
    
    // Division tests
    @Test
    public void testDividePositiveNumbers() {
        assertEquals(2, calculator.divide(6, 3));
    }
    
    @Test
    public void testDivideNegativeNumbers() {
        assertEquals(2, calculator.divide(-6, -3));
    }
    
    @Test
    public void testDivideMixedNumbers() {
        assertEquals(-2, calculator.divide(6, -3));
    }
    
    @Test
    public void testDivideByOne() {
        assertEquals(5, calculator.divide(5, 1));
    }
    
    @Test
    public void testDivideZero() {
        assertEquals(0, calculator.divide(0, 5));
    }
    
    @Test
    public void testDivideByZero() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            calculator.divide(5, 0);
        });
        assertEquals("Cannot divide by zero", exception.getMessage());
    }
}