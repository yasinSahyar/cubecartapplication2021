package com.seleniummaster.datastructure;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicateElement {
    public static void main(String[] args) {
        List<String> fruits=new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Pear");
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Grape");
        fruits.add("Strawberry");
        fruits.add("Orange");
        //duplicate  Set
        Set<String> fruits1=new HashSet<>();
        for(int i=0;i<fruits.size();i++){
            String fruitName=fruits.get(i);
            if(fruits1.add(fruitName)==false){
                System.out.println(fruitName+" is duplicated");
            }
        }
    }
}
