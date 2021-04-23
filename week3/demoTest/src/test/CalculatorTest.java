package test;

import Calculator.Calculator;

import static org.junit.Assert.*;

public class CalculatorTest {

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void add() {
        int result = 10;
        Calculator calculator = new Calculator();
        int actualResult = calculator.add(5, 5);
        assertEquals(result, actualResult);
    }
}
