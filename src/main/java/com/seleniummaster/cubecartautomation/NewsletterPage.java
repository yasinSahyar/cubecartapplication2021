package com.seleniummaster.cubecartautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class NewsletterPage extends TestBase {

    public void clickOnCreateNewsletterButton(){
        WebElement createButton=driver.findElement(By.linkText("Create Newsletter"));
        waitForElementPresent(createButton);
        createButton.click();
    }

    public void fillNewsletterInfo(){
        WebElement subject=driver.findElement(By.id("email_subject"));
        waitForElementPresent(subject);
        subject.sendKeys("Java");
        WebElement contentButton=driver.findElement(By.xpath("//div[@id=\"tab_email_html\"]/a"));
        waitForElementPresent(contentButton);
        contentButton.click();
        sleep(3);
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"cke_1_contents\"]/iframe")));
        WebElement field=driver.findElement(By.xpath("/html/body"));
        sleep(2);
        field.sendKeys("book");
        driver.switchTo().defaultContent();
        driver.findElement(By.xpath("(//input[@type=\"submit\"])[5]")).click();

    }
}
