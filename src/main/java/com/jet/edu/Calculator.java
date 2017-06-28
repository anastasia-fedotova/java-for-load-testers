package com.jet.edu;

import static com.jet.edu.Calculator.addToMemory;

public class Calculator {
    private static int memory;
    private static int state;

    public static void addToMemory(MyInt param) { //formal
        param = new MyInt();

        int oldParamValue = param.getMyInt();
        int newParamValue = oldParamValue;

        if (oldParamValue < 0) {
            newParamValue = -oldParamValue;
            param.setMyInt(newParamValue);
        }

        memory = memory + newParamValue;
    }

    public static int getMemory() {
        return memory;
    }
}

class MyInt {
    private int myInt; //field, property

    public int getMyInt() {
        return myInt;
    }

    public void setMyInt(int myInt) {
        this.myInt = myInt;
    }
}

class CalculatorApp {
    public static void main(String[] args) {
        MyInt toAdd = new MyInt();
        toAdd.setMyInt(-1);

        addToMemory(toAdd); //factual
        System.out.println(toAdd.getMyInt()); //==1
    }
}
