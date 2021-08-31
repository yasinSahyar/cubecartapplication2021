package com.unitedcoder.pageobjectmodel;

import com.seleniummaster.configproperties.ApplicationConfigDemo;
import com.seleniummaster.cubecartautomation.TestBase;
import org.junit.*;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestRunner extends TestBase {
    static LoginPage loginPage;
    static DashBoardPage dashBoardPage;
    static CustomersPage customersPage;
    CategoriesPage categoriesPage;

    static String username=ApplicationConfigDemo.readFromPropertiesFile("config.properties","username");
    static String password=ApplicationConfigDemo.readFromPropertiesFile("config.properties","password");

    @BeforeClass
    public static void setUp(){
        browserSetUp();
        loginPage=new LoginPage(driver);
        dashBoardPage=new DashBoardPage(driver);
        customersPage=new CustomersPage(driver);
        loginPage.login(username,password);
    }

    @Test
    public void addCustomerTest(){
        Assert.assertTrue(dashBoardPage.verifyLogin());
        dashBoardPage.clickOnCustomersLink();
        customersPage=new CustomersPage(driver);
        customersPage.addCustomer();
        Assert.assertTrue(customersPage.verifyCustomerAddedSuccessfully());

    }
    @Test
    public void deleteCustomerTest(){
        customersPage.deleteCustomer();
        Assert.assertTrue(customersPage.verifyDeletedSuccessfully());
    }

    @Test
    public void deleteOwnCustomerTest(){
        customersPage.deleteSpecificCustomer();
        Assert.assertTrue(customersPage.verifyDeletedSuccessfully());
    }
    @Test
    public void viewCustomersTest(){
        boolean isCustomerDisplayed=customersPage.viewCustomers();
        Assert.assertTrue(isCustomerDisplayed);
    }
    @Test
    public void wDeleteCategoryTest(){
        categoriesPage=new CategoriesPage(driver);
        dashBoardPage.clickOnCategoriesLink();

        categoriesPage.deleteCategory();
        Assert.assertTrue(categoriesPage.verifyCategoryDeletedSuccessfully());
    }
    @AfterClass
    public static void tearDown(){
        dashBoardPage.clickOnLogoutButton();
        driver.close();
        driver.quit();
    }
}