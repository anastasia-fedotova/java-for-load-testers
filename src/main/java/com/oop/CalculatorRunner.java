package com.oop;

public class CalculatorRunner {
    public static void main(String[] args) {
        Calculator calc1 = new Calculator();
        calc1.setLog(new StringBuilderCalculatorHistory()); //DI

        Calculator calc2 = new Calculator();
        calc2.setLog(new CalculatorHistoryStub()); //DI

        calc1.add(1, 1);
        calc1.add(2, 2);

        calc2.add(3, 3);
        calc2.add(4, 4);

        for (String logEntry : calc1.getLog()) {
            System.out.println(logEntry);
        }
        for (String logEntry : calc2.getLog()) {
            System.out.println(logEntry);
        }
    }
}
