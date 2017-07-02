package com.oop;

import java.util.Date;

public class DecoratingStringBuilderCalculatorLog
        extends StringBuilderCalculatorLog {

    public DecoratingStringBuilderCalculatorLog() {
        super();
    }

    @Inject
    public DecoratingStringBuilderCalculatorLog(StringBuilder log) {
        super(log);
    }

    @Override
    @Deprecated
    @SuppressWarnings("unchecked")
    public void addToLog(String command) {
        super.addToLog("[PROD] " + command);
    }
}
