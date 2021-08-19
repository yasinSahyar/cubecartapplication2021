package com.seleniummaster.datastructure;

import java.util.Arrays;

public class ArraysSortDemo {
    public static void main(String[] args) {
        //ascending descending
        int[] array=new int[]{20,90,40,400,50,300,200};
        //sort array in ascending order
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        for(int i= array.length-1;i>=0;i--){
            System.out.print(array[i]+" ");
        }
    }
}
