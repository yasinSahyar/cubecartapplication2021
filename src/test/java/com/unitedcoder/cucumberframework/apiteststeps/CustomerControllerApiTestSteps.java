package com.unitedcoder.cucumberframework.apiteststeps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class CustomerControllerApiTestSteps {

    Response response;

    @Given("user should be able to send request for get specific customer information")
    public void userShouldBeAbleToSendRequestForGetSpecificCustomerInformation() {
        response =given().log().all().baseUri("http://ec2-18-237-72-27.us-west-2.compute.amazonaws.com:8080")
                .auth().basic("testautomation1","automation123!").when().get("/customer/318");
    }

    @Then("user should get specific customer information as response")
    public void userShouldGetSpecificCustomerInformationAsResponse() {
        response.then().log().all().assertThat().statusCode(200).body("id",equalTo(318));
    }

}