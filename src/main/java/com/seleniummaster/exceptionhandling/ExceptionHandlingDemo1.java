package com.seleniummaster.exceptionhandling;

public class ExceptionHandlingDemo1 {
    public static void main(String[] args) {
        //Unchecked, Run time exception
        try {
            System.out.println(1 / 0);
        }catch (Exception a){
            System.out.println(a.getMessage());
            a.printStackTrace();
            System.out.println("In the Catch block");
        }
        System.out.println("Hello World");
    }
}
