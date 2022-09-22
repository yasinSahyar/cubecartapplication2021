package com.unitedcoder.databasetest;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.sql.Connection;

public class DatabaseTestRunner1 {
    String dbUrl="148.72.106.125";
    String port="3306";
    String username="testautomation";
    String password="automation123!";
    String defaultSchema="studentdatabase";
    Connection connection = null;
    DBMethods dbMethods;
    CategoryObject categoryObject;

    @BeforeClass
    public void setup(){
        connection = DBConnection.connectToDataBaseServer(dbUrl,port,username,password,defaultSchema,
                ConnectionType.MYSQLSERVER);


    }
    @Test(groups = {"insert category"})
    public void insertNewCategoryTest(){
        categoryObject = new CategoryObject("BookMarket33","Demo_My_SQL",3,6,2,"Model","SASASA","KKKK",3,1);
        dbMethods = new DBMethods();
        boolean isNewCategoryInserted = dbMethods.insertNewCategory(categoryObject,connection);
        Assert.assertTrue(isNewCategoryInserted);
    }

    @Test(dependsOnMethods = {"insertNewCategoryTest"})
    public void deleteCategory(){
        boolean isCategoryDeleted= dbMethods.deleteCategory(categoryObject.getCat_name(),connection);
        Assert.assertTrue(isCategoryDeleted);
    }

//    @Test(dependsOnGroups = {"insert category"})
//    public void verifyCategoryInsertTest(){
//        boolean isNewCategoryInserted = dbMethods.verifyCategoryInsertedSuccessfully(categoryObject.getCat_name(),connection);
//        Assert.assertTrue(isNewCategoryInserted);
//    }



    @AfterClass
    public void tearDown(){
        DBConnection.closeDataBaseConnection(connection);
    }

}