package com.seleniummaster.javabasics;

public class InstanceofDemo {
    public static void main(String[] args) {
        Integer a1=100;
        System.out.println(a1 instanceof Integer);
        String d1=new String("NAME");
        System.out.println(d1 instanceof Object);
        Number a2=234345775;
        System.out.println(a2 instanceof Integer);
        Number a3=6545775656764L;
        System.out.println(a3 instanceof Integer);
        Number a4=6545775656764L;
        System.out.println(a4 instanceof Long);


    }
}
