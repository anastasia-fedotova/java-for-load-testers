package com.acme.edu;

public class ArraysDemo {
    public static void main(String... args) {
       sum(1,1);
       sum(1,1,1,1,1,1,1);
       sum(1);
    }

    public static int sum(int arg, int ...args) {
        int result = 0;
        for (int current : args) {
            result += current;
        }

        return result;
    }
}
