package com.seleniummaster.json;

import io.restassured.path.json.JsonPath;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class VerifyJsonContent {
    public static void main(String[] args) {
        FileInputStream inputStream= null;
        try {
            inputStream = new FileInputStream("Json-Files/course-info.json");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        JsonPath jsonPath=new JsonPath(inputStream);
        int courseSize=jsonPath.getInt("courses.size()");
        System.out.println("Total course size is: "+courseSize);
        int amount=jsonPath.getInt("dashboard.purchaseAmount");
        System.out.println("Total amount of courses is "+amount);
        String firstCourseTitle=jsonPath.get("courses[0].title");
        System.out.println(firstCourseTitle);
        System.out.println("i");
        int sum=0;
        for(int i=0;i<courseSize;i++){
            int price=jsonPath.getInt("courses["+i+"].price");//course[0] course[1] course[2]
            int copies=jsonPath.getInt("courses["+i+"].copies");
            int amount1=price*copies;
            sum+=amount1;
        }
        System.out.println(sum);
        if(sum==amount)
            System.out.println("Correct purchase amount calculation");
        else
            System.out.println("Incorrect purchase amount calculation");



    }
}
