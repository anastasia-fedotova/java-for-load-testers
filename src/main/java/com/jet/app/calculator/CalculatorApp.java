package com.jet.app.calculator;

public class CalculatorApp {

    public static void main(String[] args) {
        String command = "";
        String arg1 = "";
        String arg2 = "";
        int position = 0;

        CalculatorOperation calc1 = new CalculatorOperation();
        CalculatorOperation calc2 = new CalculatorOperation();
        calc1.setLog(new StubLogger());
        calc2.setLog(new StubLogger());

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
                    calc1.operation(calc1, command, arg1, arg2);
                    calc2.operation(calc2, command, arg2, arg1);
                    position = 0;
                }
            }
        }

        for (String showLog : calc1.showLog()) {
            System.out.println(showLog);
        }
        System.out.println("\n");

        for (String showLog : calc2.showLog()) {
            System.out.println(showLog);
        }



    }
}


