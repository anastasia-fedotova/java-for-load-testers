package com.jet.app;


public class CalculatorApp {
    public static void main(String[] args) {
        //childCheckRun();
        calcAddInt();
        calcAdd();
        calcSub();
        calcDiv();
        calcMult();
        calcMod();

    }
    /*private static void childCheckRun(){
        Calculator.childCheck(-12,100);
    }
*/
    private static void calcAddInt(){
        System.out.println("Add = " + Calculator.add(Calculator.childCheck_a(-11),(Calculator.childCheck_b( 0))));
        Calculator.getSum();
    }

    private static void calcAdd(){
        System.out.println("AdD = " + Calculator.add(Calculator.childCheck_a(-11.3),(Calculator.childCheck_b( 0.9))));
        Calculator.getSum();
    }

    private static void calcSub(){
        System.out.println("Sub = " + Calculator.sub(Calculator.childCheck_a(-9),(Calculator.childCheck_b( 0))));
        Calculator.getSum();
    }
    private static void calcDiv(){
        System.out.println("Div = " + Calculator.div(Calculator.childCheck_a(-1),(Calculator.childCheck_b( 2))));
        Calculator.getSum();
    }
    private static void calcMult(){
        System.out.println("Mlt = " + Calculator.mult(Calculator.childCheck_a(-2),(Calculator.childCheck_b( 100))));
        Calculator.getSum();
    }
    private static void calcMod(){
        System.out.println("MOD = " + Calculator.mod(Calculator.childCheck_a(-2)));
    }

}
