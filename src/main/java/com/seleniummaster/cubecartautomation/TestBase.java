package com.seleniummaster.cubecartautomation;


import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

public class TestBase {
    public static WebDriver driver;
    static int timeOut=20;
    public static String browserName="chrome";
    public static String  url="http://cubecart.unitedcoderschool.com/ecommerce/admin_w4vqap.php";

    public static void browserSetUp(){
        if (driver == null) {
            if(browserName.equalsIgnoreCase("chrome")){
                System.setProperty("webdriver.chrome.driver","c:\\webdriver\\chromedriver.exe");
                ChromeOptions chromeOptions=new ChromeOptions();
                chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
                //define chrome driver object instance
                driver = new ChromeDriver(chromeOptions);
                driver.manage().window().maximize();
                driver.get(url);
            }
            else if(browserName.equalsIgnoreCase("firefox")){
                System.setProperty("webdriver.gecko.driver","c:\\webdriver\\geckodriver.exe");
                ChromeOptions chromeOptions=new ChromeOptions();
                chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
                //define chrome driver object instance
                driver = new ChromeDriver(chromeOptions);
                driver.manage().window().maximize();
                driver.get(url);
            }
        }
    }

    public static void  closeBrowser(){
        driver.close();
        driver.quit();
    }

    public static void sleep(int seconds){
        try {
            Thread.sleep(seconds*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    //explicit wait  500 millisecond
    public static void waitForElementPresent(WebElement element){
        WebDriverWait webDriverWait=new WebDriverWait(driver,timeOut);
        webDriverWait.until(ExpectedConditions.visibilityOf(element));
    }
    //fluent wait
    public static void fluentWait(WebElement element){
        Wait<WebDriver> wait=new FluentWait<>(driver)
                .withTimeout(5, TimeUnit.SECONDS)
                .pollingEvery(200,TimeUnit.MILLISECONDS)
                .ignoring(NoSuchElementException.class);
        wait.until(ExpectedConditions.visibilityOf(element));

    }
}
