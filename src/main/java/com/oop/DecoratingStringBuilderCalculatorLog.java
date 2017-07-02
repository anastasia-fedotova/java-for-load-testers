package com.oop;

public class DecoratingStringBuilderCalculatorLog
        extends StringBuilderCalculatorLog {

    public DecoratingStringBuilderCalculatorLog() {
        super();
    }

    public DecoratingStringBuilderCalculatorLog(StringBuilder log) {
        super(log);
    }

    @Override
    public void addToLog(String command) {
        super.addToLog("[PROD] " + command);
    }
}
