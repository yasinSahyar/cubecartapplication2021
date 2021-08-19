package com.seleniummaster.javabasics;

public class IncrementAndDecrement {
    public static void main(String[] args) {
        int f1=1;
        int f2=f1++;//post incerement
        System.out.println(f1);//2
        System.out.println(f2);//1
        int m=1;
        int n=++m;// pre increment
        System.out.println(m);//2
        System.out.println(n);//2
        int f3=3;
        int f4=f3--;
        System.out.println(f3);
        System.out.println(f4);
        int m1=3;
        int n1=--m1;
        System.out.println(m1);
        System.out.println(n1);
        int k1=5;
        int k2=k1--+2;
        System.out.println(k1);
        System.out.println(k2);
        int k3=10;
        int k4=--k3+5;
        System.out.println(k3);
        System.out.println(k4);


    }
}
