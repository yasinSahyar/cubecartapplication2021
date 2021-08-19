package com.seleniummaster.inheritancetutorial;

public class Car {
   static int year=2020;//class level variable/ instance variable/ global variable
    // static int l=100;

    public void start(){
        System.out.println("Car...start");
    }
    public void stop(){
        System.out.println("Car Stop");
    }

    public void price(){
        long price=1000;//local variable
        System.out.println(price);
        System.out.println(year);
    }
    //scope of variable
    public static void test(){
        //l=1000;
        System.out.println();
    }
    public static void main(String[] args) {
//        Car car=new Car();
//       car.start();
//       test();
    }

}

