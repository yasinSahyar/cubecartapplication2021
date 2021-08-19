package com.seleniummaster.lambdaexpression;

import java.util.function.Predicate;

public class PredicateFunctionDemo1 {
    public static void main(String[] args) {
        //greater than 18
        Predicate<Integer> predicate=p->p>18;
        System.out.println(predicate.test(20));

        Predicate<String> p1=s->(s.length()>5);
        System.out.println(p1.test("Selenium"));

        int a[]={20,40,10,30,100,5};
        Predicate<Integer> p2=p->(p%2==0);
        for(int arr:a){
            if(p2.test(arr)){
                System.out.println(arr);
            }
        }

        for(int arr:a){
            if (p2.negate().test(arr)) {

                System.out.println(arr);
            }
        }

    }
}
