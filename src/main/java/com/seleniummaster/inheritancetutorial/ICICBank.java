package com.seleniummaster.inheritancetutorial;

public class ICICBank extends Bank {
    @Override
    public void credit() {
        System.out.println("Bank credit");
    }

}
