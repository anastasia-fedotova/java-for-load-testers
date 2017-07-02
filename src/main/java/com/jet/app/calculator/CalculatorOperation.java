/**
 * Add Sub Mul Div
 * Module number
 * Range from -10 to 10
 * Check div by 0
 * Memory Button
 */
package com.jet.app.calculator;

import static java.lang.Double.parseDouble;

class CalculatorOperation {
    private double memoryButton = 0;
    private double storeCalculation = 0;
    private CalculatorLogger log = new StringBuilderCalculatorLogger();

    private double checkRange(double a) {
        if ((a > -10.0) & (a < 10.0)) {
            return a;
        } else {
            System.out.println("Параметр выходит за границу, значение присвоено 9.0");
            return 10.0;
        }
    }

    private double checkZeroDiv(double a) {
        if (a == 0) {
            System.out.println("Деление на 0 невозможно > a = infinity");
            return Double.POSITIVE_INFINITY;
        }
        return a;
    }

    private double add(double a, double b) {
        a = checkRange(a);
        b = checkRange(b);
        memoryButton = a + b;
        return a + b;
    }

    private double sub(double a, double b) {
        a = checkRange(a);
        b = checkRange(b);
        memoryButton = a - b;
        return a - b;
    }

    private double mul(double a, double b) {
        a = checkRange(a);
        b = checkRange(b);
        memoryButton = a * b;
        return a * b;
    }

    private double div(double a, double b) {
        a = checkRange(a);
        b = checkRange(b);
        b = checkZeroDiv(b);
        memoryButton = a / b;
        return a / b;
    }

    private double abs(double module) {
        if (module < 0) {
            return -module;
        }
        return module;
    }

    private double doCalculate(String command, double arg1, double arg2) {

        switch (command) {
            case "add":
                return add(arg1, arg2);
            case "sub":
                return sub(arg1, arg2);
            case "mul":
                return mul(arg1, arg2);
            case "div":
                return div(arg1, arg2);
        }
        return 0;
    }

    private void addToLog(String metod, double a, double b, double buf) {
        log.addToLog(metod, a, b, buf);
    }

    String[] showLog() {
        return log.getLog();
    }

    void setMemoryButton() {
        storeCalculation = memoryButton;
    }

    double getMemoryButton() {
        return storeCalculation;
    }

    void memoryPlusButton() {
        storeCalculation = memoryButton + storeCalculation;
    }

    void operation(CalculatorOperation calc, String command, String arg1, String arg2) {
        double buffer;

        buffer = calc.doCalculate(
                command,
                parseDouble(arg1),
                parseDouble(arg2));

        calc.addToLog(
                command,
                parseDouble(arg1),
                parseDouble(arg2),
                buffer);
    }

    void setLog(CalculatorLogger log){
        this.log = log;
    }
}
