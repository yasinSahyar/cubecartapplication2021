package com.seleniummaster.uiautomation;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch2 {
    public static void main(String[] args) throws InterruptedException {
        //define chromedriver location
        System.setProperty("webdriver.chrome.driver","c:\\webdriver\\chromedriver.exe");
        //define chrome driver object instance
        WebDriver driver=new ChromeDriver();
        //open google site
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
        //driver.navigate().to("https://www.google.com");
       //set browser size
        Thread.sleep(2000);
        Dimension dimension=new Dimension(600,700);
        driver.manage().window().setSize(dimension);
        Thread.sleep(3000);
        Point point=new Point(300,500);
        driver.manage().window().setPosition(point);
        WebElement serachBox=driver.findElement(By.name("q"));
        Point p1=serachBox.getLocation();
        int xCordinate=p1.getX();
        int yCordinate=p1.getY();
        System.out.println(xCordinate);
        System.out.println(yCordinate);



    }
}
