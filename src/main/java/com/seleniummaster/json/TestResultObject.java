package com.seleniummaster.json;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TestResultObject {
    @JsonProperty("test-name")
    private String testName;
    @JsonProperty("test-module")
    private String testModule;
    @JsonProperty("test-date")
    private String testDate;
    @JsonProperty("test-time")
    private String testTime;
    @JsonProperty("test-status")
    private String testStatus;

    public TestResultObject(String testName, String testModule, String testDate, String testTime, String testStatus) {
        this.testName = testName;
        this.testModule = testModule;
        this.testDate = testDate;
        this.testTime = testTime;
        this.testStatus = testStatus;
    }

    public TestResultObject() {
    }

    public String getTestName() {
        return testName;
    }

    public void setTestName(String testName) {
        this.testName = testName;
    }

    public String getTestModule() {
        return testModule;
    }

    public void setTestModule(String testModule) {
        this.testModule = testModule;
    }

    public String getTestDate() {
        return testDate;
    }

    public void setTestDate(String testDate) {
        this.testDate = testDate;
    }

    public String getTestTime() {
        return testTime;
    }

    public void setTestTime(String testTime) {
        this.testTime = testTime;
    }

    public String getTestStatus() {
        return testStatus;
    }

    public void setTestStatus(String testStatus) {
        this.testStatus = testStatus;
    }
}
