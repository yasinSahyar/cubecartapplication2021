package com.seleniummaster.io;


public class FileWriteDemo1 {
    public static void main(String[] args) {
        FileUtility fileUtility=new FileUtility();
        StringBuffer stringBuffer=new StringBuffer();
        stringBuffer.append("I love java coding \n");
        stringBuffer.append("Java coding is fun \n");
        stringBuffer.append("Java Selenium Test Automation \n");
        stringBuffer.append("Cubecart add Customer Test Passed \n");
        fileUtility.writeToFile("Test-Result",
                "result"+System.currentTimeMillis(),".txt",stringBuffer.toString());
    }
}
