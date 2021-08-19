package com.seleniummaster.datastructure;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        Set<Integer> set1=new TreeSet<>();
        set1.add(30);
        set1.add(40);
        set1.add(10);
        set1.add(25);
        set1.add(100);
        System.out.println(set1);
        Set<Integer> set3=new HashSet<>();
        set3.add(30);
        set3.add(40);
        set3.add(10);
        set3.add(25);
        set3.add(100);
        System.out.println(set3);
        Set<Integer> set2=new LinkedHashSet<>();
        set2.add(30);
        set2.add(40);
        set2.add(10);
        set2.add(25);
        set2.add(100);
        System.out.println(set2);
    }
}
