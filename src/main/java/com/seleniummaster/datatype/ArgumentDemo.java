package com.seleniummaster.datatype;

public class ArgumentDemo {
    public static void main(String[] args) throws InterruptedException {
        //args[0]=100  args[1]=200  args[3]=300
        int i1=Integer.parseInt(args[0]);
        int i2=Integer.parseInt(args[1]);
        int i3=Integer.parseInt(args[2]);
        System.out.printf("%d + %d + %d= %d",i1,i2,i3,i1+i2+i3);

        Thread.sleep(3000);
    }
}
