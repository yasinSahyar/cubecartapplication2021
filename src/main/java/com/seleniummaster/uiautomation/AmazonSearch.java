package com.seleniummaster.uiautomation;

import org.joda.time.DateTime;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class AmazonSearch {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","c:\\webdriver\\chromedriver.exe");
        //define chrome driver object instance
        WebDriver driver=new ChromeDriver();
        //open google site
        driver.manage().window().maximize();
        DateTime browserOpenedTime=new DateTime();
        driver.get("https://www.amazon.com");
        //String[] products=new String[]{"Iphone","Ipad","Laoptop"};
        List<String> products=new ArrayList<>();
        products.add("Ipad");
        products.add("Sumsung");
        products.add("Iphone");
        products.add("Java books");
        for(String keyWord:products){
            WebElement searchBox=driver.findElement(By.id("twotabsearchtextbox"));
            searchBox.sendKeys(keyWord+ Keys.ENTER);
            driver.navigate().back();
        }
        driver.close();
        driver.quit();
        DateTime testFinishedTime=new DateTime();
        Period totalTime=new Period(browserOpenedTime,testFinishedTime, PeriodType.seconds());
        System.out.println("Total execution time is "+totalTime.getSeconds());


    }
}
