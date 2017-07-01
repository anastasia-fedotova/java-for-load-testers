package com.oop;

public class OoadCalculator {
    //Creator
    private CalculatorLogger log = new StringBuilderCalculatorLogger();

    public int add(int a, int b) {
        log.addToLog(a + " add " + b);
        return a + b;
    }

    public String[] getLog() {
        return log.getLog();
    }
}
