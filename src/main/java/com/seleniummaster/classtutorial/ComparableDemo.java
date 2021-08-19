package com.seleniummaster.classtutorial;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparableDemo {
    public static void main(String[] args) {
        ArrayList<Car> carList=new ArrayList<>();
        carList.add(new Car("Toyota",30000,"2019"));
        carList.add(new Car("Benz",20000,"2017"));
        carList.add(new Car("Honda",50000,"2016"));
        carList.add(new Car("BMW",10000,"2018"));
        System.out.println(carList.toString());
//        carList.sort(Comparator.comparing(Car::getPrice));
//        System.out.println(carList.toString());
//        carList.sort(Comparator.comparing(Car::getPrice).reversed());
//        System.out.println(carList.toString());
        Collections.sort(carList);
        System.out.println(carList.toString());


    }
}
