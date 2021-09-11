package com.unitedcoder.seleniumadvancedaction;

import com.unitedcoder.testngframework.ScreenShotUtility;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class AdvancedActionDemo2 {
    WebDriver driver;
    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","c:\\webdriver\\chromedriver.exe");
        ChromeOptions chromeOptions=new ChromeOptions();
        chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();

    }
    @Test
    public void dragAndDrop() throws InterruptedException {
        driver.get("https://jqueryui.com/droppable/");
        WebElement frame=driver.findElement(By.tagName("iframe"));
        driver.switchTo().frame(frame);
        WebElement draggable=driver.findElement(By.id("draggable"));
        WebElement dropable=driver.findElement(By.id("droppable"));
        Actions actions=new Actions(driver);
        //Thread.sleep(3000);
        waitForElementPresent(draggable);

       // actions.dragAndDrop(draggable,dropable).build().perform();//1.hil usuli
        // actions.clickAndHold(draggable).moveToElement(dropable).release().build().perform();//2.hil usul
        actions.dragAndDropBy(draggable,10,0).dragAndDrop(draggable,dropable).build().perform();//3.hil usul
        Thread.sleep(2000);
        Assert.assertTrue(dropable.getText().contains("Dropped"));

    }

    @Test
    public void menuSelection() throws InterruptedException {
        driver.get("https://jqueryui.com/menu/");
//        JavascriptExecutor js=(JavascriptExecutor)driver;
//        js.executeScript("window.scro11By(0,400)");
        WebElement frame=driver.findElement(By.cssSelector(".demo-frame"));
        driver.switchTo().frame(frame);
        WebElement musicMenu=driver.findElement(By.id("ui-id-9"));
        Actions actions=new Actions(driver);
        waitForElementPresent(musicMenu);
        actions.moveToElement(musicMenu).build().perform();
        WebElement rockMenu=driver.findElement(By.id("ui-id-10"));
        waitForElementPresent(rockMenu);
        actions.moveToElement(rockMenu).build().perform();
        WebElement alternative=driver.findElement(By.id("ui-id-11"));
        waitForElementPresent(alternative);
        Assert.assertTrue(alternative.getText().contains("Alternative"));//verify kilish uchun
        Thread.sleep(3000);

    }

    @Test
    public void selectItemsTest() throws InterruptedException {
        driver.get("https://jqueryui.com/selectable/");
        Thread.sleep(5000);
        WebElement frame=driver.findElement(By.tagName("iframe"));
        driver.switchTo().frame(frame);
        List<WebElement> items=driver.findElements(By.xpath("//*[@id=\"selectable\"]/li"));
        int clickCount=0;
        for(WebElement item:items){
            waitForElementPresent(item);
            item.click();
            clickCount++;
        }
        Assert.assertTrue(clickCount==items.size());
    }


    @Test
    public void multipleWindowTest(){
        driver.get("http://seleniummastertutorial.com/testfiles/windowtest.html");
        WebElement openWindowLink=driver.findElement(By.linkText("Open Window"));
        String currentWindow=driver.getWindowHandle();
        System.out.println("Current Window: "+currentWindow);
        openWindowLink.click();
        for(String childWindow: driver.getWindowHandles()) {
            if(!childWindow.equalsIgnoreCase(currentWindow)) {
                System.out.println("Child window name: " + childWindow);
                driver.switchTo().window(childWindow);
                WebElement confirmButton = driver.findElement(By.name("Abutton1"));
                Assert.assertTrue(confirmButton.isDisplayed());
            }
        }
    }


    @Test
    public void itearteMultipleWindows(){
        driver.get("http://seleniummastertutorial.com/testfiles/windowtest.html");
        WebElement openWindowLink=driver.findElement(By.linkText("Open Window"));
        openWindowLink.click();
        Set<String> windows=driver.getWindowHandles();
        Iterator<String> iterator=windows.iterator();
        String currentWindow=iterator.next();
        System.out.println("current Window is: "+currentWindow);
        String newWindow=iterator.next();
        System.out.println("new Window: "+newWindow);
        driver.switchTo().window(newWindow);
        WebElement confirmButton = driver.findElement(By.name("Abutton1"));
        Assert.assertTrue(confirmButton.isDisplayed());
    }

    @Test
    public void multipleLinkTest(){
        driver.get("https://jqueryui.com/");
        List<WebElement> links=driver.findElements(By.xpath("//*[@id=\"sidebar\"]//a"));
        List<String> urls=new ArrayList<>();
        for(WebElement eachLink:links){
            String url=eachLink.getAttribute("href");
            urls.add(url);
        }

        int count=0;
        for(String eachUrl:urls){
            driver.navigate().to(eachUrl);
            ScreenShotUtility screenShotUtility=new ScreenShotUtility();
            screenShotUtility.takeScreenShot("screen-shot",
                    eachUrl.replace("https://jqueryui.com/","")
                            .replaceAll("/",""),driver);
            count++;
            if(count>=10)
                break;
        }
        Assert.assertTrue(urls.size()>1);

    }



    @AfterClass
    public void tearDown(){
        driver.close();
        driver.quit();
    }
    public void waitForElementPresent(WebElement element){
        WebDriverWait wait=new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOf(element));
    }
}
