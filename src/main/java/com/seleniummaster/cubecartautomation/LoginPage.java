package com.seleniummaster.cubecartautomation;

import com.seleniummaster.classtutorial.LoginUser;
import com.seleniummaster.excel.ExcelUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends TestBase {
//
//    public LoginPage(WebDriver driver) {
//        super();
//    }

    public void login(LoginUser loginUser){
        WebElement userNameElement= driver.findElement(By.name("username"));
        waitForElementPresent(userNameElement);
        userNameElement.sendKeys(loginUser.getUserName());
        WebElement passwordElement=driver.findElement(By.id("password"));
        waitForElementPresent(passwordElement);
        passwordElement.sendKeys(loginUser.getPassword());
        WebElement loginElement=driver.findElement(By.id("login"));
        waitForElementPresent(loginElement);
        loginElement.click();
    }

    public void login(String username,String password){
        WebElement userNameElement= driver.findElement(By.name("username"));
        waitForElementPresent(userNameElement);
        userNameElement.sendKeys(username);
        WebElement passwordElement=driver.findElement(By.id("password"));
        waitForElementPresent(passwordElement);
        passwordElement.sendKeys(password);
        WebElement loginElement=driver.findElement(By.id("login"));
        waitForElementPresent(loginElement);
        loginElement.click();
    }
}
