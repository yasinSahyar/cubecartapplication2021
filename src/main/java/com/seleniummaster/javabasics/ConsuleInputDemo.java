package com.seleniummaster.javabasics;

import java.util.Scanner;

public class ConsuleInputDemo {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("inter ilk namber");
        int x=input.nextInt();
        System.out.println("inter second number");
        int y=input.nextInt();
        System.out.println("inter bashka numir");
        int z=input.nextInt();
        int sum=x+y+z;
        System.out.println(String.format("%d+%d+%d=%d",x,y,z,sum));



    }
}
