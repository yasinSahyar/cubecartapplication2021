package com.seleniummaster.conditionalstatement;

import java.util.Scanner;

public class ConditionDemo2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your score");
        int score=input.nextInt();
        if(score>=0){
        if(score<=100&&score>=90) {
            System.out.println("Great!!! Your Grade is 'A', you win an Ipad!!!");
            System.out.println("***********************");
        }
        else if(score<90&&score>=80)
            System.out.println("Good Job!!! Your grade is 'B', you win an iphone!!!");
        else if(score<80&&score>=60)
            System.out.println("Your grade is 'C'....");
        else
            System.out.println("You failed the exam, please work hard");
    }
    else
            System.out.println("Please enter valid score(Score should be greater than 0)");}

}
