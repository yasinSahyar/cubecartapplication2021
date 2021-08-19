package com.seleniummaster.dropdownhandling;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class SelectClassDemo2 {
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
        Select s1=new Select(day);
        List<WebElement> opetions=s1.getOptions();
        for(int i=0;i<opetions.size();i++){
            System.out.println(opetions.get(i).getText());
            String dayValue=opetions.get(i).getText();
            if(dayValue.equalsIgnoreCase("18")){
                opetions.get(i).click();
                break;
            }
        }


    }

    public static  void selectDropDownValue(WebElement element,String value){
        Select s=new Select(element);
        s.selectByValue(value);
    }
}
