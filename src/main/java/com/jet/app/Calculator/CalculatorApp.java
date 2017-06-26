package com.jet.app.Calculator;

import static com.jet.app.Calculator.Calculation.*;

public class CalculatorApp {


    public static void main(String[] args) {

        System.out.println(add(1, -1));     // +
        System.out.println(sub(0, 1));      // -
        mPlusbutton();                      // m+
        System.out.println(div(1, 1));      // /
        System.out.println(mult(-1, -1));   // *
        System.out.println(getmButton());   // m
        setmButton();                       // m
        System.out.println(getmButton());   // m

    }
}
