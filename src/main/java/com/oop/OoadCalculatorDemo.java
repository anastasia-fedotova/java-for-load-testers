package com.oop;

public class OoadCalculatorDemo {
    public static void main(String[] args) {
        OoadCalculator calc1 = new OoadCalculator();
        OoadCalculator calc2 = new OoadCalculator();
        calc1.setId(1);
        calc2.setId(2);

        calc1.add(1, 1);
        calc1.add(2, 2);

        calc2.add(3, 3);
        calc2.add(4, 4);

        for (String logEntry : calc1.getLog()) {
            System.out.println(calc1.getId() + " : " + logEntry);
        }
        for (String logEntry : calc2.getLog()) {
            System.out.println(calc2.getId() + " : " + logEntry);
        }

        //TODO:
        //1. Calc -> OOADCalc, DoD: >=2 instances
        //2*. Extract class with ops history
        //

    }
}
