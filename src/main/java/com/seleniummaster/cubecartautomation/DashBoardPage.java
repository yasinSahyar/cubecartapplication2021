package com.seleniummaster.cubecartautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class DashBoardPage extends TestBase {
     public void logout(){
         WebElement logoutIcon=driver.findElement(By.cssSelector("i.fa.fa-sign-out"));
         waitForElementPresent(logoutIcon);
         logoutIcon.click();
     }
     public void clickOnCategoriesLink(){
         WebElement categoryLink=driver.findElement(By.id("nav_categories"));
         waitForElementPresent(categoryLink);
         categoryLink.click();
     }

     public void clickOnNewslettersLink(){
         WebElement newsLetterLink=driver.findElement(By.linkText("Newsletters"));
         waitForElementPresent(newsLetterLink);
         newsLetterLink.click();
     }
}
