package com.seleniummaster.cubecartautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CategoriesPage extends TestBase {

    public void clickOnAddCategoryButton(){
        WebElement addCategoryButton=driver.findElement(By.linkText("Add Category"));
        waitForElementPresent(addCategoryButton);
        addCategoryButton.click();
    }

    public void fillCategoryDetails(){
        WebElement statusCheckBox=driver.findElement(By.xpath("(//img[@class=\"checkbox\"])[1]"));
        waitForElementPresent(statusCheckBox);
        statusCheckBox.click();
        WebElement visibleCheckBox=driver.findElement(By.xpath("(//img[@class=\"checkbox\"])[2]"));
        waitForElementPresent(visibleCheckBox);
        visibleCheckBox.click();
        WebElement categoryNameField=driver.findElement(By.id("name"));
        categoryNameField.sendKeys("Cat"+System.currentTimeMillis());
        WebElement saveButton=driver.findElement(By.id("cat_save"));
        saveButton.click();
    }
    public void fillCategoryDetails(String categoryName){
        WebElement statusCheckBox=driver.findElement(By.xpath("(//img[@class=\"checkbox\"])[1]"));
        waitForElementPresent(statusCheckBox);
        statusCheckBox.click();
        WebElement visibleCheckBox=driver.findElement(By.xpath("(//img[@class=\"checkbox\"])[2]"));
        waitForElementPresent(visibleCheckBox);
        visibleCheckBox.click();
        WebElement categoryNameField=driver.findElement(By.id("name"));
        categoryNameField.sendKeys(categoryName);
        WebElement saveButton=driver.findElement(By.id("cat_save"));
        saveButton.click();
    }
}
