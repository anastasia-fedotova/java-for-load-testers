package com.oop;

public class LimitedArrayCalculatorLogger implements CalculatorLogger {
    private String[] log = new String[10_000];
    private int currentIndex = 0;

    public void addToLog(String command) {
        log[currentIndex++] = command;
    }

    public String[] getLog() {
        return log;
    }
}
