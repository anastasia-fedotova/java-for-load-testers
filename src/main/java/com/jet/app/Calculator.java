package com.jet.app;

public class Calculator {
    private static int sum;

    public static int add(int a, int b) {
        return a + b;
    }

    public static int sub(int a, int b) {
        return a - b;
    }

    public static int div(int a, int b) {
        return a / b;
    }

    public static int mSumma(int a) {
        int msum = a + sum;
        sum = msum;
        return msum;
    }


}
