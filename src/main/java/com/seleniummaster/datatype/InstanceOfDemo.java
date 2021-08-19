package com.seleniummaster.datatype;


public class InstanceOfDemo {
    public static void main(String[] args) {
        //instnace of
        Integer i=100;
        boolean b1=i instanceof Integer;
        System.out.println(b1);
        String s1=new String("Hello");
        System.out.println(s1 instanceof Object);
        Number n=3276;
        System.out.println(n instanceof Short);
        System.out.println(n instanceof Integer);
        System.out.println(n instanceof Double);
    }
}
