package com.oop;

public class CalculatorRunner {
    public static void main(String[] args) {
        Calculator calculator = new Calculator(
                new DecoratingStringBuilderCalculatorLog(
                        new StringBuilder()
                )
        );

        new Thread(new LoadWorker(calculator)).start();
        new Thread(new LoadWorker(calculator)).start();
        new Thread(new LoadWorker(calculator)).start();
        new Thread(new LoadWorker(calculator)).start();
    }
}

class LoadWorker implements Runnable {
    private Calculator calculator;

    public LoadWorker(Calculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public void run() {
        for (int counter = 0; counter < 10_000; counter++) {
            calculator.add(counter, counter);
        }

        for (String logEntry : calculator.getLog()) {
            System.out.println(logEntry);
        }
    }
}
