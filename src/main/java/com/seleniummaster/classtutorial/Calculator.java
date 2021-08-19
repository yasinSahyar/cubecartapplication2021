package com.seleniummaster.classtutorial;

import org.apache.commons.lang3.StringUtils;

public class Calculator {


    //method for adding two numbers
    public int addTwoNumbers(int i1, int i2){
        int sum = i1 + i2;
        System.out.println(String.format("%d + %d = %d", i1, i2, sum));
        return sum;
    }

    public static int addTwoNumber(int i1, int i2){
        int sum = i1 + i2;
        System.out.println(String.format("%d + %d = %d", i1, i2, sum));
        return sum;
    }

    //method overloading add two numbers
    public long addTwoNumbers(long i1, long i2){
        long sum = i1 + i2;
        System.out.println(String.format("%d + %d = %d", i1, i2, sum));
        return sum;
    }

    //method overloading
    public  long addTwoNumbers(String s1, String s2){

        if(StringUtils.isNumeric(s1)&&StringUtils.isNumeric(s2)){
            long sum = Long.parseLong(s1) + Long.parseLong(s2);
            System.out.println(String.format("%d + %d = %d", s1, s2, sum));
            return sum;
        }else {
            System.out.println("Please provide numeric String!");
            return 0;
        }
    }

       //add many numbers
        public long addNumbers(long... numbers){ //... means multiple arguments

            long total = 0;
            for(long eachNumber: numbers){
                total = total + eachNumber;
            }
            System.out.println("Total sum " + total);
            return total;
        }


        //subtract two numbers
    public long subtractNumbers(long i1, long i2){

        long result = i1 - i2;
        System.out.println(String.format("%d - %d = %d", i1, i2, result));
        return result;
    }

    //divide two numbers
    public double divideTwoNumbers(double numerator, double denominator){

        if(denominator == 0 ){
            System.out.println("You cannot divide a number by zero");
            return 0;
        }else{
            double result = numerator/ denominator;
            System.out.println(String.format("%.2f / %.2f = %.2f", numerator, denominator, result));
            return  result;
        }
    }

    //multiply two numbers
    public long multiplyTwoNumbers(int x , int y){

        long z = x*y;
        System.out.println(String.format("%d * %d = %d", x, y, z));
        return z;
    }


    public void printInformation(){
        System.out.println("Thanks for using simple calculator");
        System.out.println("Hope you enjoy using it");
    }


    public void printSquareRoot(double number){ //void method has no return type
        double sqrt = Math.sqrt(number);
        System.out.println(String.format("Square root of number %.2f is %.2f", number, sqrt));
    }

}
