package com.seleniummaster.loops;

import java.util.Scanner;

public class WhileLoopDemo2 {
    public static void main(String[] args) {
        //Sacanner
        Scanner scanner=new Scanner(System.in);
        int positiveNumbersCounts=0;
        int negativeNumberCounts=0;
        while(true){
            int numbers=scanner.nextInt();
            if(numbers>0){
                positiveNumbersCounts++;
            }
            else if(numbers<0){
                negativeNumberCounts++;
            }
            else
                break;
        }
        System.out.println("Negative number counts: "+negativeNumberCounts);
        System.out.println("Positive number counts: "+positiveNumbersCounts);
    }
}
