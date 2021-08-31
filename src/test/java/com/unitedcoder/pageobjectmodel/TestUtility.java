package com.unitedcoder.pageobjectmodel;

import com.github.javafaker.Faker;
import com.seleniummaster.configproperties.ApplicationConfigDemo;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestUtility {

    private int timeOut=Integer.parseInt(ApplicationConfigDemo.readFromPropertiesFile(
            "config.properties","timeout"
    ));

    private WebDriver driver;

    public TestUtility(WebDriver driver) {
        this.driver = driver;
    }

    public void sleep(int seconds){
        try {
            Thread.sleep(seconds*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void waitForElementPresent(WebElement element){
        WebDriverWait wait=new WebDriverWait(driver,timeOut);
        wait.until(ExpectedConditions.visibilityOf(element));
    }
    public void waitForAlertPresent(){
        WebDriverWait wait=new WebDriverWait(driver,timeOut);
        wait.until(ExpectedConditions.alertIsPresent());
    }

    public String generateFakeFirstName(){
        Faker faker=new Faker();
        return faker.name().firstName();
    }
    public String generateFakeLastName(){
        Faker faker=new Faker();
        return faker.name().lastName();
    }

    public String randomElaiAddress(){
        String generatedstring= RandomStringUtils.randomAlphabetic(8);
        return generatedstring+"@gmail.com";
    }
}
