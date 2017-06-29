package com.jet.app;

public class Calculator {
    static double sum;



    public static void getSum() {
        System.out.println("MEM = "+sum);
    }

    public static int add(int a, int b) {
        memory(a + b);
        return a + b;
    }

    public static double add(double a, double b) {
        memory(a + b);
        return a + b;
    }

    public static double sub(double a, double b) {
        memory(a - b);
        return a - b;
    }

    public static double div(double a, double b) {
        memory(a / b);
        return a / b;
    }

    public static double mult(double a, double b) {
        memory(a * b);
        return a * b;
    }

    public static double memory(double c) {
        double msum = c + sum;
        sum = msum;
        return msum;
        //System.out.println(sum);
    }
    /*
    public static double parseInt(int a,int b){
        double d_a = Double.parseDouble("a");
        double d_b = Double.parseDouble("b");
        return d_a;
        return d_b;
    }
*/


    public static double childCheck_a(double a){

        if (a > 10) {
            a = 10;}
        if (a < -10){
            a = -10;}
        return a;
    }

    public static double childCheck_b(double b){
        if (b > 10) {
            b = 10;}
          if (b < -10){
            b = -10;}
        return b;
    }

    public static double mod(double a){
      return a = a * -1;
    }


    }



