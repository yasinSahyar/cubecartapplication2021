package com.seleniummaster.uiautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch1 {
    public static void main(String[] args) throws InterruptedException {
        //define chromedriver location
        System.setProperty("webdriver.chrome.driver","c:\\webdriver\\chromedriver.exe");
        //define chrome driver object instance
        WebDriver driver=new ChromeDriver();
        //open google site
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
        //driver.navigate().to("https://www.google.com");
        //search
        driver.findElement(By.name("q")).sendKeys("Java"+ Keys.ENTER);
        WebElement result=driver.findElement(By.id("result-stats"));
        if(result.isDisplayed())
            System.out.println("Google search Test Pass");
        else
            System.out.println("Google search test faile");
        driver.close();//close current browser
        driver.quit();//all driver instance



    }
}
