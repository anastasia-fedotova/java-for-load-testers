/**
 * Реализация методов записи и вывода лога
 */
package com.jet.app.Calculator;

class LogMessages {

    private StringBuilder print = new StringBuilder("");

    void addToLog(String metod, double a, double b, double buf) {
        StringBuilder str = new StringBuilder()
                .append(a)
                .append(" ")
                .append(metod)
                .append(" ")
                .append(b)
                .append(" = ")
                .append(buf);
        print.append(str).append("\n");
    }

    StringBuilder getAllLogMessages() {
        return print;
    }
}
