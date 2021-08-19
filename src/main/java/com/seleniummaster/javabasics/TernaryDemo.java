package com.seleniummaster.javabasics;

public class TernaryDemo {
    public static void main(String[] args) {
        int m=12;
        int n=5;
        int max=(m>n)?m:n;
        System.out.println(String.format("max value of %d  and %d is %d",m,n,max));
        int min=(n<m)?n:m;
        System.out.println(String.format("min value of %d  and %d is %d",n,m,min));
        int m1=12;
        int n1=5;
        int max2=(m1<n1)?m1:n1;
        System.out.println(String.format("max2 value of %d  and %d is %d",m1,n1,max2));




    }
}
