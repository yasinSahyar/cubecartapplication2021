package com.seleniummaster.javabasics;

public class MathDemo {
    public static void main(String[] args) {

        System.out.println(Math.max(100,300));
        System.out.println(Math.min(78,63));
        System.out.println(Math.sqrt(16));
        System.out.println(Math.pow(8,3));
        System.out.println(Math.abs(100));
        int randomnumber=(int)(Math.random()*11);
        System.out.println(randomnumber);
        //0--11 hiqa sanlari qikirip berdu//amam 11 ni iqiga amaydu
        int random2=(int)(Math.random()*11)+1;
        System.out.println(random2);

    }
}
