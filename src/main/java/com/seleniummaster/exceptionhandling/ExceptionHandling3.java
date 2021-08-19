package com.seleniummaster.exceptionhandling;

public class ExceptionHandling3 {
    public static void main(String[] args) {
        try {
            int[] arr = new int[]{1, 2, 3};
            System.out.println(arr[5]);//array index out of bound exception
        }catch (Exception a){
            a.printStackTrace();
            System.out.println("World");
        }finally {
            System.out.println("Hello");
        }
    }
}
