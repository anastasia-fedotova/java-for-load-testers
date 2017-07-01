package com.oop;

public class OoadCalculator {
    private CalculatorLogger log;

    //Dependency Injection: setter injection
    public void setLog(CalculatorLogger log) {
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
