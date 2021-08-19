package com.seleniummaster.csvfile;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class CsvFileWriteDemo {
    public static void main(String[] args) {
        StringBuilder content=new StringBuilder();
        content.append("TestID,TestModule,TestType,TestStatus").append("\n");
        content.append("1,Customer,Regression,Passed").append("\n");
        content.append("2,Category,Smoke Test,Passed");
        File file=new File("Test-Result"+File.separator+"test-result.csv");
        try {
            FileUtils.writeStringToFile(file,content.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
