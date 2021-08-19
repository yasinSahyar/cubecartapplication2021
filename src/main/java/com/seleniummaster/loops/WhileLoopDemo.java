package com.seleniummaster.loops;

public class WhileLoopDemo {
    public static void main(String[] args) {
        //1-100 odd number
        int i=1;
        int sum=0;
        while (i<=10){
            if(i%2!=0) {
                System.out.println(i);
                sum+=i;//sum=sum+i;
            }
            i++;
        }
        System.out.println(sum);
    }
}
