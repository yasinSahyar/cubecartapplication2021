package com.seleniummaster.dropdownhandling;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class SelectClassDemo1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","c:\\webdriver\\chromedriver.exe");
        ChromeOptions chromeOptions=new ChromeOptions();
        chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        WebDriver driver=new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/reg/?rs=6&privacy_mutation_token=eyJ0eXBlIjowLCJjcmVhdGlvbl90aW1lIjoxNjA1MDI4NjA4LCJjYWxsc2l0ZV9pZCI6NzMxOTQxNDIwNzMyOTEwfQ%3D%3D");
        WebElement day=driver.findElement(By.id("day"));
        WebElement month=driver.findElement(By.id("month"));
        WebElement year=driver.findElement(By.id("year"));
        Thread.sleep(4000);
        Select s1=new Select(day);
   //     s1.selectByValue("17");
//        Select s2=new Select(month);
//        s2.selectByVisibleText("Mar");
//        Select s3=new Select(year);
//        s3.selectByIndex(10);
        selectDropDownValue(day,"17");
        selectDropDownValue(month,"3");
        selectDropDownValue(year,"2010");
        System.out.println(s1.isMultiple());
    }

    public static  void selectDropDownValue(WebElement element,String value){
        Select s=new Select(element);
        s.selectByValue(value);
    }
}
