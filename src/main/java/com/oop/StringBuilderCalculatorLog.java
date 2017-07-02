package com.oop;

public class StringBuilderCalculatorLog implements CalculatorLog {
    private StringBuilder log;

    public StringBuilderCalculatorLog() {
        this.log = new StringBuilder();
    }

    public StringBuilderCalculatorLog(StringBuilder log) {
        this.log = log;
    }

    @Override
    public String[] getLog() {
        return log.toString().split("\n");
    }

    @Override
    public void addToLog(String command) {
        log.append(command);
        log.append("\n");
    }

    public void m() {}
}
