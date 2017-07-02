package com.oop;


import java.io.IOException;

public class DecoratingStringBuilderCalculatorLog
        extends StringBuilderCalculatorLog {

    public DecoratingStringBuilderCalculatorLog() {
        super();
    }

    public DecoratingStringBuilderCalculatorLog(StringBuilder log) {
        super(log);
        if (log == null) throw new IllegalArgumentException("log is null");
    }

    @Override
    @Deprecated
    @SuppressWarnings("unchecked")
    public void addToLog(String command) {
        super.addToLog("[PROD] " + command);
    }
}
