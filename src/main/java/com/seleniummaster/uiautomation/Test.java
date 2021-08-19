package com.seleniummaster.uiautomation;

public class Test {
    public static void main(String[] args) {
        String a="****4756";
        char[] ch = new char[a.length()];
        // Copy character by character into array
        for (int i = 0; i < a.length(); i++) {
            ch[i] = a.charAt(i);
        }
        int count=0;
        for(int i=0;i<4;i++){
            if(ch[i]=='*')
                count++;
        }
        System.out.println("Total * is: "+count);
    }
    }

