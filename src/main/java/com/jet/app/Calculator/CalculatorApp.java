package com.jet.app.Calculator;

import static java.lang.Double.parseDouble;

public class CalculatorApp {

    public static void main(String[] args) {
        String command = "";
        String arg1 = "";
        String arg2 = "";
        int position = 0;
        Double buffer;

        Calculation calc1 = new Calculation();
        Calculation calc2 = new Calculation();

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
                    buffer = calc1.doCalculate(command, parseDouble(arg1), parseDouble(arg2));
                    calc1.addToLog(command, parseDouble(arg1), parseDouble(arg2), buffer);
                    buffer = calc2.doCalculate(command, parseDouble(arg2), parseDouble(arg1));
                    calc2.addToLog(command,parseDouble(arg2),parseDouble(arg1), buffer);
                    position = 0;
                }
            }
        }
        System.out.println(calc1.showLog());
        System.out.println(calc2.showLog());
    }
}

