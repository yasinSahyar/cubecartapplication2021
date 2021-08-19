package com.seleniummaster.excel;

import java.util.ArrayList;
import java.util.List;

public class TestReportWithExcel {
    public static void main(String[] args) {
        List<String> testResult=new ArrayList<>();
        testResult.add("testID,TestName,testModule,testType,testStatus,excutedBy,excutedOn");
        testResult.add("1,Add-Customer,Customer,Regression,Passed,Aynigar,2021-08-10");
        testResult.add("2,Add-Category,Customer,Regression,Passed,Aynigar,2021-08-10");
        testResult.add("3,Add-Newsletter,Customer,Regression,Passed,Aynigar,2021-08-10");
        ExcelUtility excelUtility=new ExcelUtility();
        excelUtility.writeToExcellCells("test-data/cubecartTestReport.xlsx",
                "Report",testResult);
    }
}
