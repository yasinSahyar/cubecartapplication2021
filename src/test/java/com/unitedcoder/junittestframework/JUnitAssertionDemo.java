package com.unitedcoder.junittestframework;

import org.junit.Assert;
import org.junit.Test;

public class JUnitAssertionDemo {
    @Test
    public void test1(){
        int x=10;
        Assert.assertEquals(Math.pow(10,2),100,0);
    }
    @Test
    public void test2(){
        Assert.assertTrue(Math.sqrt(64)==8);
    }
}
