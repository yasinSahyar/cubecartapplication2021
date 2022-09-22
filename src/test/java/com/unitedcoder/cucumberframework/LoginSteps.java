package com.unitedcoder.cucumberframework;

import com.seleniummaster.cubecartautomation.TestBase;
import com.unitedcoder.pageobjectmodel.DashBoardPage;
import com.unitedcoder.pageobjectmodel.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginSteps extends TestBase {
    LoginPage loginPage;
    DashBoardPage dashBoardPage;
    @Given("user already on the login page")
    public void userAlreadyOnTheLoginPage() {
        loginPage=new LoginPage(driver);
        dashBoardPage=new DashBoardPage(driver);
    }

    @When("user enter valid username password to click on login button")
    public void userEnterValidUsernamePasswordToClickOnLoginButton() {
        loginPage.login("testautomation","automation123!");

    }

    @Then("user should be able to login successfully")
    public void userShouldBeAbleToLoginSuccessfully() {
        dashBoardPage.verifyLogin();

    }

    @Then("user should click on logout button to logout")
    public void userShouldClickOnLogoutButtonToLogout() {
        dashBoardPage.clickOnLogoutButton();
    }

    @Given("user already on the login page again")
    public void userAlreadyOnTheLoginPageAgain() {
        loginPage=new LoginPage(driver);
    }

    @When("user enter invalid username and password to login")
    public void userEnterInvalidUsernameAndPasswordToLogin() {
        loginPage.login("testautomation","automation1!");
    }

    @Then("user should see error message popup")
    public void userShouldSeeErrorMessagePopup() {
        //Assert.assertTrue(loginPage.verfyInvalidLogin());


    }



}