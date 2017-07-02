package com.oop;

public class Calculator {
    private CalculatorLog log;

    //DI: constructor injection
    public Calculator(CalculatorLog log) {
        this.log = log;
    }

    public int add(int a, int b) throws Exception {
        log.addToLog(a + " add " + b);
        return a + b;
    }

    public String[] getLog() {
        return log.getLog();
    }

    public int div(int a, int b) throws Exception {
        log.addToLog(a + " div " + b);
        return a / b;
    }
}
