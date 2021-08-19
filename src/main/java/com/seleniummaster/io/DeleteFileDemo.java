package com.seleniummaster.io;

import org.apache.commons.io.FileUtils;

import java.io.File;

public class DeleteFileDemo {
    public static void main(String[] args) {
        //delete an existing file
       boolean isFileDeleted=FileUtils.deleteQuietly(
               new File("Test-Result"+File.separator+"result.txt"));
        System.out.println("File is deleted "+isFileDeleted);
        boolean isFolderDeleted=FileUtils.deleteQuietly(new File("Test-Result"));
        System.out.println("Is Folder deleted "+isFolderDeleted);

    }
}
