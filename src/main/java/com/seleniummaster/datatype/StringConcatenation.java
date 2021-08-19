package com.seleniummaster.datatype;

public class StringConcatenation {
    public static void main(String[] args) {
        //String concatenation, Hello,World
        String s1="Hello";
        String s2="World!!";
        String s4=", ";
        String s3=s1+s4+s2;
        System.out.println(s3);
        //Numric String
        String s5="10";
        String s6="20";
        System.out.println(s5+s6);//1020

        int a=100;
        int b=200;
        String x="Hi";
        String y="Java";
        String z="50";
        String space=" ";
        System.out.println(a+b);//300
        System.out.println(a+z);//10050
        System.out.println(x+y);//HiJava
        System.out.println(a+b+z+x+y);//30050HiJava
        System.out.println(x+y+a+b);//HiJava100200
        System.out.println(x+y+(a+b));//HiJava300
        System.out.println(a+b+x+y+a+b);//300HiJava100200
        String sum=a+space+"A";//100
        System.out.println(sum);
        //String concatenation--Join two String--concat function/method
        String s7="Selenium";
        String s8="Master";
        System.out.println(s7+" "+s8);
        System.out.println(s7.concat(" "+s8));//hard code
        //String format
        System.out.println(String.format("Welcome to %s %s",s7,s8));
        String country="Turkey";
        String city="Istanbul";
        String area="Zeytinburnu";
        System.out.println(String.format("I live in %s %s %s",country,city,area));
        //%s is for String  %d for integer %f double %b boolean






    }
}
