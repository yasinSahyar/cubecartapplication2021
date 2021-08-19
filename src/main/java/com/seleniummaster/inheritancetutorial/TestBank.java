package com.seleniummaster.inheritancetutorial;

public class TestBank {
    public static void main(String[] args) {
        Bank bank=new ICICBank();
        bank.balance=1000;
        bank.credit();
        bank.debit();

    }
}
