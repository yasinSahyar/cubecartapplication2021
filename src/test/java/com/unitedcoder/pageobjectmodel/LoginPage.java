package com.unitedcoder.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    WebDriver driver;
    TestUtility testUtility;

    @FindBy(id="username")
    WebElement userNameFiled;
    @FindBy(name = "password")
    WebElement passwordField;
    @FindBy(id="login")
    WebElement loginButton;


    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
        testUtility=new TestUtility(driver);
    }

    public void enterUserName(String userName){
        testUtility.waitForElementPresent(userNameFiled);
        userNameFiled.sendKeys(userName);
    }
    public void enterPassword(String password){
        testUtility.waitForElementPresent(passwordField);
        passwordField.sendKeys(password);

    }
    public void clickOnLoginButton(){
        testUtility.waitForElementPresent(loginButton);
        loginButton.click();
    }

    public void login(String userName,String password){
        enterUserName(userName);
        enterPassword(password);
        clickOnLoginButton();
    }

}
