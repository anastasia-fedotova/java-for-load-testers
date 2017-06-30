package com.acme.edu;

public class ArraysDemo {
    public static void main(String... args) {
        String str = new String("a,bc,d,ef");
        str.split(",");

        String s1 = "a";
        String s2 = "a";
        System.out.println(s1 == s2);

        s1.toUpperCase();
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1.toUpperCase());

        StringBuffer sbf;
        StringBuilder sbd;
        sbd = new StringBuilder("abc");
        sbd.append("A");
        sbd.append("A");
        sbd.append("A");
        sbd.append("A");
        sbd.append("A");
        sbd.append("A");

        sbd.append("B").append("c").append("D"); //Fluent API, interface
    }
}
