package com.seleniummaster.loops;

public class ForLoopDemo2 {
    public static void main(String[] args) {
        int sum=0;
        for(int i=1;i<=10;i++){
         sum+=i;//sum=sum+i;
         System.out.printf("i=%d sum=%d \n",i,sum);
        }
        System.out.println("Total summary: "+sum);
        //1-5 factorial  5---5*4*3*2*1=sum
        int factorial=1;
        for(int i=1;i<=5;i++){
            factorial*=i;
            System.out.printf("i=%d factorial=%d \n",i,factorial);
        }
        System.out.println(factorial);
        //1-100
        int evenNumberCounts=0;
        for(int i=0;i<100;i++){
            if(i%2==0){
                evenNumberCounts++;
            }
        }
        System.out.println("Total even numbers: "+evenNumberCounts);




    }
}
