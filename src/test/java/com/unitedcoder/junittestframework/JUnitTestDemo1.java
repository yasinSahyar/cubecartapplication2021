package com.unitedcoder.junittestframework;

import org.junit.*;
import org.junit.rules.TestName;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class JUnitTestDemo1 {

    @BeforeClass
    public static void setUp(){
        System.out.println("Before Class");
    }
    @Before
    public void before(){
        System.out.println("Before method runs before every test");
    }
    @AfterClass
    public static void tearDown(){
        System.out.println("After Class");
    }

    @After
    public void after(){
        System.out.println("After method runs after every test");
    }
    @Rule
    public TestName testName=new TestName();
    //  @Ignore
    @Test
    public void jaddCustomer(){//test method
        System.out.println("New Customer added successfully");
    }
    @Test(timeout = 3000)
    public void aeditCustomer() throws InterruptedException {
        System.out.println("Customer edited successfully");
        System.out.println(testName.getMethodName()+"Passed");
        Thread.sleep(4000);
    }
    @Test
    public void pddCategory(){
        System.out.println("New category added to the system");
    }


}