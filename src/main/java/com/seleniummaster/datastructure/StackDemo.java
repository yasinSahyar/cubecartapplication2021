package com.seleniummaster.datastructure;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<String> s1=new Stack<>();
        s1.push("Book1");
        s1.push("Book2");
        s1.push("Book3");
        s1.push("Book4");
        s1.pop();
        System.out.println(s1);
        System.out.println(s1.search("Book2"));
        System.out.println(s1.search("Book1"));

    }
}
