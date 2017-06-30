package com.acme.edu;

import static java.lang.Integer.decode;
import static java.lang.Integer.parseInt;

public class App {
    public static void main( String[] args ) {
        String command = "";
        String arg1 = "";
        String arg2 = "";
        int position = 0;

        for (String current : args) {
            switch (position++) {
                case 0: command = current; break;
                case 1: arg1 = current; break;
                case 2: {
                    arg2 = current;
                    doCalculate(command, parseInt(arg1), parseInt(arg2));
                    position = 0;
                }
            }
        }
        //java -cp ???.jar CalculatorRunner add 1 1 div 1 0 mul 1 5
    }

    private static void doCalculate(String command, int arg1, int arg2) {
        System.out.println(
            "Calculating: " + command + " with " + arg1 + ", " + arg2
        );
    }
}
