package com.seleniummaster.datatype;

import java.util.Scanner;

public class ScannerDemo2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your school name");
        String name=input.nextLine();
        System.out.println("Please enter your school address");
        String address=input.nextLine();
        System.out.println("Please enter your school zip code");
        String zipCode=input.next();
        System.out.printf("Your school full address is %s %s %s",name,address,zipCode);

    }
}
