package com.unitedcoder.api;

import io.restassured.path.json.JsonPath;
import org.testng.annotations.Test;

import java.util.List;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class RestApiTest {
    List<Integer> customerID=null;
    @Test
    public void getCategoryTest(){
        given().log().all().baseUri("http://ec2-18-237-72-27.us-west-2.compute.amazonaws.com:8080").
                auth().basic("testautomation1","automation123!").
                when().get("/category/1833").then().log().all().assertThat().statusCode(200)
                .body("id",equalTo(1833)).header("X-Frame-Options","DENY");
    }

    @Test
    public void getAllCustomerTest(){
        String responeData=given().baseUri("http://ec2-18-237-72-27.us-west-2.compute.amazonaws.com:8080")
                .auth().basic("testautomation1","automation123!")
                .when().get("/customers").then().assertThat().statusCode(200)
                .extract().response().asString();
        System.out.println(responeData);
        JsonPath js=new JsonPath(responeData);
        customerID= js.getList("id");
        System.out.println(customerID);
    }

    @Test(dependsOnMethods = {"getAllCustomerTest"})
    public void getSpecificCustomerTest(){
        given().log().all().baseUri("http://ec2-18-237-72-27.us-west-2.compute.amazonaws.com:8080")
                .auth().basic("testautomation1","automation123!")
                .when().get("/customer/"+customerID.get(2)+"").then().log().all().assertThat().statusCode(200);
    }
}
