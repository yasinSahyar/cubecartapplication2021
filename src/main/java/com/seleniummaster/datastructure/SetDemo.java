package com.seleniummaster.datastructure;

import java.util.*;

public class SetDemo {
    public static void main(String[] args) {
        HashSet<Integer> set1=new HashSet<>();
        set1.add(30);
        set1.add(100);
        set1.add(90);
        set1.add(200);
        set1.add(200);
        set1.add(200);
        System.out.println(set1);

        List<Integer> list=new ArrayList<>();
        list.add(30);
        list.add(100);
        list.add(90);
        list.add(200);
        list.add(200);
        list.add(200);
        System.out.println(list);

        int sum=0;
        for(int s:set1){
            sum+=s;
            System.out.print(s+" ");
        }
        System.out.println();
        System.out.println("Sum of the set element is: "+sum);

        Object[] array=set1.toArray();
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
        //iterator
        Iterator<Integer> iterator = set1.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }

    }
}
