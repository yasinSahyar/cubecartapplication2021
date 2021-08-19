package com.seleniummaster.io;

import com.sun.deploy.security.SelectableSecurityManager;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class CompareTwoFile {
    public static void main(String[] args) {
        File file1=new File("Test-Result"+File.separator+"file1.txt");
        File file2=new File("Test-Result"+File.separator+"result.txt");
        String file1Content=null;
        String file2Content=null;
        try {
            file1Content= FileUtils.readFileToString(file1);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
           file2Content=FileUtils.readFileToString(file2);
        } catch (IOException e) {
            e.printStackTrace();
        }

        if(file1Content.equalsIgnoreCase(file2Content)){
            System.out.println("Files are the same");
        }
        else
            System.out.println("Files are different");


    }
}
