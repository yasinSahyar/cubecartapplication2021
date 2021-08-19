package com.seleniummaster.datastructure;

public class SplitDemo {
    public static void main(String[] args) {
        String s="United_Coder_School";
        String s1="Hello,World";
        String[] array=s.split("_");
        for(String value:array){
            System.out.print(value+" ");
        }
        System.out.println(array[1]);
        String[] arr1=s1.split(",");
        System.out.println(arr1[1]);
    }
}
