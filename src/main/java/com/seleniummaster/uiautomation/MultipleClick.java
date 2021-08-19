package com.seleniummaster.uiautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleClick {
    public static void main(String[] args) throws InterruptedException {
        //define chromedriver location
        System.setProperty("webdriver.chrome.driver","c:\\webdriver\\chromedriver.exe");
        //define chrome driver object instance
        WebDriver driver=new ChromeDriver();
        //open google site
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        //driver.navigate().to("https://www.google.com");
        //search
        driver.findElement(By.id("divpaxinfo")).click();
        for(int i=1;i<5;i++) {// 1 2 3 4
            Thread.sleep(2000);
            driver.findElement(By.id("hrefIncAdt")).click();
        }
        driver.close();//close current browser
        driver.quit();//all driver instance



    }
}
