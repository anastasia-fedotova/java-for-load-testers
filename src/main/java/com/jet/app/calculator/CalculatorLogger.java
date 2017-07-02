package com.jet.app.calculator;

public interface CalculatorLogger {
    void addToLog(String metod, double a, double b, double buf);
    String[] getLog();
}


