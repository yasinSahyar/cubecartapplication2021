package com.unitedcoder.junittestframework;

import org.junit.*;

public class JUitTestDemo1 {
    @BeforeClass
    public static void setUp(){
        System.out.println("Before Class");
    }
    @Before
    public void before(){
        System.out.println("Before method runs before every test");
    }
    @Test
    public void addCustomer(){//test method
        System.out.println("New Customer added successfuly");

    }
    @Test
    public void editCustomer(){
        System.out.println("Customer edited successfuly");
    }
    @Test
    public void addCategory(){
        System.out.println("New category added to the system");
    }
    @AfterClass
    public static void tearDown(){
        System.out.println("After Class");
    }
    @After
    public void after(){
        System.out.println("After method runs after every test");
    }
}
