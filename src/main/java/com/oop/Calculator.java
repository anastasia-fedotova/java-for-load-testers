package com.oop;

public class Calculator {
    private CalculatorHistory log;

    //Dependency Injection: setter injection
    public void setLog(CalculatorHistory log) {
        this.log = log;
    }


    public int add(int a, int b) {
        log.addToLog(a + " add " + b);
        return a + b;
    }

    public String[] getLog() {
        return log.getLog();
    }
}
