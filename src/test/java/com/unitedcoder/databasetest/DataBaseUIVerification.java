package com.unitedcoder.databasetest;

import com.seleniummaster.configproperties.ApplicationConfigDemo;
import com.unitedcoder.pageobjectmodel.DashBoardPage;
import com.unitedcoder.pageobjectmodel.LoginPage;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.sql.Connection;

public class DataBaseUIVerification {
    WebDriver driver;

    static String fileName = "config.properties";
    static String dbUrl= ApplicationConfigDemo.readFromPropertiesFile(fileName,"cubeCartProd.dbUrl");
    static String port=ApplicationConfigDemo.readFromPropertiesFile(fileName,"cubeCartProd.port");
    static String username=ApplicationConfigDemo.readFromPropertiesFile(fileName,"cubeCartProd.username");
    static String password=ApplicationConfigDemo.readFromPropertiesFile(fileName,"cubeCartProd.password");
    static String defaultSchema=ApplicationConfigDemo.readFromPropertiesFile(fileName,"cubeCartProd.defaultSchema");
    Connection connection = null;
    String url = ApplicationConfigDemo.readFromPropertiesFile(fileName,"qaurl");
    DashBoardPage dashBoardPage;

    @BeforeClass
    public void setup(){
        connection = DBConnection.connectToDataBaseServer(dbUrl,port,username,password,defaultSchema,
                ConnectionType.MYSQLSERVER);
        System.setProperty("webdriver.chrome.driver","c:\\webdriver\\chromedriver.exe");
        ChromeOptions chromeOptions=new ChromeOptions();
        chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        //define chrome driver object instance
        driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
        driver.get(url);
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("testautomation","automation123!");

    }

    @Test
    public void addProduct(){
        dashBoardPage = new DashBoardPage(driver);
        dashBoardPage.clickOnProductsLink();
    }
}