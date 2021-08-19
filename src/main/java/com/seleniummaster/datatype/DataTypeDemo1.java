package com.seleniummaster.datatype;

public class DataTypeDemo1 {
    public static void main(String[] args) {
        //For integer--byte, short, int, long
        byte b1=127;
        System.out.println(b1);
        short s1=2000;
        System.out.println("S1 value before change:"+s1);
        s1=3000;
        System.out.println("S1 value After change: "+s1);
        System.out.println(b1+s1);
        int age=60;
        int addition=b1+s1;
        System.out.println("My age is: "+age);
        System.out.println("Addition of b1 and s1 is: "+addition);
        long depositMoney=8999998887876544l;
        System.out.println(depositMoney);

        //decimal digits--Float, double  0.7 11.7
        float f1=786.9876f;
        System.out.println(f1);
        double d1=7865.876544;
        System.out.println(d1);

        int x=5;
        int y=2;
        double z=((double)x)/y;
        System.out.println(z);

        //boolean--true false
        boolean result=true;
        boolean status=false;
        System.out.println("\"Successfull message display-Test Result is passed\" "+"is-"+result);
        System.out.println("\"Successfull message not display-Test Result is Passed\" "+"is-"+status);
        System.out.println(10>5);
        boolean comparison=4>20;
        System.out.println(comparison);

        //char
        char c1='A';
        char c2='b';
        System.out.println(c1);
        System.out.println(c2);
        //ASCII code
        int t=c1;
        int d=c2;
        char c3=66;
        System.out.println(c3);
        System.out.println(t);
        System.out.println(d);
        System.out.println(c1+c2);
        //System.out.println(1/0);

        System.out.println(String.format("My current age is %d",age));
        System.out.println(String.format("%d + %d= %d",x,y,x+y));
        System.out.println(x+" +"+y+" = "+(x+y));
        System.out.println(String.format("%d + %f= %.2f",f1,d1,f1+d1));
        System.out.println(String.format("%d / %d=%.1f",x,y,(float)x/y));
        //%b for boolean


    }

}
