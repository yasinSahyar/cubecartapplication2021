package com.seleniummaster.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class ReadFromURL {
    public static void main(String[] args) {
        String webSite="https://www.unitedcoder.com";
        URL url= null;
        try {
            url = new URL(webSite);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        BufferedReader reader= null;
        try {
            reader = new BufferedReader(new InputStreamReader(url.openStream()));
        } catch (IOException e) {
            e.printStackTrace();
        }
        String content=null;
        while(true) {
            try {
                if (!((content=reader.readLine())!=null)) break;
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println(content);
        }
        try {
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
