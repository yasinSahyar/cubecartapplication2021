package com.unitedcoder.testngframework;

import com.unitedcoder.pageobjectmodel.LoginPage;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ReadTestDataFromXMLFile {
    WebDriver driver;

    @Test
    @Parameters({"url","username","password"})
    public void login(String url, String username,String password){
        System.setProperty("webdriver.chrome.driver","c:\\webdriver\\chromedriver.exe");
        ChromeOptions chromeOptions=new ChromeOptions();
        chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
        driver.get(url);
        LoginPage loginPage=new LoginPage(driver);
        loginPage.login(username,password);


    }
}
