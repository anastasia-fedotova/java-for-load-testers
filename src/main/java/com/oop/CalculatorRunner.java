package com.oop;

public class CalculatorRunner {
    public static void main(String[] args) {
        Calculator calculator = new Calculator(null);

        /**
         * 1. DecoratingStringBuilderCalculatorLog
         * 2. DI for StringBuilder
         */

//        calculator.add(1, 1);
//        calculator.add(2, 2);

        try {
            System.out.println("try entering");
            calculator.div(1, 0); //eeee
            System.out.println("try exiting");
            ///
        } catch (ArithmeticException | NullPointerException e) {

        } catch (Exception e) {

        } finally {

        }
        //???
        System.out.println("!!!!!!!");
        for (String logEntry : calculator.getLog()) {
            System.out.println(logEntry);
        }
    }
}
