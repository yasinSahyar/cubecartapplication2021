package com.seleniummaster.uiautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch3 {
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
        String searchResult=result.getText();
        System.out.println(searchResult);
        int beginIndex=searchResult.indexOf("(");
        searchResult=searchResult.substring(0,beginIndex-1);
        System.out.println(searchResult);
        searchResult=searchResult.replace("Yaklaşık","")
                .replace("sonuç bulundu","").trim().replace(".","");
        System.out.println(searchResult);
        //searchResult=searchResult.replace(".","");
        if(Integer.parseInt(searchResult)>=1000000){
            System.out.println("Test Passed, search result correct");
        }
        else
            System.out.println("Test Failed");
       driver.close();//close current browser
       driver.quit();//all driver instance



    }
}
