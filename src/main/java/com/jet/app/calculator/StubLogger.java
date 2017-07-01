package com.jet.app.calculator;

public class StubLogger implements CalculatorLogger{
    @Override
    public void addToLog(String metod, double a, double b, double buf) {
        System.out.println("передали параметры:" + "\n" + a + " " + metod + " " + b + " результат " + buf);
    }

    @Override
    public String[] getLog() {
        return new String[] {"Log","exist"};
    }
}
