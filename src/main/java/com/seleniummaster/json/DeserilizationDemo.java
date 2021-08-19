package com.seleniummaster.json;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class DeserilizationDemo {
    public static void main(String[] args) {
        ObjectMapper objectMapper=new ObjectMapper();
        Users users=null;
        try {
            users=objectMapper.readValue(new File("Json-Files\\users.json"),Users.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        List<User> user=users.getUser();
        for(User loginUser:user){
            System.out.println(String.format("%s %s %s",
                    loginUser.getUsername(),
                    loginUser.getPassword(),
                    loginUser.getUserType()));
        }
    }
}
