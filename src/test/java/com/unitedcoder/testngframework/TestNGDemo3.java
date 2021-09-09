package com.unitedcoder.testngframework;

import org.testng.Assert;
import org.testng.annotations.*;

import static java.lang.Math.min;
import static java.lang.Math.sqrt;

public class TestNGDemo3 {

    @BeforeSuite
    public void beforeSuit(){
        System.out.println("Before Suit Runs only once");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("After Suite runs only once");
    }
    @BeforeTest
    public void beforeTest(){
        System.out.println("Before Test.....");
    }
    @AfterTest
    public void afterTest(){
        System.out.println("After Test.....");
    }
    @BeforeClass
    public void setup(){
        System.out.println("Before Class Runs only once");
    }
    @BeforeMethod
    public void before(){
        System.out.println("Runs Before Every Test Method");
    }
    @Test(priority = 2,groups = {"smoke test","regression"})
    public void addProductTest(){
        System.out.println("This Test is for ading new products");
        Assert.assertTrue("add product".contains("product"));
    }
    @Test(priority = 3,description = "This test is for deleting products",groups = {"smoke test"},dependsOnMethods = "addProductTest")
    public void deleteProductTest(){
        System.out.println("This test is for deleting products");
        Assert.assertTrue(sqrt(64)==8);
    }
    @Test(priority = 1,enabled = true,groups = {"regression test"},dependsOnGroups = {"smoke test"})
    public void viewCustomersTest(){
        System.out.println("This test is for viewing customers");
        Assert.assertTrue(min(10,20)==10);
    }
    @AfterMethod
    public void after(){
        System.out.println("Runs after every test method");
    }
    @AfterClass
    public void tearDown(){
        System.out.println("Runs only once after all test");
    }





}