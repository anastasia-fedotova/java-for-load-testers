/**
 * Add to log
 * Get from log all strings
 */
package com.jet.app.calculator;

class LogHistory implements CalculatorLogger{

    private StringBuilder logString = new StringBuilder();

    public void addToLog(String metod, double a, double b, double buf) {
        logString.append(a)
                .append(" ")
                .append(metod)
                .append(" ")
                .append(b)
                .append(" = ")
                .append(buf)
                .append("\n");
    }

    public String[] getLog() {
        return logString.toString().split("\n");
    }
}
