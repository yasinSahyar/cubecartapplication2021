package com.seleniummaster.datatype;

public class ReferenceValue {
    public static void main(String[] args) {
        //y=100  x=200
        int x=100;
        int y=200;
        int tempValue=x;
        x=y;
        y=tempValue;
        System.out.println("Value of x is: "+x);
        System.out.println("Value of y is: "+y);
    }
}
