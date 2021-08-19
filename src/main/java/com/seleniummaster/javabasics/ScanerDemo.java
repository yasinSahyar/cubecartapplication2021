package com.seleniummaster.javabasics;

import org.openqa.selenium.ElementNotSelectableException;

import java.util.Scanner;

public class ScanerDemo {
    public static void main(String[] args) {
        int cunkuan=2000;
        int sifire=1234;
        Scanner d2=new Scanner(System.in);
        System.out.println("please enter pin");
        int pin=d2.nextInt();
        if (pin==sifire)
        {
            System.out.println("correct pin,you can do next step");
        }
        else {
            System.out.println("invalid pin,try again");

        }
        System.out.println("please enter amount of money");
        int miktar=d2.nextInt();
        if (miktar<cunkuan){
            System.out.println("you can check money");
        }
        else {
            System.out.println("you cunkuan not enough, please put money");
        }




    }
}
