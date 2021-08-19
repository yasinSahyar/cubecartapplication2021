package com.seleniummaster.datatype;

public class IncrementDecrementDemo {
    public static void main(String[] args) {
        int a=50;
        int b=100+(++a);//assignment operators  51+100=151
        int c=++a;//152
        System.out.println(a);
        System.out.println(b);//100+51
        System.out.println(c);

        int a1=50;
        int b1=100+(a1++);//assignment operators  100+50   51
        System.out.println("**");
        System.out.println(a1);
        int c1=a1++;
        System.out.println(a1);
        System.out.println(b1);//100+50
        System.out.println(c1);
        System.out.println("*****************************************");
        //pre ++i first plus one then perform operation
        //post i++  first perfom operation then plus one
        int i=1;
        int j=i++;//j=1
        System.out.println(i);//2
        System.out.println(j);//1
        int m=1;
        int n=++m;//2  n=2
        System.out.println(m);//2
        System.out.println(n);//2

        int p=10;
        int p1=p--;//10
        System.out.println(p);
        System.out.println(p1);
        int j1=10;
        int j2=--j1;//9
        System.out.println(j1);
        System.out.println(j2);



    }
}
