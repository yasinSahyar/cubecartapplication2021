package com.seleniummaster.io;

import org.apache.commons.io.FileUtils;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import java.io.File;
import java.io.IOException;

public class FileWriteDemo3 {

    public static String getFileName() {
        DateTime time = new DateTime();
        DateTimeFormatter format = DateTimeFormat.forPattern("yyyy-MM-dd-HH-mm-SS");
        String timeStamp = time.toString(format);
        String fileName = "test-data" + timeStamp + ".txt";
        StringBuilder builder = new StringBuilder();
        builder.append("testautomation \n" + timeStamp);
        builder.append("automation123!");
        File myFile = new File("Test-Result" + File.separator + fileName);
        try {
            FileUtils.writeStringToFile(myFile, builder.toString());
            //FileUtils.writeStringToFile(myFile,content, Charset.defaultCharset());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return fileName;
    }

    }
