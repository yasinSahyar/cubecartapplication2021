package com.seleniummaster.datatype;

import java.util.Scanner;

public class ScannerDemo1 {
    public static void main(String[] args) {
        //Scanner Object
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter first number..");
        int x=scanner.nextInt();
        System.out.println("Please enter second number");
        int y=scanner.nextInt();
        System.out.printf("%d + %d= %d",x,y,x+y);
    }
}
