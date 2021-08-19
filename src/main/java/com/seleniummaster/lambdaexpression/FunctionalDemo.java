package com.seleniummaster.lambdaexpression;

import java.util.function.Function;

public class FunctionalDemo {
    public static void main(String[] args) {
        Function<Integer,Integer> f1=f->f*f;
        System.out.println(f1.apply(10));

        Function<String,Integer> f2=f->f.length();
        System.out.println(f2.apply("Java"));

        Function<Integer,Integer> f3=s->s*3;
        System.out.println(f3.andThen(f1).apply(5));//225
        System.out.println(f3.compose(f1).apply(5));

    }
}
