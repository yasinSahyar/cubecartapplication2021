package com.seleniummaster.json;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class JsonSerilization {
    public static void main(String[] args) {
        List<Api> apiCourses=new ArrayList<>();
        Api api=new Api("RestAssured-api-testing",100);
        apiCourses.add(api);
        apiCourses.add(new Api("SoupUI-api-testing",100));

        List<WebAutomation> webAutomationCourses=new ArrayList<>();
        webAutomationCourses.add(new WebAutomation("Selenium-Webdriver-java",50));
        webAutomationCourses.add(new WebAutomation("Cypress",50));
        webAutomationCourses.add(new WebAutomation("BDD-Cucumber-java",50));

        Courses courses=new Courses(webAutomationCourses,apiCourses);
        CourseInfo courseInfo=new CourseInfo("SDET training","Automation",
                "Dolkun Tarim","https://www.linkedIn.com",
                "https://seleniummaster.teachable.com/",courses);

        ObjectMapper objectMapper=new ObjectMapper();
        try {
            objectMapper.writeValue(new File("Json-Files\\Course-Detail.json"),
                    courseInfo);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
