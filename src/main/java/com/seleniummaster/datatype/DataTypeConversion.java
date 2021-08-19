package com.seleniummaster.datatype;


public class DataTypeConversion {
    public static void main(String[] args) {
        //widening casting--convert small to large
        int i1=100;
        long l1=i1;
        System.out.println(String.format("i1=%d l1=%d",i1,l1));

        int i2=200;
        double d1=i2;
        System.out.printf("i2=%d d1=%f \n",i2,d1);
        System.out.println(i2);
        System.out.println(d1);

        char c=8;
        System.out.println(c);
        int i3=c;
        System.out.printf("i3=%d \n",i3);
        System.out.println(c+100);

        //Narrowing casting
        long l2=8764556;
        int i4=(int)l2;
        System.out.printf("i4=%d \n",i4);

        double d2=12.99;
        int i5=(int) d2;
        System.out.println("i5 is: "+i5);
        int g=30;
        int g3=20;
        System.out.println(g+g3);
        String g4=String.valueOf(g);
        String g5=String.valueOf(g3);
        System.out.println(g4+g5);
        double m1=55.90;
        double m2=4.10;
        System.out.println(m1+m2);
        String m3=String.valueOf(m1);
        String m4=String.valueOf(m2);
        System.out.println(m3+" "+m4);
        int m5=(int)m1;
        System.out.println(m5);
        float m6=(float)m2;
        System.out.println(m6);
        //assigment operetorhesablax
        int num2=100;
        num2+=5;
        System.out.println(num2);
        num2-=15;
        System.out.println(num2);
        num2*=2;
        System.out.println(num2);
        num2/=3;
        System.out.println(num2);
        //comparision operetor
        int A=40;
        int B=25;
        System.out.println(A==B);
        System.out.println(A!=B);
        System.out.println(A>B);
        System.out.println(A<B);
        System.out.println(A<=B);
        System.out.println(A>=B);
        boolean k1=true;
        boolean k2=false;
        System.out.println(k1&&k2);//false(&&=且 and的意思)
        System.out.println(k1||k2);//true（||= or或的意思）
        System.out.println(!(k1||k2));//false
       // bitwise operator
        byte s1=100;
        byte s2=110;
        System.out.println(s1&s2);
        System.out.println(s1|s2);
    }
}
