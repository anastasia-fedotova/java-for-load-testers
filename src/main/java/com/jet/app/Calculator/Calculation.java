package com.jet.app.Calculator;

class Calculation {

    private static int mButton = 0;
    private static int storeCalculation = 0;

    static int add(int a, int b) {
        mButton = a + b;
        return a + b;
    }

    static int sub(int a, int b) {
        mButton = a - b;
        return a - b;
    }

    static int mult(int a, int b) {
        mButton = a * b;
        return a * b;
    }

    static int div(int a, int b) {
        mButton = a / b;
        return a / b;
    }

    static void setmButton() {
        storeCalculation = mButton;
    }

    static int getmButton() {
        return storeCalculation;
    }

    static void mPlusbutton() {
        storeCalculation = mButton + storeCalculation;
    }
}
