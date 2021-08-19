package com.seleniummaster.datastructure;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        List<Integer> list1=new ArrayList<>();
        ArrayList<Integer> list2=new ArrayList<>();
        list1.add(100);
        list1.add(200);
        list1.add(500);
        System.out.println(list1);
        System.out.println(list1.get(1));
        System.out.println(list1.size());
        list1.remove(1);
        System.out.println(list1);
        list1.set(1,600);
        System.out.println(list1);
        list1.add(80);
        list1.add(70);
        list1.add(150);
        System.out.println(list1);
        Collections.sort(list1);
        System.out.println(list1);

        int sum=0;
        for(int i=0;i<list1.size();i++){
            sum+=list1.get(i);
            System.out.print(list1.get(i)+" ");
        }
        System.out.println();
        System.out.println(sum);

    }
}
