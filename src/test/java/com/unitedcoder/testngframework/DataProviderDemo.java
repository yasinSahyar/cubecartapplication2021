package com.unitedcoder.testngframework;

import com.seleniummaster.cubecartautomation.TestBase;
import com.unitedcoder.pageobjectmodel.DashBoardPage;
import com.unitedcoder.pageobjectmodel.LoginPage;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo extends TestBase {

    @BeforeClass
    public void setup(){
        browserSetUp();
    }
    @Test(dataProvider ="loginUsers")
    public void roleBasedSecurityTest(String username,String password){
        LoginPage loginPage=new LoginPage(driver);
        loginPage.login(username,password);
        DashBoardPage dashBoardPage=new DashBoardPage(driver);
        dashBoardPage.clickOnLogoutButton();
    }
    @AfterClass
    public void tearDown(){
        driver.close();
        driver.quit();
    }
    @DataProvider
    public Object[][] loginUsers(){
        Object[][] userData=new Object[][]{
                {"testautomation","automation123!"},
                {"testautomation1","automation123!"},
                {"testautomation2","automation123!"}
        };
        return userData;
    }
}
