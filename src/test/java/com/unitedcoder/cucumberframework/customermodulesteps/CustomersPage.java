package com.unitedcoder.cucumberframework.customermodulesteps;

import com.unitedcoder.helperclass.HelperClass;
import com.unitedcoder.pageobjectmodel.TestUtility;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CustomersPage {
    WebDriver driver;
    TestUtility testUtility;
    HelperClass helperClass;



    public CustomersPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
        testUtility=new TestUtility(driver);
        helperClass=new HelperClass();

    }

    @FindBy(linkText = "Add Customer")
    WebElement addCustomersButton;
    @FindBy(xpath = "//img[@class=\"checkbox\"]")
    WebElement statusCheckBox;
    @FindBy(id="cust-title")
    WebElement titleField;
    @FindBy(id="cust-firstname")
    WebElement firstNameField;
    @FindBy(id="cust-lastname")
    WebElement lastNameField;
    @FindBy(id="cust-email")
    WebElement emailField;
    @FindBy(name="save")
    WebElement saveButton;
    @FindBy(css="div.success")
    WebElement successMesseage;
    @FindBy(xpath = "//*[@id=\"gui_message\"]/div")
    WebElement editSuccessMessage;
    @FindBy(xpath="//*[@id=\"customer-list\"]/table/tbody/tr/td[7]/a[3]")
    WebElement deleteIcon;
    @FindBy(xpath = "//*[contains(text(),'Customer successfully deleted.')]")
    WebElement deletedSuccessfullyMessage;
    @FindAll(
            @FindBy(xpath = "//*[@id=\"customer-list\"]/table/tbody/tr")
    )
    List<WebElement> customerLists;
    @FindBy(xpath ="//*[@id=\"customer-list\"]/table" )
    WebElement customerListTable;

    public void addCustomer(){
        testUtility.waitForElementPresent(addCustomersButton);
        addCustomersButton.click();
        testUtility.waitForElementPresent(statusCheckBox);
        statusCheckBox.click();
        testUtility.waitForElementPresent(firstNameField);
        firstNameField.sendKeys(helperClass.getFirstName());
        testUtility.waitForElementPresent(lastNameField);
        lastNameField.sendKeys(helperClass.getLastName());
        testUtility.waitForElementPresent(emailField);
        emailField.sendKeys(helperClass.getEmailAddress());
        testUtility.waitForElementPresent(saveButton);
        saveButton.click();
    }

    public boolean verifyCustomerAddedSuccessfully(){
        testUtility.waitForElementPresent(successMesseage);
        return successMesseage.isDisplayed();
    }

    public void editSpecificCustomer(){
        List<WebElement> customerLists=driver.findElements(By.xpath("//*[@id=\"customer-list\"]/table/tbody/tr"));
        String beforeXpath="//*[@id='customer-list']/table/tbody/tr[";
        String afterXpath="]/td[3]/a";
        System.out.println("CustomerName is: "+helperClass.getFirstName());
        testUtility.sleep(3);
        for(int i=1;i<customerLists.size();i++){
            String customerText=driver.findElement(By.xpath(beforeXpath+i+afterXpath)).getText();
            if(customerText.contains(helperClass.getFirstName())){
                WebElement editIcon=driver.findElement(By.xpath("//*[@id='customer-list']/table/tbody/tr[\"+i+\"]/td[7]/a[2]/i"));
                editIcon.click();
                testUtility.sleep(5);
                testUtility.waitForElementPresent(emailField);
                emailField.clear();
                emailField.sendKeys(testUtility.randomElaiAddress());
                testUtility.waitForElementPresent(saveButton);
                saveButton.click();
                break;

            }
        }
    }

    public boolean verifyCustomerEditSuccessfully(){
        testUtility.waitForElementPresent(editSuccessMessage);
        return successMesseage.isDisplayed();
    }

    public void deleteSpecificCustomer(){
        List<WebElement> customerLists=driver.findElements(By.xpath("//*[@id=\"customer-list\"]/table/tbody/tr"));
        String beforeXpath="//*[@id='customer-list']/table/tbody/tr[";
        String afterXpath="]/td[3]/a";
        System.out.println("CustomerName is: "+helperClass.getFirstName());
        testUtility.sleep(3);
        for(int i=1;i<customerLists.size();i++){
            String customerText=driver.findElement(By.xpath(beforeXpath+i+afterXpath)).getText();
            if(customerText.contains(helperClass.getFirstName())){
                WebElement deleteIcon=driver.findElement(By.xpath("//*[@id='customer-list']/table/tbody/tr["+i+"]/td[7]/a[3]/i"));
                deleteIcon.click();
                Alert alert=driver.switchTo().alert();
                alert.accept();
            }
        }
    }

    public boolean verifyDeletedSuccessfully(){
        testUtility.waitForElementPresent(deletedSuccessfullyMessage);
        return deletedSuccessfullyMessage.isDisplayed();
    }



}