package com.seleniummaster.excel;

import com.seleniummaster.classtutorial.LoginUser;
import com.seleniummaster.cubecartautomation.LoginPage;
import com.seleniummaster.cubecartautomation.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;

public class RoleBasedSecurityTest extends TestBase {
    public static void main(String[] args) {
        List<LoginUser> loginUser=ExcelUtility.readMultipleCellvalue("test-data/testdata.xlsx",
                "logi-info",1);
        System.setProperty("webdriver.chrome.driver","c:\\webdriver\\chromedriver.exe");
        ChromeOptions chromeOptions=new ChromeOptions();
        chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        //define chrome driver object instance
        driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
        driver.get("http://cubecart.unitedcoderschool.com/ecommerce/admin_w4vqap.php");
        for (LoginUser users : loginUser) {
            WebElement userNameElement = driver.findElement(By.name("username"));
            waitForElementPresent(userNameElement);
            userNameElement.sendKeys(users.getUserName());
            WebElement passwordElement = driver.findElement(By.id("password"));
            waitForElementPresent(passwordElement);
            passwordElement.sendKeys(users.getPassword());
            WebElement loginElement = driver.findElement(By.id("login"));
            waitForElementPresent(loginElement);
            loginElement.click();
            WebElement logoutIcon = driver.findElement(By.cssSelector("i.fa.fa-sign-out"));
            waitForElementPresent(logoutIcon);
            logoutIcon.click();
        }
        driver.close();
        driver.quit();

    }
}
