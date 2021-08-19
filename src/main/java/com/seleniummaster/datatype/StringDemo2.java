package com.seleniummaster.datatype;

public class StringDemo2 {
    public static void main(String[] args) {
        //index started from 0
        String school="United Coder";
        String course="Java Selenium Test Automation";
        System.out.println(school.indexOf("t"));
        System.out.println(school.indexOf("d"));
        System.out.println(school.lastIndexOf("d"));
        System.out.println(course.indexOf("e"));
        System.out.println(course.indexOf('e',course.indexOf('e')+1));
        System.out.println(course.lastIndexOf("e"));
        //if String doesnt exist renturn -1
        System.out.println(course.indexOf("j"));
        System.out.println(course.indexOf("J"));
        System.out.println(course.indexOf("Test"));
        //length--starts from 1
        System.out.println(school.length());
        //Upper case, lower case method
        System.out.println(course.toLowerCase());
        System.out.println(school.toUpperCase());
       //replcae
        course=course.replace("Java","Python");
        course=course.replace(" ","");
        System.out.println("After replace: "+course);
        String date="2021-01-10";//2021/01/10
        date=date.replace("-","/");
        System.out.println(date);

        String status="  All Test Passed  ";
        System.out.println(status.indexOf("S"));
        System.out.println(status.indexOf("T"));
        System.out.println(status.length());//19
        //trim()--metho remove space
        status=status.trim();//remove begin and last space
        System.out.println(status.length());//15
        //Substring
        System.out.println(course.substring(6,14));
        int length="Automation".length();
        System.out.println(length);
        int indexOfA=course.indexOf("A");
        System.out.println(indexOfA);
        System.out.println(course.substring(indexOfA,indexOfA+length));
        //compare two String
        String s1="Java";
        String s2="java";
        String s3="Java is Fun";
        System.out.println(s1.equals(s2));//false
        System.out.println(s1.equalsIgnoreCase(s2));//true
        boolean b1=s3.contains(s1);
        System.out.println(b1);
        System.out.println(s3.charAt(3));












    }
}
