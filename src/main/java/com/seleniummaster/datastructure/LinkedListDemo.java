package com.seleniummaster.datastructure;

import java.util.*;

public class LinkedListDemo {
    public static void main(String[] args) {
        List<Integer> list1=new LinkedList<>();
//        Queue<Integer> list2=new LinkedList<>();
       LinkedList<Integer> list3=new LinkedList<>();
        list3.add(100);
        list3.add(200);
        list3.addFirst(150);//0
        list3.addLast(250);
        list3.set(1,500);
        list3.add(2,1000);
        System.out.println(list3);

        LinkedList<Object> list4=new LinkedList();
        list4.add("100");
        list4.add(100);
        list4.add(10.09);
        list4.add(true);

        //for loop
        for(int i=0;i<list4.size();i++){
            System.out.print(list4.get(i)+" ");
        }
        System.out.println();
        //for each loop
        for(Object s:list4){
            System.out.print(s+" ");
        }
        System.out.println();
        //Iterator
        Iterator<Object> it=list4.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }
        System.out.println();
        for(int i=0;i<list4.size();i++){
            if(it.hasNext())
                System.out.print(it.next()+" ");
        }

//        Iterator<Integer> it1=list3.iterator();
//        for(int i=0;i<list3.size();i++){
//            if(it1.hasNext())
//                System.out.print(it1.next()+" ");
//        }

    }
}
