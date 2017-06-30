/**
 * реализация функций калькулятора
 */

package com.jet.app.Calculator;

class Calculation {
    private static double mButton = 0;
    private static double storeCalculation = 0;

    private static double checkRange(double a) {
        if ((a > -10.0) & (a < 10.0)) {
            return a;
        } else {
            System.out.println("Параметр выходит за границу, значение присвоено 10.0");
            return 10.0;
        }
    }

    private static double checkZeroDiv(double a) {
        if (a == 0) {
            System.out.println("Деление на 0 невозможно > a = infinity");
            return Double.POSITIVE_INFINITY;
        }
        return a;
    }

    static double add(double a, double b) {
        a = checkRange(a);
        b = checkRange(b);
        mButton = a + b;
        System.out.println("Сумма: " + mButton);
        return a + b;
    }

    static double sub(double a, double b) {
        a = checkRange(a);
        b = checkRange(b);
        mButton = a - b;
        System.out.println("Вычитание: " + mButton);
        return a - b;
    }

    static double mul(double a, double b) {
        a = checkRange(a);
        b = checkRange(b);
        mButton = a * b;
        System.out.println("Умножение: " + mButton);
        return a * b;
    }

    static double div(double a, double b) {
        a = checkRange(a);
        b = checkRange(b);
        b = checkZeroDiv(b);
        mButton = a / b;
        System.out.println("Деление: " + mButton);
        return a / b;
    }

    static double abs(double module) {
        if (module < 0) {
            return -module;
        }
        return module;
    }

    static void setmButton() {
        storeCalculation = mButton;
    }

    static double getmButton() {
        return storeCalculation;
    }

    static void mPlusbutton() {
        storeCalculation = mButton + storeCalculation;
    }
}
