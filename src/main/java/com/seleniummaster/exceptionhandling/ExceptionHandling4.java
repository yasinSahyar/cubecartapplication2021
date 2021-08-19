package com.seleniummaster.exceptionhandling;

public class ExceptionHandling4 {
    public static void main(String[] args) {
        //String s=null;
        try {
            System.out.println(1/4);
            throw new Exception("String value should be initialize");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
