package com.acme.edu;

public class ArraysDemo {
    public static void main(String[] args) {
        int[] array = new int[5];
        array[0] = 5;

        System.out.println(array.length);

        String[] stringArray = {"", "rr"};
        int[] intArray = {1,2,3};

        int[][] matrix = {
            {1,2},
            {2,3,4}
        };
        System.out.println(matrix[1][3]);

        int[][] intMatrix = new int[5][3];
        System.out.println(intMatrix[0][1]);
    }
}
