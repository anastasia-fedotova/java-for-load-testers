package com.oop;

public class CalculatorRunner {
    public static void main(String[] args) {
        Calculator calculator = new Calculator(
            new DecoratingStringBuilderCalculatorLog(
                new StringBuilder("TEST ENV\n")
            )
        );


        /**
         * 1. DecoratingStringBuilderCalculatorLog
         * 2. DI for StringBuilder
         */

        calculator.add(1, 1);
        calculator.add(2, 2);

        for (String logEntry : calculator.getLog()) {
            System.out.println(logEntry);
        }
    }
}
