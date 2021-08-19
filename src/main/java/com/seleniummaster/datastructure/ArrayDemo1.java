package com.seleniummaster.datastructure;

public class ArrayDemo1 {
    public static void main(String[] args) {
        //define an integer array
        int[] a=new int[5];
        a[0]=200;
        a[1]=300;
        a[2]=400;
        a[3]=500;
        a[4]=600;
        //a[5]=700;
        System.out.println(a[3]);
        System.out.println(a[4]);
        System.out.println(a.length);

        for(int i=0;i<=a.length-1;i++){//0 1 2 3 4 5  i<=4
            System.out.print(a[i]+" ");//a[5]
        }
        System.out.println();
        //for each loop
        for(int arr:a){
            System.out.print(arr+" ");
        }
    }
}
