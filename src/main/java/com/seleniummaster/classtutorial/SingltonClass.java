package com.seleniummaster.classtutorial;

public class SingltonClass {
    private static SingltonClass singltonClass=null;
    String s;
    private SingltonClass(){
         s="hello";
    }
    //static getInstance method  null value
    //lazy initialization
    public static SingltonClass getInstance(){
        if(singltonClass==null){
            singltonClass=new SingltonClass();
        }
        return singltonClass;//x
    }

    public static void main(String[] args) {
        SingltonClass x=SingltonClass.getInstance();
        SingltonClass y=SingltonClass.getInstance();//x
        SingltonClass z=SingltonClass.getInstance();//x
        x.s=(x.s).toUpperCase();
        System.out.println(x.s);
        System.out.println(y.s);
        System.out.println(z.s);

    }



}
