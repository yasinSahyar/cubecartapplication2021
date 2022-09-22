package com.unitedcoder.databasetest;

import com.seleniummaster.configproperties.ApplicationConfigDemo;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.sql.Connection;

public class DataBaseInsertTest {
    static String configFile="config.properties";
    static String StandAloneUrl= ApplicationConfigDemo.readFromPropertiesFile(configFile,"standalone.dbUrl");
    static String port=ApplicationConfigDemo.readFromPropertiesFile(configFile,"standalone.port");
    static String username=ApplicationConfigDemo.readFromPropertiesFile(configFile,"standalone.username");
    static String password=ApplicationConfigDemo.readFromPropertiesFile(configFile,"standalone.password");
    static String defaultSchema=ApplicationConfigDemo.readFromPropertiesFile(configFile,"standalone.defaultSchema");
    Connection connection=null;
    @BeforeClass
    public void setUp(){
        connection= DBConnection.connectToDataBaseServer(StandAloneUrl,port,
                username,password,defaultSchema,ConnectionType.MYSQLSERVER);
    }
    @Test(description = "Admin user should be able to insert record into cubecart category table",
            groups ={"insert record"} )
    public void verifyCategoryInsertTest(){
        CategoryObject categoryObject=new CategoryObject("Aynigar_MySql1",
                "My_SQL_Demo1",1,0,1,"demo","ttr",
                "Key",1,1);
        DataAccess access=new DataAccess();
        boolean isRecordInserted=access.insertNewCategory(categoryObject,connection);
        Assert.assertTrue(isRecordInserted);
    }
    @Test(description = "Admin user should be able to delelte category",dependsOnGroups = {"insert record"})
    public void deleteCategoryTest(){
        DataAccess access=new DataAccess();
        boolean isDeleted=access.deleteCategory("Aynigar_MySql1",connection);
        Assert.assertTrue(isDeleted);
    }
    @AfterClass
    public void tearDown(){
        DBConnection.closeDataBaseConnection(connection);
    }
}