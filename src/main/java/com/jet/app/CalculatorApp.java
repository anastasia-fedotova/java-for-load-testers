package com.jet.app;


public class CalculatorApp {
    public static void main(String[] args) {

        System.out.println(Calculator.add(2, 3));
        System.out.println(Calculator.sub(2, 1));
        System.out.println(Calculator.mSumma(2));
        System.out.println(Calculator.mSumma(2));
        System.out.println(Calculator.mSumma(Calculator.add(2, 3)));
        System.out.println(Calculator.mSumma(Calculator.sub(2, 1)));
        System.out.println(Calculator.div(4, 2));
        System.out.println(Calculator.mSumma(Calculator.add(3, 7)));


    }

}
