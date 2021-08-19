package com.seleniummaster.excel;

import java.util.ArrayList;
import java.util.List;

public class ExcelWriteDemo {
    public static void main(String[] args) {
        ExcelUtility excelUtility=new ExcelUtility();
        List<String> contents=new ArrayList<>();
        contents.add("username,password");
        contents.add("testautomation,automation123!");
        contents.add("testautomation1,automation123!");
        contents.add("testautomation2,automation123!");
        excelUtility.writeToExcellCells("test-data/loginUser.xlsx",
                "User-Info",contents);

    }
}
