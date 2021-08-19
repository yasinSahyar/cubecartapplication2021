package com.seleniummaster.datatype;

import org.apache.commons.lang3.StringUtils;

public class StringReverse {
    public static void main(String[] args) {
        String school="United,Coder,SDET,Course";
        String language="Java";//avaJ
        String s1="100";

//        for(int i=language.length()-1;i>=0;i--){
//            System.out.print(language.charAt(i)+" ");
//        }
        System.out.println(StringUtils.reverse(language));
        System.out.println(StringUtils.capitalize(language));
        System.out.println(StringUtils.isNumeric(school));
        System.out.println(StringUtils.isEmpty(language));
        System.out.println(StringUtils.isNumeric(s1));//true
        System.out.println(StringUtils.reverseDelimited(school,','));
        System.out.println(StringUtils.reverse(school));





    }
}
