package com.oop;

public class OoadCalculator {
    private int id = 1;
    private StringBuilder log = new StringBuilder();

    public void setId(int idToSet) {
        id = idToSet;
    }

    public int getId() {
        return id;
    }

    public int add(int a, int b) {
        addToLog(a + " add " + b);
        return a + b;
    }

    public String[] getLog() {
        return log.toString().split("\n");
    }


    private void addToLog(String command) {
        log.append(command);
        log.append("\n");
    }
}
