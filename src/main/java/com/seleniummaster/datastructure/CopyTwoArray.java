package com.seleniummaster.datastructure;

import java.util.Arrays;

public class CopyTwoArray {
    public static void main(String[] args) {
        int[] a={10,50,20,100};
        int[] b= Arrays.copyOf(a,3);
        System.out.println(Arrays.toString(b));

        int[] arr={100,200,200};
        int[] arr1=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            arr1[i]=arr[i];
        }
        System.out.println(Arrays.toString(arr1));
    }
}
