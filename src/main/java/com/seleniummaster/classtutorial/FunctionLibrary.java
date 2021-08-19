package com.seleniummaster.classtutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FunctionLibrary {
   public WebDriver driver;
    public void openBrowser(String url)
    {
        System.setProperty("webdriver.chrome.driver","c:\\webdriver\\chromedriver.exe");
        ChromeOptions chromeOptions=new ChromeOptions();
        chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        //define chrome driver object instance
        driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
        driver.get(url);
    }
    public boolean login(LoginUser loginUser)
    {
       WebElement userNameElement= driver.findElement(By.name("username"));
        waitUntilElementIsVisible(userNameElement);
        userNameElement.sendKeys(loginUser.getUserName());

        WebElement passwordElement=driver.findElement(By.id("password"));
        waitUntilElementIsVisible(passwordElement);
        passwordElement.sendKeys(loginUser.getPassword());

        WebElement loginElement=driver.findElement(By.id("login"));
        waitUntilElementIsVisible(loginElement);
        loginElement.click();

        WebElement logoutIcon=driver.findElement(By.cssSelector("i.fa.fa-sign-out"));
        waitUntilElementIsVisible(logoutIcon);
        if(logoutIcon.isDisplayed())
        {
            System.out.println("user logged in");
            return true;
        }
        else {
            System.out.println("user login failed");
            return false;
        }
    }

    public boolean addProduct(Product product)
    {
        WebElement productLink=driver.findElement(By.id("nav_products"));
        waitUntilElementIsVisible(productLink);
        productLink.click();

        WebElement addProductLink=driver.findElement(By.linkText("Add Product"));
        waitUntilElementIsVisible(addProductLink);
        addProductLink.click();

        WebElement productNameElement=driver.findElement(By.name("name"));
        waitUntilElementIsVisible(productNameElement);
        productNameElement.sendKeys(product.getName());

        WebElement productCondition=driver.findElement(By.id("condition"));
        waitUntilElementIsVisible(productCondition);
        Select productConditionSelect=new Select(productCondition);
        //productConditionSelect.selectByVisibleText(product.getCondition());
        //productConditionSelect.selectByVisibleText(DropDownContent.Refurbished.name());

        WebElement productCodeElement=driver.findElement(By.id("product_code"));
        waitUntilElementIsVisible(productCodeElement);
        productCodeElement.sendKeys(product.getCode());

        WebElement saveButton=driver.findElement(By.cssSelector("input[value='Save']"));
        waitUntilElementIsVisible(saveButton);
        saveButton.click();

        WebElement successMessage=driver.findElement(By.cssSelector("div.success"));
        waitUntilElementIsVisible(successMessage);
        if(successMessage.isDisplayed())
        {
            System.out.println("Product is added successfully ");
            System.out.println(product.toString());
            return true;
        }
        else
        {
            System.out.println("add product failed");
            return  false;
        }
    }

    public void logout()
    {
        WebElement logoutIcon=driver.findElement(By.cssSelector("i.fa.fa-sign-out"));
        logoutIcon.click();
    }

    public void closeBrowser()
    {
        driver.close();
        driver.quit();
    }
    //wait until element is visible
    public void waitUntilElementIsVisible(WebElement webElement)
    {
        WebDriverWait webDriverWait=new WebDriverWait(driver,30);
        webDriverWait.until(ExpectedConditions.visibilityOf(webElement));
    }


}
