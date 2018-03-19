
package com.company;

public class Calculator {

    private double firstNumber;
    private double secondNumber;
    private String operation;

    public Calculator(double firstNumber, String operation, double secondNumber) {

        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.operation = operation;
    }

    public double calculateResult() {
        double result = 0;

        if ("+".equals(operation)) {
            result = firstNumber + secondNumber;
        }
        else if ("-".equals(operation)) {
            result = firstNumber - secondNumber;
        }
        else if ("*".equals(operation)) {
            result = firstNumber * secondNumber;
        }
        else if ("/".equals(operation)) {
            result = firstNumber / secondNumber;
        }
        else {
            throw new RuntimeException("Operation not implemented");
        }

        return result;
    }
}