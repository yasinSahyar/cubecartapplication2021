package com.unitedcoder.testngframework;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SoftAssertDemo {
    @Test
    public void Test(){
        System.out.println("Login");
        Assert.assertEquals(20,20);
        System.out.println("Add Product");
        Assert.assertEquals(40,30);
        System.out.println("Add Category");
        Assert.assertEquals(40,40);
        System.out.println("Add Newsletter");
        Assert.assertEquals(60,50);
    }
}