package com.seleniummaster.json;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JsonWriteDemo2 {
    public static void main(String[] args) {
        User user1=new User("testautomation","automation123!","Admin");
        User user2=new User("testautomation1","automation123!","Customer");
        User user3=new User("testautomation2","automation123!","Manager");
        List<User> users=new ArrayList<>();
        users.addAll(Arrays.asList(user1,user2,user3));
        Users listOfUsers=new Users(users);
        ObjectMapper objectMapper=new ObjectMapper();
        String objectValue= null;
        try {
            objectValue = objectMapper.writeValueAsString(listOfUsers);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        try {
            FileUtils.writeStringToFile(new File("Json-Files\\Multiple-Users.json"),objectValue);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
