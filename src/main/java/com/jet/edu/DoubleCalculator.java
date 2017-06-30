package com.jet.edu;

import sun.misc.resources.Messages_it;

import static com.jet.edu.DoubleCalculator.div;

public class DoubleCalculator {
    public static int add(int a, int b) {
        return a + b; //+ - / *
    }

    public static int div(int a, int b) {
        return a / b;
    }

    public static double div(double a, double b) {
        return a / b;
    }

    public static double div(int a, double b) {
        return a / b;
    }
}

class DoubleCalculatorRunner {
    public static void main(String[] args) {
        MyInt ref1 = new MyInt();
        MyInt ref2 = ref1;
        ref1.setMyInt(1);
        ref2.getMyInt();

        //region Arithmetic operators
        System.out.println(div(-1, 3.));
        System.out.println("1" + (1 + 1) + ("1" + "1"));

        int counter = 0;
        counter -= 1; //cou = cou - 1;
        System.out.println(counter++); // -1 -> 0
        System.out.println(++counter); // 0 -> 1
        //endregion

        int a, b, c;
        counter = a = b = c = 0;
        //region Logic operators
        System.out.println(1 != 1);

        MyInt obj1 = new MyInt();
        MyInt obj2 = new MyInt();
        obj1.setMyInt(1);
        obj2.setMyInt(1);
        System.out.println(obj1.equals(obj2)); //obj1 == obj2

        System.out.println(!(counter > 0) && (obj1 != obj2)); //& | !
        System.out.println(!f1() || f2()); //fopen("fff") or die();
        //endregion

        //region Ternary Op
        System.out.println(
            true ? "1" : "2"
        );
        //endregion

        System.out.println(2 >>> 1); //01, 10 =
    }

    public static boolean f1() {
        return true;
    }

    public static boolean f2() {
        //Side effect
        return false;
    }
}
