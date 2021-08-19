package com.seleniummaster.lambdaexpression;

import java.util.Date;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class ConsumerAndSupplierDemo {
    public static void main(String[] args) {
        Consumer<String> c1=s-> System.out.println(s+" "+"is Fun");
        Consumer<String> c2=s-> System.out.println(s+" "+"is not difficult");
        Consumer<String> c3=s-> System.out.println(s+" "+"is Intresting");

        c1.andThen(c2).andThen(c3).accept("Java");

        Supplier<Date> supplier=()->new Date();
        System.out.println(supplier.get());
    }
}
