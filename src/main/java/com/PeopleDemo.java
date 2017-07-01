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
