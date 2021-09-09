package com.unitedcoder.pageobjectmodel;

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
    String customerName;

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
    @FindBy(xpath="//*[@id=\"customer-list\"]/table/tbody/tr/td[7]/a[3]")
    WebElement deleteIcon;
    @FindBy(xpath = "//*[contains(text(),'Customer successfully deleted.')]")
    WebElement deletedSuccessfullyMessage;
    @FindAll(
            @FindBy(xpath = "//*[@id=\"customer-list\"]/table/tbody/tr")
    )
    List<WebElement> customerLists;
    @FindBy(xpath = "//*[@id=\"customer-list\"]/table")
    WebElement customerListTable;

    public CustomersPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
        testUtility=new TestUtility(driver);
    }

    public void addCustomer(){
        testUtility.waitForElementPresent(addCustomersButton);
        addCustomersButton.click();
        testUtility.waitForElementPresent(statusCheckBox);
        statusCheckBox.click();
        testUtility.waitForElementPresent(firstNameField);
        customerName=testUtility.generateFakeFirstName();
        firstNameField.sendKeys(customerName);
        testUtility.waitForElementPresent(lastNameField);
        lastNameField.sendKeys(testUtility.generateFakeLastName());
        testUtility.waitForElementPresent(emailField);
        emailField.sendKeys(testUtility.randomElaiAddress());
        testUtility.waitForElementPresent(saveButton);
        saveButton.click();
    }


    public void addCustomer(String firstName,String lastName,String email){
        testUtility.waitForElementPresent(addCustomersButton);
        addCustomersButton.click();
        testUtility.waitForElementPresent(statusCheckBox);
        statusCheckBox.click();
        testUtility.waitForElementPresent(firstNameField);
        firstNameField.sendKeys(firstName);
        testUtility.waitForElementPresent(lastNameField);
        lastNameField.sendKeys(lastName);
        testUtility.waitForElementPresent(emailField);
        emailField.sendKeys(email);
        testUtility.waitForElementPresent(saveButton);
        saveButton.click();
    }



    public boolean verifyCustomerAddedSuccessfully(){
        testUtility.waitForElementPresent(successMesseage);
        return successMesseage.isDisplayed();
    }

    public void deleteSpecificCustomer(){
        List<WebElement> customerLists=driver.findElements(By.xpath("//*[@id=\"customer-list\"]/table/tbody/tr"));
        String beforeXpath="//*[@id='customer-list']/table/tbody/tr[";
        String afterXpath="]/td[3]/a";
        System.out.println("CustomerName is: "+customerName);
        testUtility.sleep(3);
        for(int i=1;i<customerLists.size();i++){
            String customerText=driver.findElement(By.xpath(beforeXpath+i+afterXpath)).getText();
            if(customerText.contains(customerName)){
                WebElement deleteIcon=driver.findElement(By.xpath("//*[@id='customer-list']/table/tbody/tr["+i+"]/td[7]/a[3]/i"));
                deleteIcon.click();
                Alert alert=driver.switchTo().alert();
                alert.accept();
            }
        }
    }
    public void deleteCustomer(){
        testUtility.sleep(2);
        testUtility.waitForElementPresent(deleteIcon);
        deleteIcon.click();
        testUtility.waitForAlertPresent();
        Alert alert=driver.switchTo().alert();
        alert.accept();
    }

    public boolean verifyDeletedSuccessfully(){
        testUtility.waitForElementPresent(deletedSuccessfullyMessage);
        return deletedSuccessfullyMessage.isDisplayed();
    }

    public boolean viewCustomers(){
        testUtility.waitForElementPresent(customerListTable);
        return customerLists.size()>1;

    }
}
