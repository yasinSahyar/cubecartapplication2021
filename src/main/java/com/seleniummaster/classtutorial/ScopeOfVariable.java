package com.seleniummaster.classtutorial;


public class ScopeOfVariable {

    public static void main(String[] args) {
        ScopeOfVariable variable=new ScopeOfVariable();
        variable.sum(10,20);
        ScopeOfVariable.sum1(20,30);
    }
    String name="Tom";//class level variable, global variable
    int age=26;

    public void sum(int a,int b){//local variable
        int c=100;
        int j=200;
        System.out.println(a+b);
        System.out.println(c);
    }
    public static void sum1(int a,int b){//local variable
        int c=100;
        int j=200;
        System.out.println(a+b);
        System.out.println(c);
    }

}
