package com.oop;

public class OoadCalculatorDemo {
    public static void main(String[] args) {
        OoadCalculator calc1 = new OoadCalculator();
        calc1.setLog(new myloggerSTUUUUUUUUBBBBBBB !!!!!!!1111);

        OoadCalculator calc2 = new OoadCalculator();
        calc2.setLog(new LimitedArrayCalculatorLogger()); //DI

        calc1.add(1, 1);
        calc1.add(2, 2);

        calc2.add(3, 3);
        calc2.add(4, 4);

        for (String logEntry : calc1.getLog()) {
            System.out.println(logEntry);
        }
        for (String logEntry : calc2.getLog()) {
            System.out.println(logEntry);
        }

        //TODO:
        //1. Calc -> OOADCalc, DoD: >=2 instances
        //2*. Extract class with ops history
        //

    }
}
