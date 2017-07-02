/**
 * Decor out of Calculations
 */
package com.jet.app.calculator;

public class DecoratingStringBuilderCalculatorLogger extends StringBuilderCalculatorLogger {

    DecoratingStringBuilderCalculatorLogger() {
        super();
    }

    DecoratingStringBuilderCalculatorLogger(StringBuilder stringBuilder) {
        super(stringBuilder);
    }


    @Override
    public void addToLog(String metod, double a, double b, double buf) {
        super.addToLog(">> " + metod + " >>", a, b, buf);
    }

    @Override
    public String createAdvancedLog(String advanced, String metod, double a, double b, double buf) {
        return super.createAdvancedLog("[DECORATE] ", metod, a, b, buf);
    }
}
