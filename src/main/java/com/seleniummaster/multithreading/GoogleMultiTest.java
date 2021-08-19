package com.seleniummaster.multithreading;

public class GoogleMultiTest {
    public static void main(String[] args) {
        MultipleGoogleSearch search1=new MultipleGoogleSearch("Iphone");
        MultipleGoogleSearch search2=new MultipleGoogleSearch("Cypress");
        MultipleGoogleSearch search3=new MultipleGoogleSearch("Protractor");
        MultipleGoogleSearch search4=new MultipleGoogleSearch("Java");

        Thread thread1=new Thread(search1);
        Thread thread2=new Thread(search2);
        Thread thread3=new Thread(search3);
        Thread thread4=new Thread(search4);

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

    }
}
