package com.unitedcoder.testngframework;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;

import java.util.ArrayList;
import java.util.List;

public class TestNGResultListener implements ITestListener {
    static List<ITestNGMethod> passedTest=new ArrayList<>();
    static List<ITestNGMethod> failedTest=new ArrayList<>();
    static List<ITestNGMethod> skippedTest=new ArrayList<>();
    ScreenShotUtility screenShotUtility=new ScreenShotUtility();
    @Override
    public void onTestStart(ITestResult iTestResult) {

    }

    @Override
    public void onTestSuccess(ITestResult iTestResult) {
        passedTest.add(iTestResult.getMethod());
        System.out.println("Total Passed Test: "+passedTest.size());

    }

    @Override
    public void onTestFailure(ITestResult iTestResult) {
        failedTest.add(iTestResult.getMethod());
        System.out.println("Total Failed Test: "+failedTest.size());
        screenShotUtility.takeScreenShot("screen-shot",iTestResult.getMethod().getMethodName(),
                (WebDriver)iTestResult.getTestContext().getAttribute("driver")
        );

    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {
        skippedTest.add(iTestResult.getMethod());
        System.out.println("Total Skipped Test: "+skippedTest.size());

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }

    @Override
    public void onStart(ITestContext iTestContext) {

    }

    @Override
    public void onFinish(ITestContext iTestContext) {

    }
}