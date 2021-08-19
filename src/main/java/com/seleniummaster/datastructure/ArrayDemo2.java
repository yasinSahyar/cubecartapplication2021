package com.seleniummaster.datastructure;

import java.util.Arrays;

public class ArrayDemo2 {
    public static void main(String[] args) {
        int[] b=new int[]{1,2,3,4,5};
        System.out.println(b.length);//5
        System.out.println(b[3]);
        //for loop
        int sum=0;
        for(int i=0;i<b.length;i++){//0 1 2 3 4
            System.out.print(b[i]+" ");
            sum+=b[i];//sum=sum+b[i]
        }
        System.out.println(sum);
        System.out.println();
        //for each loop
        int sum1=0;
        for(int a:b){
            System.out.print(a+" ");
            sum1+=a;
        }
        System.out.println(sum1);

        System.out.println(b);
        System.out.println(Arrays.toString(b));

//        //1-100
//        int sum=0;
//        for(int i=1;i<=100;i++){
//            sum+=i;
//        }
//        System.out.println(sum);
    }
}
