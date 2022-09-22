package com.unitedcoder.cucumberframework.inventorymodulesteps;

import com.seleniummaster.cubecartautomation.TestBase;
import com.unitedcoder.pageobjectmodel.DashBoardPage;
import com.unitedcoder.pageobjectmodel.ProductsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class ProductsSteps extends TestBase {
    DashBoardPage dashBoardPage;
    private String productName;
    private String productCode;
    ProductsPage productsPage;
    @Given("Admin user already on the DashBoard Page")
    public void adminUserAlreadyOnTheDashBoardPage() {
        dashBoardPage = new DashBoardPage(driver);
    }

    @When("user click on products link")
    public void userClickOnProductsLink() {
        dashBoardPage.clickOnProductsLink();
    }

    @And("user click on add product link to fill out {string} {string} and other related information")
    public void userClickOnAddProductLinkToFillOutAndOtherRelatedInformation(String arg0, String arg1) {
        productName = arg0;
        productCode = arg1;
        productsPage = new ProductsPage(driver);
        productsPage.addProducts(productName,productCode);

    }

    @Then("product should be added successfully")
    public void productShouldBeAddedSuccessfully() {
        Assert.assertTrue(productsPage.verifyNewProductAdded());
    }


}