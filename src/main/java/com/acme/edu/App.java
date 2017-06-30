package com.acme.edu;

public class App {
    public static void main( String[] args ) {
        System.out.println(div(0, 2));
    }

    public static int div(int a, int b) { // ищем и возвращаем частное переменных
        if (b == 0) {
            return 0;
        } else if (b < 0) {
            System.out.println("");
        } else {
            System.out.println("");
        }

        switch (b) { //byte, short, int, char, String, enum
            case 0 : {
                System.out.println("0");
            } break;
            case 1 : System.out.println("1"); break;
            case -1 : System.out.println("-1"); break;
            default : System.out.println("other");
        }

//        System.out.println("aaaa");
//        System.out.println("bbbbb");

        return a / b; //int: ArithmeticException; Double.POSITIVE_INFINITY | Double.NaN
    }



}
