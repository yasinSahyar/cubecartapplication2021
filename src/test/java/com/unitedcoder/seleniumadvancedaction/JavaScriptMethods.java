package com.unitedcoder.seleniumadvancedaction;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaScriptMethods {
    public static void highlightElement(WebElement element, WebDriver driver){
        String bachGroundColor=element.getCssValue("backgroundColor");
        for (int i=0;i<10;i++){

        }
    }
    public static void changeColor(String color,WebElement element,WebDriver driver){
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("arguments[0].style.backgroundColor='"+color+"'",element);
    }
}
