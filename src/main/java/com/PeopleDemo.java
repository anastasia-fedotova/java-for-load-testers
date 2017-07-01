package com;

public class PeopleDemo {
    public static void main(String[] args) {
//        System.out.println(Human.isSitting);

        Human h1 = new Human();
        Human h2 = new Human();

        h1.setAge(30);
        System.out.println(h1.getAge());

        h2.setAge(35);
        System.out.println(h2.getAge());

        h1.setAge(200);

        doCalculate(calc1, "add", "1", "2");
    }

    public static void doCalculate(Calculator calc, String comm, String arg1, String arg2) {
        calc.doCalculate(comm, parseDouble(arg1), parseDouble(arg2));
    }
}

class Human {
    private int ageFiled; //state = memory

    public void setAge(int age) {
        if (age < 0 || age > 100) {
            return;
        } else {
            ageFiled = age;
        }
    }

    public int getAge() {
        return ageFiled;
    }
}
