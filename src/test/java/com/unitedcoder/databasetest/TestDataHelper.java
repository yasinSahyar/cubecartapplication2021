package com.unitedcoder.databasetest;

public class TestDataHelper {
    private String productName;

    public TestDataHelper(String productName) {
        this.productName = productName;
    }

    public TestDataHelper() {
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductName() {
        return productName;
    }
}