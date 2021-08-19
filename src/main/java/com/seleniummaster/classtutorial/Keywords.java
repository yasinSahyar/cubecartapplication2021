package com.seleniummaster.classtutorial;

public class Keywords extends ParentClass {

    public void finalize(){

    }
    public static void main(String[] args) {
        final int x=100;
        int y=200;
        String s="JIM";
        s="name";
        final String name;
        name="Tom";
        System.gc();
    }
    public  void sum(int a,int b){
        System.out.println(a*b);
    }
}
class ParentClass{
    String firstName;
    String lastName;
    public void sum(int a,int b){
        System.out.println(a+b);
    }

    public ParentClass() {
    }

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
}
