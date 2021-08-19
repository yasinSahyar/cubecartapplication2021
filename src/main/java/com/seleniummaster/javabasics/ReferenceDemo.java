package com.seleniummaster.javabasics;

public class ReferenceDemo {
    public static void main(String[] args) {

        int x = 50;
        int y = 80;
        int temp = x;
        x = y;
        y = temp;
        System.out.println("value of x is" + x);
        System.out.println("value of y is" + y);
    }
}

