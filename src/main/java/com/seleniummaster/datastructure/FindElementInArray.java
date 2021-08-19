package com.seleniummaster.datastructure;

import java.util.Arrays;
import java.util.Scanner;

public class FindElementInArray {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter array length: ");
        int lengthOfArray=scanner.nextInt();
        int[] arr=new int[lengthOfArray];
        //int[] arr={30,10,20,80,40,200,100};
        int maxValue=0;
        for(int i=0;i<arr.length;i++){
            arr[i]=(int)(Math.random()*100+1);
            if(maxValue<arr[i]){
                maxValue=arr[i];
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Max number in Array is: "+maxValue);

    }
}
