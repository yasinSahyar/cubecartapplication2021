package com.seleniummaster.exceptionhandling;

public class ExceptionHandling2 {
    public static void main(String[] args) throws InterruptedException {
        test();
        test1();
    }

    public static void test() throws InterruptedException {
        Thread.sleep(2000);
    }

    public static void test1() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
