/**
 * Add to log
 * Get from log all strings
 */
package com.jet.app.calculator;

class StringBuilderCalculatorLogger implements CalculatorLogger{
    private StringBuilder logString = new StringBuilder();


    StringBuilderCalculatorLogger(){
        StringBuilder logString = new StringBuilder();
    }

    StringBuilderCalculatorLogger(StringBuilder stringBuilder){
        this.logString = stringBuilder;
    }

    public void addToLog(String metod, double a, double b, double buf) {
        logString.append(createAdvancedLog("", metod, a, b, buf));

    }
    public String createAdvancedLog(String advanced, String metod, double a, double b, double buf){
        return  advanced + a + " " + metod + " " + b +" = "+ buf + "\n";
    }

    public String[] getLog() {
        return logString.toString().split("\n");
    }
}
