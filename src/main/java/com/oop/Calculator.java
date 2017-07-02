package com.oop;

public class Calculator {
    private CalculatorLog log;

    //DI: constructor injection
    public Calculator(CalculatorLog log) {
        this.log = log;
    }

    public int add(int a, int b) {
        try {
           throw new NullPointerException("ddd");
        } catch (NullPointerException e) {
            throw new IllegalArgumentException("Calclutator was born with null", e);
        }
//        return a + b;
    }

    public String[] getLog() {
        return log.getLog();
    }

    public int div(int a, int b) {
        try {
            log.addToLog(a + " div " + b);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return a / b;
    }
}
