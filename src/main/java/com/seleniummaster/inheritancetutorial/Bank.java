package com.seleniummaster.inheritancetutorial;

public abstract class Bank {
    int balance;
    final int amount=1000;//constant value  const
    public abstract void credit();
    public void debit(){
        System.out.println("Bank debit");
    }
    public static void loan(){
        System.out.println("Student loan");
    }
}
