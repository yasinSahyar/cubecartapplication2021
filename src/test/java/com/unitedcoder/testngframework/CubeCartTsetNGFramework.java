package com.unitedcoder.testngframework;

import com.seleniummaster.configproperties.ApplicationConfigDemo;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import java.nio.charset.Charset;
import java.util.List;
import java.util.Random;

@Listeners(TestNGResultListener.class)
class CubeCarTestNGFramework {

    static WebDriver driver;

    static String url= ApplicationConfigDemo.readFromPropertiesFile("config.properties","qaurl");
    static String username=ApplicationConfigDemo.readFromPropertiesFile("config.properties","username");
    static String password=ApplicationConfigDemo.readFromPropertiesFile("config.properties","password");
    @BeforeClass(alwaysRun = true)
    public void setUp(ITestContext context){
        System.setProperty("webdriver.chrome.driver","c:\\webdriver\\chromedriver.exe");
        ChromeOptions chromeOptions=new ChromeOptions();
        chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        //define chrome driver object instance
        driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
        driver.get(url);
        context.setAttribute("driver",driver);
        WebElement userNameElement= driver.findElement(By.name("username"));
        userNameElement.sendKeys(username);
        WebElement passwordElement=driver.findElement(By.id("password"));
        passwordElement.sendKeys(password);
        WebElement loginElement=driver.findElement(By.id("login"));
        loginElement.click();
    }
    @Test(groups = {"smoke test"})
    public void viewCustomers(){
        WebElement customerListLink=driver.findElement(By.linkText("Customer List"));
        customerListLink.click();
        List<WebElement> customerLists=driver.findElements(By.xpath("//*[@id=\"customer-list\"]/table/tbody/tr"));
        System.out.println("Customer size is: "+customerLists.size());
        Assert.assertTrue(customerLists.size()>1);
    }

    @Test(groups = {"smoke test"})
    public void addProduct(){
        WebElement productLink=driver.findElement(By.id("nav_products"));
        waitUntilElementIsVisible(productLink);
        productLink.click();

        WebElement addProductLink=driver.findElement(By.linkText("Add Product"));
        waitUntilElementIsVisible(addProductLink);
        addProductLink.click();

        WebElement productNameElement=driver.findElement(By.name("name"));
        waitUntilElementIsVisible(productNameElement);
        productNameElement.sendKeys("Java"+System.currentTimeMillis());

        WebElement productCondition=driver.findElement(By.id("condition"));
        waitUntilElementIsVisible(productCondition);
        Select productConditionSelect=new Select(productCondition);
        //productConditionSelect.selectByVisibleText(product.getCondition());
        //productConditionSelect.selectByVisibleText(DropDownContent.Refurbished.name());

        WebElement productCodeElement=driver.findElement(By.id("product_code"));
        waitUntilElementIsVisible(productCodeElement);
        byte[] array = new byte[7]; // length is bounded by 7
        new Random().nextBytes(array);
        String generatedString = new String(array, Charset.forName("UTF-8"));
        productCodeElement.sendKeys(generatedString);
        System.out.println("Random String is: "+generatedString);
        WebElement saveButton=driver.findElement(By.cssSelector("input[value='Save']"));
        waitUntilElementIsVisible(saveButton);
        saveButton.click();
        WebElement successMessage=driver.findElement(By.cssSelector("div.success"));
        waitUntilElementIsVisible(successMessage);
        Assert.assertTrue(successMessage.isDisplayed());
    }

    @AfterClass(alwaysRun = true)
    public void tearDown(){
        driver.close();
        driver.quit();
    }
    public static void waitUntilElementIsVisible(WebElement webElement)
    {
        WebDriverWait webDriverWait=new WebDriverWait(driver,30);
        webDriverWait.until(ExpectedConditions.visibilityOf(webElement));
    }
}