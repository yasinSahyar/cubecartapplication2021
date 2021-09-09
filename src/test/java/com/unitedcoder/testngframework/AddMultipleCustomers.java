package com.unitedcoder.testngframework;

import com.seleniummaster.cubecartautomation.TestBase;
import com.unitedcoder.pageobjectmodel.CustomersPage;
import com.unitedcoder.pageobjectmodel.DashBoardPage;
import com.unitedcoder.pageobjectmodel.LoginPage;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AddMultipleCustomers extends TestBase {
    @BeforeClass
    public void setup(){
        browserSetUp();
        LoginPage loginPage=new LoginPage(driver);
        loginPage.login("testautomation","automation123!");

    }
    @Test(dataProvider = "customersInfo")
    public void addMultipleCustomersTest(String firstName,String lastName,String email){
        DashBoardPage dashBoardPage=new DashBoardPage(driver);
        dashBoardPage.clickOnCustomersLink();
        CustomersPage customersPage=new CustomersPage(driver);
        customersPage.addCustomer(firstName,lastName,email);
        //dashBoardPage.clickOnLogoutButton();
    }
    @AfterClass
    public void tearDown(){
        driver.close();
        driver.quit();
    }

    @DataProvider
    public Object[][] customersInfo(){
        Object[][] customers=new Object[][]{
                {"Abdullah","Adil","gh2@gmail.com"},
                {"Aynur","Adil","hjh@yahoo.com"},
                {"Adila","Alim","hhgf3@gmail.com"}
        };
        return customers;
    }

}
