package com.seleniummaster.uiautomation;

import com.seleniummaster.configproperties.Uiutility;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class MultipleGoogleSearch {
    public static void main(String[] args) throws InterruptedException {
        //define chromedriver location
        System.setProperty("webdriver.chrome.driver","c:\\webdriver\\chromedriver.exe");
        //define chrome driver object instance
        WebDriver driver=new ChromeDriver();
        //open google site
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com");
        //driver.navigate().to("https://www.google.com");
        //search
//        for(int i=0;i<3;i++) {
//            Thread.sleep(2000);
//            WebElement searchBox=driver.findElement(By.name("q"));
//            searchBox.sendKeys(args[i] + Keys.ENTER);
//            driver.navigate().back();
//        }
        Uiutility uiutility=new Uiutility(driver);
        List<String> products=new ArrayList<>();
        products.add("Ipad");
        products.add("Ardino");
        products.add("Iphone");
        for(String keyWords:products) {
            Thread.sleep(2000);
            WebElement searchBox=driver.findElement(By.id("twotabsearchtextbox"));
            searchBox.sendKeys(keyWords + Keys.ENTER);
            uiutility.takeScreenShot(keyWords+".png");
            driver.navigate().back();
        }
        driver.close();//close current browser
        driver.quit();//all driver instance




    }
}
