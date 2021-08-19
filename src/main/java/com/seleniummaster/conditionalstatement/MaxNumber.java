package com.seleniummaster.conditionalstatement;

import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num1=scanner.nextInt();
        int num2=scanner.nextInt();
        int num3=scanner.nextInt();
        //10 20 30
        if(num1>num2&&num1>num3){
            System.out.printf("%d is biggest number",num1);
        }
        else if(num2>num3){
            System.out.printf("%d is biggest number",num2);
        }
        else
            System.out.printf("%d is biggest number",num3);
    }
}
