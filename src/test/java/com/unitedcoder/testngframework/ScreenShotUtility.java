package com.unitedcoder.testngframework;

import com.seleniummaster.cubecartautomation.TestBase;
import org.apache.commons.io.FileUtils;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

public class ScreenShotUtility {

    public void takeScreenShot(String folder,String fileName,WebDriver driver){
        DateTime dateTime=new DateTime();
        DateTimeFormatter formatter= DateTimeFormat.forPattern("yyyy-MM-dd-HH-mm-ss");
        String timeStamp=dateTime.toString(formatter);
        fileName=fileName+timeStamp;
        TakesScreenshot screenshot=(TakesScreenshot)driver;
        File screenSHotFile=screenshot.getScreenshotAs(OutputType.FILE);
        File finalFile=new File(folder+File.separator+fileName+".png");
        try {
            FileUtils.copyFile(screenSHotFile,finalFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}