package com.seleniummaster.datatype;

public class DataTypeConversion2 {
    public static void main(String[] args) {
        //numeric String
        String age="20";
        String s1="true";
        System.out.println(age+30);//2030
        int i1=Integer.parseInt(age);
        System.out.println(i1+30);
//        long l1=Long.parseLong(age);
//        Double.parseDouble(age);
//        Float.parseFloat(age);
//        Short.parseShort(age);
//        Byte.parseByte(age);
//        Boolean.parseBoolean(s1);

        double d1=Double.parseDouble(age);
        System.out.printf("d1=%.2f \n",d1);
        float f1=Float.parseFloat(age);
        System.out.printf("f1=%.2f \n",f1);
        boolean b1=Boolean.parseBoolean(s1);
        System.out.println(b1);

        //non numeric string
        String s2="100ABC";
        s2=s2.replace("ABC","");
        int i3=Integer.parseInt(s2);
        System.out.println(s2);
        String s3="100.000,00";
        s3=s3.replace(",00","").replace(".","");
        int i2=Integer.parseInt(s3);
        System.out.println(i2);

        //Convert primitive data type to String
        int x=1000;
        float f=6789.98f;
        System.out.println(x+100);//1100
        String x1=String.valueOf(x);
        System.out.println(x1+100);//1000100

        System.out.println(Integer.toBinaryString(123));
        System.out.println(Integer.toHexString(123));
        System.out.println(Integer.toOctalString(123));

        //Integer.parseInt--return type int-primitive data type
        //Integer.valueOf--return type Integer--Object
        Integer i=100;//Integer.valueOf(100)
        Integer integer=new Integer(100);//new object







    }
}
