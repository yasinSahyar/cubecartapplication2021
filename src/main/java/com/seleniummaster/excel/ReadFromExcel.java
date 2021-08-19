package com.seleniummaster.excel;

public class ReadFromExcel {
    public static void main(String[] args) {
        String username=ExcelUtility.readFromExcell("test-data/testdata.xlsx",
                "logi-info",1,0);
        System.out.println(username);
        String password=ExcelUtility.readFromExcell("test-data/testdata.xlsx",
                "logi-info",1,1);
        System.out.println(password);
    }
}
