package com.jet.app;

public class Calculator {
    static int sum;
    public static void getSum() {
        System.out.println(sum);
    }
    public static int add(int a, int b) {
        mSumma(a + b);
        return a + b;
    }

    public static int sub(int a, int b) {
        mSumma(a - b);
        return a - b;
    }

    public static int div(int a, int b) {
        mSumma(a / b);
        return a / b;
    }

    public static int mult(int a, int b){
        mSumma(a * b);
        return a * b;
    }

    public static int mSumma(int c) {
        int msum = c + sum;
        sum = msum;
        return msum;
        //System.out.println(sum);

    }


}
