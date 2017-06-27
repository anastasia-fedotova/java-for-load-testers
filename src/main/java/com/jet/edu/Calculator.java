package com.jet.edu;

public class Calculator {
    private static int memory;
    private static int state;

    public static void addToMemory() {
        memory = 6;
    }

    public static int getMemory() {
        memory = 5;
        return memory;
    }
}

class CalculatorApp {
    public static void main(String[] args) {
        Calculator.addToMemory();
        Calculator.getMemory();

//        Calculator.memory = 5;
//        System.out.println(Calculator.memory);
    }
}
