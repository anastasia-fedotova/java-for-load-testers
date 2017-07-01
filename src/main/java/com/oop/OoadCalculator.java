package com.oop;

public class OoadCalculator {
    private int id = 1;
    private CalculatorLog log = new CalculatorLog();

    public void setId(int idToSet) {
        id = idToSet;
    }

    public int getId() {
        return id;
    }

    public int add(int a, int b) {
        log.addToLog(a + " add " + b);
        return a + b;
    }


    public String[] getLog() {
        return log.getLog();
    }
}
