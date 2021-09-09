package com.unitedcoder.testngframework;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGDemo2 {

    @Test(invocationCount = 3)
    public void test1(){
        System.out.println("Test1 ...");
        Assert.assertEquals(10,10);
    }
    @Test(timeOut = 5000,enabled = false)
    public void test2(){
        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Test2 ...");
        Assert.assertEquals(20,20);
    }
    @Test(expectedExceptions = NumberFormatException.class)
    public void test3(){
        String s="100a";
        System.out.println(Integer.parseInt(s));
    }
}
