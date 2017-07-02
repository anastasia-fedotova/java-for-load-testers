package com.oop;

@RolesAllowed({"admin", "root"})
public class Calculator {
    @Inject
    private CalculatorLog log;

    //DI: constructor injection
    public Calculator(CalculatorLog log) {
        this.log = log;
    }

    public int add(int a, int b) {
        log.addToLog(a + " add " + b);
        return a + b;
    }

    @Transactional
    @Retry(count = 7)
    public String[] getLog() {
        return log.getLog();
    }
}
