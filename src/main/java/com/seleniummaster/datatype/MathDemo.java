package com.seleniummaster.datatype;

import java.util.Random;

public class MathDemo {
    public static void main(String[] args) {
        System.out.println(Math.abs(-200));
        System.out.println(Math.min(100,20));
        System.out.println(Math.max(50,98));
        System.out.println(Math.sqrt(64));
        System.out.println(Math.pow(4,3));
        //Random number--0.0---0.999999
        System.out.println(Math.random());
        //0-10
        int randomNumber=(int)(Math.random()*11);
        System.out.println(randomNumber);
        //1-10
        int number=(int)(Math.random()*10)+1;
        System.out.println("Before plus: "+number);
        number++;
        System.out.println(number);
        //Random class
        Random random=new Random();
        long numbers = 10000000000l + (long)(random.nextDouble() * 9999999999l);
        System.out.println(numbers);


    }
}
