package com.oop;

public class CalculatorRunner {
    public static void main(String[] args) {
        Calculator calc1 = new Calculator(
                new DecoratingStringBuilderCalculatorLog(
                    new StringBuilder("TEST ENV\n")
                )
        );

        calc1.add(1, 1);
        calc1.add(2, 2);

        for (String logEntry : calc1.getLog()) {
            System.out.println(logEntry);
        }
    }
}
