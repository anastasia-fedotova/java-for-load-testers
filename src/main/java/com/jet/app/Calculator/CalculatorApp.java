package com.jet.app.Calculator;

import static com.jet.app.Calculator.Calculation.*;
import static java.lang.Integer.parseInt;

public class CalculatorApp {

    public static void main(String[] args) {

/*      System.out.println(add(12, -1));
        System.out.println(abs(-10));
        System.out.println(sub(abs(0), 10.5));
        mPlusbutton();
        System.out.println(div(1, 0));
        System.out.println(mul(-1, abs(-9)));
        System.out.println(getmButton());
        setmButton();
        System.out.println(abs(getmButton()));
        System.out.println(add(1.0, 1.2));*/

        String command = "";
        String arg1 = "";
        String arg2 = "";
        int position = 0;

        for (String current : args) {
            switch (position++) {
                case 0:
                    command = current;
                    break;
                case 1:
                    arg1 = current;
                    break;
                case 2: {
                    arg2 = current;
                    doCalculate(command, parseInt(arg1), parseInt(arg2));
                    position = 0;
                }
            }
        }
    }

    private static void doCalculate(String command, int arg1, int arg2) {
        System.out.println("Calculating: " + command + " with " + arg1 + ", " + arg2);
        switch (command) {
            case "add":
                add(arg1, arg2);
                break;
            case "sub":
                sub(arg1, arg2);
                break;
            case "mul":
                mul(arg1, arg2);
                break;
            case "div":
                div(arg1, arg2);
                break;
        }
    }
}
