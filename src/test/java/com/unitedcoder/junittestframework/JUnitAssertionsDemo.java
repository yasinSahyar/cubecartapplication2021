package com.unitedcoder.junittestframework;

import org.junit.Assert;
import org.junit.Test;

public class JUnitAssertionsDemo {

    @Test
    public void test1(){
        double x = 10;
        Assert.assertEquals(Math.pow(x,2),100,0);

    }

    @Test
    public void test2(){
        Assert.assertTrue(Math.sqrt(64) == 8);
    }
}