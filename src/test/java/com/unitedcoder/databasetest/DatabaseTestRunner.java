package com.unitedcoder.databasetest;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.sql.Connection;

public class DatabaseTestRunner {
    String dbUrl="148.72.106.125";
    String port="3306";
    String username="testautomation";
    String password="automation123!";
    String defaultShema="i4296639_cc1";
    Connection connection = null;

    @BeforeClass
    public void setup(){
        connection = DBConnection.connectToDataBaseServer(dbUrl,port,username,password,defaultShema,
                ConnectionType.MYSQLSERVER);


    }
    @Test
    public void verifyProductsTest(){
        DBMethods dbMethods = new DBMethods();
        boolean isProductExist = dbMethods.getProduct("A Time to kill",connection);
        Assert.assertTrue(isProductExist);
    }

    @Test
    public void verifyCustomerTest(){
        DBMethods dbMethods = new DBMethods();
        boolean isCustomerExist = dbMethods.getCustomerInfo("maya1@gmail.com",connection);
        Assert.assertTrue(isCustomerExist);
    }

    @AfterClass
    public void tearDown(){
        DBConnection.closeDataBaseConnection(connection);
    }

}