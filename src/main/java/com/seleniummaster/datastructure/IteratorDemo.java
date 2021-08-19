package com.seleniummaster.datastructure;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteratorDemo {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(100);
        list.add(300);
        list.add(200);
        list.add(600);
        list.add(500);
        //iterator
        Iterator<Integer> iterator=list.iterator();
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        ListIterator<Integer> it= list.listIterator(4);
        while (it.hasPrevious()){
            System.out.println(it.previous());
        }

    }
}
