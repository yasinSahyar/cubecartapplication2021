package com.seleniummaster.datastructure;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class VerifyOrder {
    public static void main(String[] args) {
        List<String> phoneList=new ArrayList<>();
        phoneList.add("Iphone");
        phoneList.add("Nokia");
        phoneList.add("Sumsung");
        phoneList.add("LG");
        phoneList.add("Blackberry");
        phoneList.add("HTC");
        List<String> list=new ArrayList<>();
        list.addAll(phoneList);
        Collections.sort(list);
        System.out.println(list);
        boolean isSorted=list.equals(phoneList);
        if(isSorted)
            System.out.println("Phone list is in ascending order");
        else
            System.out.println("Phone list is in descending order");



    }
}
