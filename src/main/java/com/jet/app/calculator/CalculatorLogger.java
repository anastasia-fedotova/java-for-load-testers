package com.jet.app.calculator;

public interface CalculatorLogger {

    public void addToLog(String metod, double a, double b, double buf);
    public String[] getLog();
}


