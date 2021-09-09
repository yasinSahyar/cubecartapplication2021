package com.unitedcoder.testngframework;

import org.testng.Assert;
import org.testng.annotations.*;

import java.lang.Math.*;

public class TestNGDemo1 {

    @BeforeClass
    public void setup(){
        System.out.println("Before class Runs only once");
    }

    @BeforeMethod
    public void before(){
        System.out.println("Runs Before Every Method");

    }
    @Test(priority = 2,groups = {"smoke test"})
    public void addProduct(){
        System.out.println("This test for adding new products");
        Assert.assertTrue("add product".contains("product"));
    }

    @Test(priority = 3,description = "this test for deleting products",groups = {"smoke test"},dependsOnMethods = "addProduct")
    public void deleteProduct(){

        System.out.println("This test for deleting products");
        Assert.assertTrue(Math.sqrt(64)==8);
    }

    @Test(priority = 1,enabled = true,groups = {"regression test"},dependsOnGroups = {"smoke test"})
    public void viewCustomer(){
        System.out.println("This test for viewing products");
        Assert.assertTrue(Math.min(10,20)==10);

    }
    @AfterMethod
    public void after(){
        System.out.println("this is After Method");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("This is for After Class");
    }

}
