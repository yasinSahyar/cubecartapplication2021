package com.unitedcoder.pageobjectmodel;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CategoriesPage {
    WebDriver driver;
    TestUtility utility;

    @FindBy(xpath="//*[@id=\"categories\"]/table/tbody/tr[3]/td[7]/a[4]")
    WebElement deleteIcon;
    @FindBy(xpath = "//*[contains(text(),'Category successfully deleted.')]")
    WebElement deletedSuccessfullyMessage;

    public CategoriesPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
        utility=new TestUtility(driver);

    }

    public void deleteCategory(){
        utility.waitForElementPresent(deleteIcon);
        deleteIcon.click();
        utility.waitForAlertPresent();
        Alert alert=driver.switchTo().alert();
        alert.accept();
    }

    public boolean verifyCategoryDeletedSuccessfully(){
        utility.waitForElementPresent(deletedSuccessfullyMessage);
        return deletedSuccessfullyMessage.isDisplayed();
    }
}
