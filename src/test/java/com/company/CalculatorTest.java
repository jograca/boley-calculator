package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void givenTwoNumbersOneAndTwo_whenCalculate_thenReturnResultThree() {
        Calculator calculator = new Calculator(1.0, "+", 2.0);
        double result = calculator.calculateResult();
        assertEquals(3, result, 0);
    }

    @Test
    public void givenTwoNumbersFiveAndFive_whenCalculate_thenReturnResultTwentyFive() {
        Calculator calculator = new Calculator(5.0, "*", 5.0);
        double result = calculator.calculateResult();
        assertEquals(25, result, 0);
    }

    @Test
    public void givenDivideByZero_whenCalculate_returnPositiveInfinity() {
        Calculator calculator = new Calculator(2.0, "/", 0.0);
        double result = calculator.calculateResult();
        assertEquals(Double.POSITIVE_INFINITY, result, 0);
    }

    @Test
    public void givenSecondNumberLargerThanFirst_whenCalculate_returnNegativeNumber() {
        Calculator calculator = new Calculator(5.0, "-", 6.0);
        double result = calculator.calculateResult();
        assertEquals(-1, result, 0);
    }
}