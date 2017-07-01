/**
 * реализация методов сложения, вычитания, деления, умножения калькулятора
 * проверка на входящее значение от -10 до 10, модуль числа, проверка деления на 0
 */
package com.jet.app.Calculator;

class Calculation {
    private double mButton = 0;
    private double storeCalculation = 0;
    private LogMessages log = new LogMessages();

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
        mButton = a + b;
        return a + b;
    }

    private double sub(double a, double b) {
        a = checkRange(a);
        b = checkRange(b);
        mButton = a - b;
        return a - b;
    }

    private double mul(double a, double b) {
        a = checkRange(a);
        b = checkRange(b);
        mButton = a * b;
        return a * b;
    }

    private double div(double a, double b) {
        a = checkRange(a);
        b = checkRange(b);
        b = checkZeroDiv(b);
        mButton = a / b;
        return a / b;
    }

    private double abs(double module) {
        if (module < 0) {
            return -module;
        }
        return module;
    }

    public double doCalculate(String command, double arg1, double arg2) {

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

    void addToLog(String metod, double a, double b, double buf) {
        log.addToLog(metod, a, b, buf);
    }

    public StringBuilder showLog() {
        return log.getAllLogMessages();
    }

    void setmButton() {
        storeCalculation = mButton;
    }

    double getmButton() {
        return storeCalculation;
    }

    void mPlusbutton() {
        storeCalculation = mButton + storeCalculation;
    }
}
