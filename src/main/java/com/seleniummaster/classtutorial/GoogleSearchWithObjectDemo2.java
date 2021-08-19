package com.seleniummaster.classtutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class GoogleSearchWithObjectDemo2 {
    public static void main(String[] args) throws InterruptedException {
        //1.define chrome driver Location
        System.setProperty("webdriver.chrome.driver","c:\\webdriver\\chromedriver.exe");
        //2.define chrome driver object instance
        WebDriver driver = new ChromeDriver();
        //3.Open Google site
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
       //define search words
        List<SearchWord> wordList=new ArrayList<>();
        wordList.add(new SearchWord("Java Tutorial"));
        wordList.add(new SearchWord("Washington DC"));
        wordList.add(new SearchWord("Turkey"));
        wordList.add(new SearchWord("Japan"));
        wordList.add(new SearchWord("New York"));
        wordList.add(new SearchWord("London, UK"));

        for (SearchWord word: wordList) {
            System.out.println(word.toString());
            driver.findElement(By.name("q")).sendKeys(word.getWord()+ Keys.ENTER);
            Thread.sleep(3000);
            WebElement resutlElement=driver.findElement(By.id("result-stats"));
            if(resutlElement.isDisplayed())
                System.out.println(String.format("%s search is successful",word.getWord()));
            else
            {
                System.out.println(String.format("%s search is failed",word.getWord()));
            }
            driver.navigate().back();
        }
        driver.close();//close current browser
        driver.quit();//all driver instance

    }
}
