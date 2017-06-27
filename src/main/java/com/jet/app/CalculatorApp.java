package com.jet.app;


public class CalculatorApp {
    public static void main(String[] args) {
        calcAdd();
        calcSub();
        calcDiv();
        calcMult();

        //System.out.println(Calculator.add(-1, 0));
        //System.out.println(Calculator.sub(2, 1));
        //System.out.println(Calculator.mSumma(2));
        //System.out.println(Calculator.mSumma(2));
        //System.out.println(Calculator.mSumma(Calculator.add(2, 3)));
        //System.out.println(Calculator.mSumma(Calculator.sub(2, 1)));
        //System.out.println(Calculator.div(4, 2));
        //System.out.println(Calculator.mSumma(Calculator.add(3, 7)));


    }

    private static void calcAdd() {
        System.out.println(Calculator.add(-1, 0));
        Calculator.getSum();
        //System.out.println(Calculator.sum);
    }

    private static void calcSub() {
        System.out.println(Calculator.sub(2, 2));
        Calculator.getSum();
        //System.out.println(Calculator.sum);

    }
    public static void calcDiv(){
        System.out.println(Calculator.div(6, 3));
        Calculator.getSum();
        //System.out.println(Calculator.sum);
    }
    public static void calcMult(){
        System.out.println(Calculator.mult(5, 7));
        Calculator.getSum();
        //System.out.println(Calculator.sum);
    }
}
