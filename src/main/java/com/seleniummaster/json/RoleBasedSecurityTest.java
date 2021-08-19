package com.seleniummaster.json;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.seleniummaster.classtutorial.LoginUser;
import com.seleniummaster.cubecartautomation.TestBase;
import com.seleniummaster.excel.ExcelUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class RoleBasedSecurityTest extends TestBase {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "c:\\webdriver\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("http://cubecart.unitedcoderschool.com/ecommerce/admin_w4vqap.php?_g=customers&node=email");
        //for getting the sart time
        TestResult testResult = new TestResult();
        String startTime = DateTimeFunctions.getToday() + " " + DateTimeFunctions.getCurrentTime();
        testResult.setTestStartTime(startTime);
        //for current user
        testResult.setTestExcutedBy(DateTimeFunctions.getCurrentUser());

        ObjectMapper mapper = new ObjectMapper();
        Users loginUser = null;
        try {
            loginUser = mapper.readValue(new File("Json-Files\\users.json"), Users.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        List<TestResultObject> testResultObjects = new ArrayList<>();
        List<User> users = loginUser.getUser();
        for (User user : users) {
            TestResultObject testResultObject = new TestResultObject();
                testResultObject.setTestModule("Role-Based-Secutity-Test");
                testResultObject.setTestName("Login-Test");

                String testDate = DateTimeFunctions.getToday();
                testResultObject.setTestDate(testDate);
                String testTime = DateTimeFunctions.getCurrentTime();
                testResultObject.setTestTime(testTime);

                WebElement userNameField = driver.findElement(By.id("username"));
                String username = user.getUsername();
                userNameField.sendKeys(username);
                WebElement passwordField = driver.findElement(By.id("password"));
                String password = user.getPassword();
                passwordField.sendKeys(password);
                WebElement loginButton = driver.findElement(By.id("login"));
                loginButton.click();
                WebElement productLink = driver.findElement(By.id("nav_products"));
                if (productLink.isDisplayed()) {
                    System.out.println("Login test passed");
                    testResultObject.setTestStatus("Passed");
                } else {
                    System.out.println("Login test failed");
                    testResultObject.setTestStatus("Failed");
                }
                WebElement logOutIcon = driver.findElement(By.cssSelector("i.fa.fa-sign-out"));
                logOutIcon.click();
            testResultObjects.add(testResultObject);
        }
        driver.close();
        driver.quit();
        testResult.setTestEndTime(DateTimeFunctions.getToday() + " " + DateTimeFunctions.getCurrentTime());
        testResult.setTestResultObjects(testResultObjects);
        ObjectMapper mapper1=new ObjectMapper();
        try {
            mapper1.writeValue(new File("Json-Files\\LoginTestResult.json"),testResult);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
