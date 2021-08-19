package com.seleniummaster.conditionalstatement;

import java.util.Scanner;

public class ConditionDemo1 {
    public static void main(String[] args) {
        //if statement
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter first number");
        int x=scanner.nextInt();
        System.out.println("Please second number");
        int y=scanner.nextInt();
        int z=x+y;
        System.out.printf("Please enter the calculation result of %d and %d \n",x,y);
        int result=scanner.nextInt();
        if(result==z) {//true
            System.out.println("Good Job!! !!");//if block
        }
        else {
            System.out.println("OOPS!!!Wrong calculation, Please try again!!!");//else block
        }

    }
}
