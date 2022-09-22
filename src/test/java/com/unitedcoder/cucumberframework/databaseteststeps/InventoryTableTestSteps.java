package com.unitedcoder.cucumberframework.databaseteststeps;

import com.seleniummaster.configproperties.ApplicationConfigDemo;
import com.unitedcoder.databasetest.ConnectionType;
import com.unitedcoder.databasetest.DBConnection;
import com.unitedcoder.databasetest.DataAccess;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.sql.Connection;

public class InventoryTableTestSteps {
    static String fileName = "config.properties";
    static String dbUrl= ApplicationConfigDemo.readFromPropertiesFile(fileName,"cubeCartProd.dbUrl");
    static String port=ApplicationConfigDemo.readFromPropertiesFile(fileName,"cubeCartProd.port");
    static String username=ApplicationConfigDemo.readFromPropertiesFile(fileName,"cubeCartProd.username");
    static String password=ApplicationConfigDemo.readFromPropertiesFile(fileName,"cubeCartProd.password");
    static String defaultSchema=ApplicationConfigDemo.readFromPropertiesFile(fileName,"cubeCartProd.defaultSchema");
    Connection connection = null;
    boolean isProductExist = false;

    @Before
    public  void setup(){
        connection = DBConnection.connectToDataBaseServer(dbUrl,port,username,password,defaultSchema, ConnectionType.MYSQLSERVER);

    }

    @After
    public void tearDown(){
        DBConnection.closeDataBaseConnection(connection);
    }

    @Given("user has access to the relational data base")
    public void userHasAccessToTheRelationalDataBase() {
        System.out.println("Connection Exist!!!");
    }

    @When("user query the sql script in the cc_CubeCart_inventory table")
    public void userQueryTheSqlScriptInTheCc_CubeCart_inventoryTable() {
        DataAccess dataAccess =new DataAccess();
        isProductExist=dataAccess.getProductName("phone",connection);


    }

    @Then("user should get the product related information")
    public void userShouldGetTheProductRelatedInformation() {
        Assert.assertTrue(isProductExist);
    }
}