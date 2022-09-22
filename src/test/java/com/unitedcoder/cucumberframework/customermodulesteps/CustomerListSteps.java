package com.unitedcoder.cucumberframework.customermodulesteps;

import com.seleniummaster.cubecartautomation.TestBase;
import com.unitedcoder.pageobjectmodel.DashBoardPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class CustomerListSteps extends TestBase {
    DashBoardPage dashBoardPage;
    CustomersPage customersPage;
    @Given("user already on the DashBoard Page")
    public void userAlreadyOnTheDashBoardPage() {
        dashBoardPage = new DashBoardPage(driver);

    }

    @When("user click on Customers Link")
    public void userClickOnCustomersLink() {
        dashBoardPage.clickOnCustomersLink();
    }

    @And("user click on Add Customer button to fill out all necessary information")
    public void userClickOnAddCustomerButtonToFillOutAllNecessaryInformation() {
        customersPage = new CustomersPage(driver);
        customersPage.addCustomer();
    }

    @Then("new customer should be added")
    public void newCustomerShouldBeAdded() {
        Assert.assertTrue(customersPage.verifyCustomerAddedSuccessfully());
        dashBoardPage.clickOnLogoutButton();
    }

    @And("user click on edit icon to edit customer information")
    public void userClickOnEditIconToEditCustomerInformation() {
        customersPage = new CustomersPage(driver);
        customersPage.editSpecificCustomer();
    }

    @Then("customer information updated successfully")
    public void customerInformationUpdatedSuccessfully() {
        Assert.assertTrue(customersPage.verifyCustomerEditSuccessfully());
        dashBoardPage.clickOnLogoutButton();
    }

    @And("user click on delete icon to submit delete")
    public void userClickOnDeleteIconToSubmitDelete() {
        customersPage = new CustomersPage(driver);
        customersPage.deleteSpecificCustomer();
    }

    @Then("customer should be deleted successfully")
    public void customerShouldBeDeletedSuccessfully() {
        Assert.assertTrue(customersPage.verifyDeletedSuccessfully());
        dashBoardPage.clickOnLogoutButton();
    }
}