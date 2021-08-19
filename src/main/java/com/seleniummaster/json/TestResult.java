package com.seleniummaster.json;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class TestResult {
    @JsonProperty("tests")
    private List<TestResultObject> testResultObjects;
    @JsonProperty("test-start-time")
    private String testStartTime;
    @JsonProperty("test-end-time")
    private String testEndTime;
    @JsonProperty("test-executed-By")
    private String testExcutedBy;
    public TestResult() {
    }

    public TestResult(List<TestResultObject> testResultObjects, String testStartTime, String testEndTime, String testExcutedBy) {
        this.testResultObjects = testResultObjects;
        this.testStartTime = testStartTime;
        this.testEndTime = testEndTime;
        this.testExcutedBy = testExcutedBy;
    }

    public List<TestResultObject> getTestResultObjects() {
        return testResultObjects;
    }

    public void setTestResultObjects(List<TestResultObject> testResultObjects) {
        this.testResultObjects = testResultObjects;
    }

    public String getTestStartTime() {
        return testStartTime;
    }

    public void setTestStartTime(String testStartTime) {
        this.testStartTime = testStartTime;
    }

    public String getTestEndTime() {
        return testEndTime;
    }

    public void setTestEndTime(String testEndTime) {
        this.testEndTime = testEndTime;
    }

    public String getTestExcutedBy() {
        return testExcutedBy;
    }

    public void setTestExcutedBy(String testExcutedBy) {
        this.testExcutedBy = testExcutedBy;
    }
}
