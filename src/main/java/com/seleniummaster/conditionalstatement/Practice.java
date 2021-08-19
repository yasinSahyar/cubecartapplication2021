package com.seleniummaster.conditionalstatement;

public class Practice {
    public static void main(String[] args) {
        //Difference between & && operator
        boolean b1=false;
        int number=100;
        if (b1 && (number++ > 0)) {
            System.out.println("True statement");
        }
        else {
            System.out.println("False statement");
        }
        System.out.println("Value of number: "+number);

        int number1=100;
        if (b1 & (number1++ < 0)) {
            System.out.println("True statement");
        }
        else {
            System.out.println("False statement");
        }
        System.out.println("Value of number1: "+number1);
    }
}
