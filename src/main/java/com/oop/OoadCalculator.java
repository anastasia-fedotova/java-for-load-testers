package com.oop;

public class OoadCalculator {
    private CalculatorLogger log = CalculatorLoggerFactory.create(); //Factory Method

    public int add(int a, int b) {
        log.addToLog(a + " add " + b);
        return a + b;
    }

    public String[] getLog() {
        return log.getLog();
    }
}
