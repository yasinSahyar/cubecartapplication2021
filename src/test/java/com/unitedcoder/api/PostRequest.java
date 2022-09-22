package com.unitedcoder.api;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class PostRequest {
    @Test
    public void createCategoryTest(){
        given().log().all().baseUri("http://ec2-18-237-72-27.us-west-2.compute.amazonaws.com:8080")
                .auth().basic("testautomation1","automation123!").
                header("Content-Type","application/json").body("{\n" +
                "  \"catDescription\": \"string\",\n" +
                "  \"catImage\": 0,\n" +
                "  \"catName\": \"Books123\",\n" +
                "  \"catParentId\": 0,\n" +
                "  \"hide\": 0,\n" +
                "  \"id\": 0,\n" +
                "  \"itemIntShip\": 0,\n" +
                "  \"itemShip\": 0,\n" +
                "  \"perIntShip\": 0,\n" +
                "  \"perShip\": 0,\n" +
                "  \"priority\": 0,\n" +
                "  \"seoMetaDescription\": \"string\",\n" +
                "  \"seoMetaKeywords\": \"string\",\n" +
                "  \"seoMetaTitle\": \"string\",\n" +
                "  \"status\": 0\n" +
                "}")
                .when().post("/category").then().assertThat().statusCode(200)
                .header("X-Frame-Options","DENY")
                .body("catName",equalTo("Books123"));
    }
}
