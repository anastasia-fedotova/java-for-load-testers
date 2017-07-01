package com.oop;

public class OoadCalculator {
    //Abstract Factory
    private CalculatorLogger log = CalcLoggerFactoryFactory.createFactory().createLogger();

    public int add(int a, int b) {
        log.addToLog(a + " add " + b);
        return a + b;
    }

    public String[] getLog() {
        return log.getLog();
    }
}
