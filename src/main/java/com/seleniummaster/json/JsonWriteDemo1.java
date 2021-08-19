package com.seleniummaster.json;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class JsonWriteDemo1 {
    public static void main(String[] args) {
        User user=new User("testautomation","automation123!","Admin");
        //serilization
        String userInfo=null;
        ObjectMapper objectMapper=new ObjectMapper();
        try {
            userInfo=objectMapper.writeValueAsString(user);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        try {
            FileUtils.writeStringToFile(new File("Json-Files\\User-Info.json"),userInfo);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
