package com.seleniummaster.streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(10,20,7,50,30,60,5);
//        for(int num:list){
//            if(num%2==0){
//                System.out.println(num);
//            }
//        }
        list.stream().filter(s->s%2==0).forEach(System.out::println);

        List<String> names=Arrays.asList("Urumqi","Kashgar","Atush","Ghulja");
        //names.stream().filter(s->s.length()>3&&s.length()<7).forEach(s-> System.out.println(s));
       // names.stream().filter(s->s.length()>3&&s.length()<7).forEach(s-> System.out.println(s));
        List<String> countries=names.stream().filter(s->s.length()>3&&s.length()<7).collect(Collectors.toList());
        System.out.println(countries);

        List<String> country=new ArrayList<>();
        country.add("Australia");
        country.add("Canada");
        country.add("Australia");
        country.add("Brazil");
        country.add("America");
        country.add("Canada");
        country.add("Spain");
        System.out.println(country);
        List<String> c1=country.stream().distinct().collect(Collectors.toList());
        System.out.println(c1);
        long duplicateCount=country.stream().distinct().count();
        System.out.println(duplicateCount);





    }
}
