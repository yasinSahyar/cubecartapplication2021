package com.unitedcoder.helperclass;

import com.github.javafaker.Faker;

public class HelperClass {

    static String firstName=new Faker().name().firstName();
    static String lastName=new Faker().name().lastName();
    static String emailAddress=firstName+"."+lastName+"@gmail.com";

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
}