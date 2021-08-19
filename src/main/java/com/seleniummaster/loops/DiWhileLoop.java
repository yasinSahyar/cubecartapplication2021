package com.seleniummaster.loops;

public class DiWhileLoop {
    public static void main(String[] args) {
        int i=1;
        do{
            if(i%2!=0){
                System.out.println(i);
            }
            i++;
        }while (i<100);

        //do while loop--code at least execute one time
        int num1=100;
        while (num1>100){
            System.out.println("Executing while block");
            num1--;
        }

        int num2=100;
        do{
            System.out.println("Executing do while block");
            num2--;
        }while (num2>100);
    }
}
