package com.seleniummaster.io;

import org.apache.commons.io.FileUtils;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import java.io.File;
import java.io.IOException;

public class FileWriteDemo2 {
    public static void main(String[] args) {
        String content="Test Passed";
        DateTime time=new DateTime();
        DateTimeFormatter format=DateTimeFormat.forPattern("yyyy-MM-dd-HH-mm-SS");
        String timeStamp=time.toString(format);
        String fileName="testReport"+timeStamp+".txt";
        File myFile=new File("Test-Result"+File.separator+fileName);
        try {
            FileUtils.writeStringToFile(myFile,content);
            //FileUtils.writeStringToFile(myFile,content, Charset.defaultCharset());
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
