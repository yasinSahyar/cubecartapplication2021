package com.seleniummaster.conditionalstatement;

import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class ATMDemo {
    public static void main(String[] args) {
        int pinNumber=245168;
        int balance=10000;
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your pin number");
        String password=input.nextLine();
        if(StringUtils.isNumeric(password)){
            if(pinNumber==Integer.parseInt(password)){
                System.out.println("Please select the menu(Transfer, Withdraw,Payment)");
                String menu=input.nextLine();
                System.out.println("Please enter withdraw amount");
                int amount=input.nextInt();
                if(menu.equalsIgnoreCase("withdraw")&&amount<=balance){
                    System.out.println("Preparing your cash,Please check your money");
                    System.out.printf("Your current balance was %d \n",balance-amount);
                }
                else {
                    System.out.println("Withdraw amount cant greater than balance");
                }
            }
            else {
                System.out.println("Wrong password, please try again");
            }
        }
        else
            System.out.println("Please enter valid 6 digit numbers");

    }
}
