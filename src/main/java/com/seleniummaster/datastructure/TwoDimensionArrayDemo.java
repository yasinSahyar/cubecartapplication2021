package com.seleniummaster.datastructure;

import java.util.Arrays;

public class TwoDimensionArrayDemo {
    public static void main(String[] args) {
//        int[][] a1=new int[4][];
//        int[] a2[]={};
        int[][] a={
                {1,2,3,6},
                {3,4,5},
                {4,5,6,9,10},
                {100,200,300}
        };
        System.out.println(a.length);
        System.out.println(a[2].length);
        System.out.println(a[1][1]);
        System.out.println(a[2][3]);
        int sum=0;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                System.out.print(a[i][j]+" ");
                sum+=a[i][j];
            }
            System.out.println();
        }
        System.out.println("Sum of array: "+sum);




    }
}
