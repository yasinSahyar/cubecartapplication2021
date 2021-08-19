package com.seleniummaster.streamapi;

import java.util.*;
import java.util.stream.Collectors;

public class Demo2 {
    public static void main(String[] args) {
        List<String> country=new ArrayList<>();
        country.add("Australia");
        country.add("Canada");
        country.add("Brazil");
        country.add("Spain");
        country.add("France");

        List<String>  sortedValue=country.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedValue);

       List<Integer> numbers= Arrays.asList(2,10,5,100,70,50);
        List<Integer>  sortedValue1=numbers.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(sortedValue1);
       Optional<Integer> minValue=numbers.stream().max(Integer::compareTo);
       System.out.println(minValue.get());



    }
}
