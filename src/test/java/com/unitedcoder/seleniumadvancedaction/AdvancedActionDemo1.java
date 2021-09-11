package com.unitedcoder.seleniumadvancedaction;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AdvancedActionDemo1 {
    WebDriver driver;

    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","c:\\webdriver\\chromedriver.exe");
        ChromeOptions chromeOptions=new ChromeOptions();
        chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com/");
    }

    @Test
    public void amazonTest() throws InterruptedException {
        WebElement accountList=driver.findElement(By.cssSelector("a[id='nav-link-accountList']"));
        Actions actions=new Actions(driver);
        Thread.sleep(3000);
        actions.moveToElement(accountList).build().perform();
        WebElement searchBox=driver.findElement(By.id("twotabsearchtextbox"));
        Thread.sleep(2000);
        actions.moveToElement(searchBox).click().keyDown(Keys.SHIFT).sendKeys("iphone").doubleClick().
                build().perform();
        actions.sendKeys(Keys.ENTER).perform();
    }
    @AfterClass
    public void tearDown(){
        driver.close();
        driver.quit();
    }


}
