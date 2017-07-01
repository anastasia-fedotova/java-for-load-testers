package com.acme.edu;

public class ArraysDemo {
    public static void main(String... args) {
        Integer variable = new Integer(5); //boxing
        variable.intValue(); //unboxing
        Integer.parseInt("45");

        Integer i = 5; //auto boxing
        int ii = i; //auto unboxing

        Integer i1 = 127; //+intern
        Integer i2 = 127;
        System.out.println(i1 == i2); //NNNOOOOOOOOO!!!!!! WTF?????

        /*

        1. java -cp .jar CalculatorRunner add 1 1. div 3.0 0
        2. log() - prints:
         5 add   5 = ?
         3 div 0 = ?
         ...
        3*. String[] <- log()

         */
    }
}

class Calculator {
    private static StringBuilder log = new StringBuilder();

    public static int add(int a, int b) {
        log
            .append(a)
            .append(" add ")
            .append(b)
            .append(" = ")
            .append(a + b)
            .append("\n");

        return a + b;
    }

    public static String[] getLog() {
        return log.toString().split("\n");
    }
}

class CalculatorRunner {
    public static void main(String... args) {
        for (String arg : args) {
        }

    }
}
