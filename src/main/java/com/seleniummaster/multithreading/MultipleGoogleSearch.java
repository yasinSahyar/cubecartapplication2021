package com.seleniummaster.multithreading;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MultipleGoogleSearch implements Runnable {
    private String searchWords;


    public MultipleGoogleSearch(String searchWords) {
        this.searchWords = searchWords;
    }

    @Override
    public void run() {
        System.setProperty("webdriver.chrome.driver","c:\\webdriver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com");
       WebElement searchBox=driver.findElement(By.id("twotabsearchtextbox"));
       searchBox.sendKeys(searchWords+ Keys.ENTER);
    }
}
